package com.zar.demo.pojo;

import java.util.Date;

public class ArticleCategory {
    private Long id;

    private Long categoryIf;

    private Long articleId;

    private Date createBy;

    private Date modifyBy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCategoryIf() {
        return categoryIf;
    }

    public void setCategoryIf(Long categoryIf) {
        this.categoryIf = categoryIf;
    }

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
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