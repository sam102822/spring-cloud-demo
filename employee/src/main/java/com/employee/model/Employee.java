package com.employee.model;

/**
 * Description:
 * Author: masong
 * Date: 2017/3/24 14:09
 * Version: v1.0
 */
public class Employee {

    private Long id;
    private Long companyId;
    private String name;

    public Employee() {
    }

    public Employee(Long id, Long companyId, String name) {
        this.id = id;
        this.companyId = companyId;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
