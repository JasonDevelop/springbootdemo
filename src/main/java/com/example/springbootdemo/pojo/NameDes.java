package com.example.springbootdemo.pojo;

import org.apache.ibatis.annotations.Mapper;

public class NameDes {
    int id;
    String name;
    String des;

    public NameDes(int id, String name, String des) {
        this.id = id;
        this.name = name;
        this.des = des;
    }

    public NameDes() {
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

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    @Override
    public String toString() {
        return "NameDes{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", des='" + des + '\'' +
                '}';
    }
}
