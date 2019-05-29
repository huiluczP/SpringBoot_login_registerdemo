package com.example.logindemo.model;

public class User {
    private Integer id;
    private String name;
    private String pwd;
    private String email;
    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getPwd() {
        return pwd;
    }
    public String getEmail() {
        return email;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
