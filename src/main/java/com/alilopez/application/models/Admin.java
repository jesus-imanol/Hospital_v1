package com.alilopez.application.models;

public class Admin {
    private String user;
    private String password;

    public Admin() {
        this.user = "Jesus";
        this.password = "Cast";
    }


    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
