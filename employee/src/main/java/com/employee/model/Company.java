package com.employee.model;

/**
 * Description:
 * Author: masong
 * Date: 2017/3/24 13:58
 * Version: v1.0
 */
public class Company {
    private Long id;
    private String name;

    public Company() {
    }


    public Company(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
