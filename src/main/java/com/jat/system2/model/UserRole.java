package com.jat.system2.model;

public class UserRole {
    private User user;
    private Role role;

    public UserRole(User user, Role role) {
        this.user = user;
        this.role = role;
    }

    public User getUser() {
        return user;
    }

    public Role getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "{" +
                "user=" + user +
                ", role=" + role +
                '}';
    }
}
