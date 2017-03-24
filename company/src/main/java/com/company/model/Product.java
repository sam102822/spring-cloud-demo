package com.company.model;

/**
 * Description:
 * Author: masong
 * Date: 2017/3/24 14:11
 * Version: v1.0
 */
public class Product {

    private Long id;
    private Long companyId;
    private String sku;

    public Product() {
    }

    public Product(Long id, Long companyId, String sku) {
        this.id = id;
        this.companyId = companyId;
        this.sku = sku;
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

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }
}
