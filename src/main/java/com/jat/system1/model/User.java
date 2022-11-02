package com.jat.system1.model;

public class User {

    //auto increase in database
    private UserId id;
    private UserName name;
    private UserPassword password;

    public User(Long id, String name, String password) {
        this.id = new UserId(id);
        this.name = new UserName(name);
        this.password = new UserPassword(password);
    }

    public UserId getId() {
        return id;
    }

    public UserName getName() {
        return name;
    }

    public UserPassword getPassword() {
        return password;
    }
}
