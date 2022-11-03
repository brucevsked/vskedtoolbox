package com.jat.system2.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.List;

public class UserRoleNavigationTest {

    private static final Logger log = LoggerFactory.getLogger(UserRoleNavigationTest.class);

    private RoleNavigation roleNavigationAdmin;
    private RoleNavigation roleNavigationUser;

    @BeforeTest
    public void initRoleNavigation(){
        List<Navigation> navigations1=new LinkedList<>();
        List<Navigation> navigations2=new LinkedList<>();

        Navigation navigation1=new Navigation(1L,"系统配置","/system",null);
        Navigation navigation2=new Navigation(2L,"导航","/system/navigation",navigation1);
        Navigation navigation3=new Navigation(3L,"角色","/system/role",navigation1);
        Navigation navigation4=new Navigation(4L,"用户","/system/user",navigation1);

        Navigation navigation5=new Navigation(5L,"业务","/business",null);
        Navigation navigation6=new Navigation(6L,"新闻类型","/business/newsType",navigation5);
        Navigation navigation7=new Navigation(7L,"新闻","/business/news",navigation5);

        navigations1.add(navigation1);
        navigations1.add(navigation2);
        navigations1.add(navigation3);
        navigations1.add(navigation4);

        navigations2.add(navigation5);
        navigations2.add(navigation6);
        navigations2.add(navigation7);

        Role roleAdmin=new Role(1L,"超级管理员");
        Role roleUser=new Role(2L,"业务员");

        roleNavigationAdmin=new RoleNavigation(roleAdmin,navigations1);
        roleNavigationUser=new RoleNavigation(roleUser,navigations2);
        log.debug("finish init role navigation");
    }

    @Test
    public void adminRoleTest(){
        List<Navigation> navigations=roleNavigationAdmin.getNavigations();
        log.debug("超级管理员拥有以下权限：");
        for(Navigation navigation:navigations){
            log.debug("{}",navigation);
        }

        log.debug("------------------------------");
    }

    @Test
    public void userRoleTest(){
        List<Navigation> navigations=roleNavigationUser.getNavigations();
        log.debug("业务员拥有以下权限：");
        for(Navigation navigation:navigations){
            log.debug("{}",navigation);
        }

        log.debug("------------------------------");
    }
}
