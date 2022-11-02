package com.jat.system1.model;

public class UserId {

    private final Long id;

    public UserId(Long id) {
        if(id==null){
            throw new IllegalArgumentException("用户编号不能为空！");
        }
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String toString() {
        return "" + id;
    }
}
