package com.jat.system1.model;

import org.mockito.Mockito;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserTest {

    private static final Logger log = LoggerFactory.getLogger(UserTest.class);

    @Test
    public void create(){
        User user= Mockito.mock(User.class);

        UserId id=Mockito.mock(UserId.class);
        Mockito.when(id.getId()).thenReturn(1L);

        Mockito.when(user.getId()).thenReturn(id);

        UserName name=Mockito.mock(UserName.class);
        Mockito.when(name.getName()).thenReturn("admin");

        Mockito.when(user.getName()).thenReturn(name);

        UserPassword password=Mockito.mock(UserPassword.class);
        Mockito.when(password.getPassword()).thenReturn("123456");

        Mockito.when(user.getPassword()).thenReturn(password);

        User userInput=new User(1L,"admin","123456");

        Assert.assertEquals(userInput.getId().getId(),user.getId().getId());
        Assert.assertEquals(userInput.getName().getName(),user.getName().getName());
        Assert.assertEquals(userInput.getPassword().getPassword(),user.getPassword().getPassword());
        log.debug(" test ok");

    }
}
