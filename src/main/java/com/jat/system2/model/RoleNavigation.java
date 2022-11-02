package com.jat.system2.model;

public class RoleNavigation {
    private Role role;
    private Navigation navigation;

    public RoleNavigation(Role role, Navigation navigation) {
        this.role = role;
        this.navigation = navigation;
    }

    public Role getRole() {
        return role;
    }

    public Navigation getNavigation() {
        return navigation;
    }

    @Override
    public String toString() {
        return "{" +
                "role=" + role +
                ", navigation=" + navigation +
                '}';
    }
}
