package com.zar.demo.pojo;

import java.util.Date;

public class CategoryInfo {
    private Long id;

    private String name;

    private Date createBy;

    private Date modifyBy;

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
        this.name = name == null ? null : name.trim();
    }

    public Date getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Date createBy) {
        this.createBy = createBy;
    }

    public Date getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(Date modifyBy) {
        this.modifyBy = modifyBy;
    }
}