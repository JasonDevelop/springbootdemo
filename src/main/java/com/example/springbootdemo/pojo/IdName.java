package com.example.springbootdemo.pojo;

public class IdName {
    int id;
    String name;

    public IdName(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public IdName() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
