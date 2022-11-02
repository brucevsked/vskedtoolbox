package com.jat.system2.model;

public class Navigation {

    private Long id;
    private String name;
    private Integer level;
    private String address;
    private Navigation parent;

    public Navigation(Long id, String name, String address, Navigation parent) {
        this.id = id;
        this.name = name;
        this.level=getLevel();
        this.address = address;
        this.parent = parent;
    }

    public Integer getLevel() {
        return parent==null?1: parent.getLevel()+1;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Navigation getParent() {
        return parent;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", level=" + level +
                ", address='" + address + '\'' +
                ", parent=" + parent +
                '}';
    }
}
