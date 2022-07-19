package com.platzi.market.domain;

import com.platzi.market.persistence.entity.Compra;
import com.platzi.market.persistence.entity.ComprasProductoPK;
import com.platzi.market.persistence.entity.Producto;

public class BuyesProductDto {

    private ComprasProductoPK id;

    private Integer stock;

    private Double total;

    private Boolean active;

    private Producto product;

    private Compra buy;

    public ComprasProductoPK getId() {
        return id;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Producto getProduct() {
        return product;
    }

    public void setProduct(Producto product) {
        this.product = product;
    }

    public Compra getBuy() {
        return buy;
    }

    public void setBuy(Compra buy) {
        this.buy = buy;
    }

    public void setId(ComprasProductoPK id) {
        this.id = id;
    }
}
