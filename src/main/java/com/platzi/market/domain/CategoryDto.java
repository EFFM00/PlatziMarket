package com.platzi.market.domain;

public class CategoryDto {

    private Long categoryId;
    private String category;
    private Boolean active;

    public Long getCategoryId() {
        return categoryId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
}
