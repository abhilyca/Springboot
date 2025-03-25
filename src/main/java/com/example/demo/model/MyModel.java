package com.example.demo.model;

public class MyModel {
    private int id;
    private String name;

    public MyModel(int id, String name){
        this.id = id;
        this.name=name;
    }

    public int getId() {
        return id;
    }
    public String getName(){
        return name;
    }
}
