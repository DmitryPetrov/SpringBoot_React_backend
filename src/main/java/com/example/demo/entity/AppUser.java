package com.example.demo.entity;

public class AppUser {

    private  String userName;

    public AppUser() {
        this("defaultName");
    }

    public AppUser(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
