package com.jat.system2.model;

import java.util.List;

public class RoleNavigation {
    private Role role;
    private List<Navigation> navigations;

    public RoleNavigation(Role role, List<Navigation> navigations) {
        this.role = role;
        this.navigations = navigations;
    }

    public Role getRole() {
        return role;
    }

    public List<Navigation> getNavigations() {
        return navigations;
    }
}
