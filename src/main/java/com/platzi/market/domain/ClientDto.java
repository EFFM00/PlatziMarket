package com.platzi.market.domain;

public class ClientDto {

    private String clientId;
    private String name;
    private String lastname;
    private String email;

    public String getClientId() {
        return clientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }


}
