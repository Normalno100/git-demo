package com.javacourse.se.lesson21;

public class Birds {
    public String name;

    public Birds(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void walk(){
        System.out.println("Ho-ho-ho");


    }
}
