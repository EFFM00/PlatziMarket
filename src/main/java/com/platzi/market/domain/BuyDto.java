package com.platzi.market.domain;

import com.platzi.market.persistence.entity.Cliente;
import com.platzi.market.persistence.entity.ComprasProducto;
import com.platzi.market.persistence.entity.Producto;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class BuyDto {

    private Long buyId;
    private String clientId;
    private LocalDateTime date;
    private String active;
    private String paymentMethod;

    private Cliente client;

    public Long getBuyId() {
        return buyId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setBuyId(Long buyId) {
        this.buyId = buyId;
    }

    public Cliente getClient() {
        return client;
    }

    public void setClient(Cliente client) {
        this.client = client;
    }
}
