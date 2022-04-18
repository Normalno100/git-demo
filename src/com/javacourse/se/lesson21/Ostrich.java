package com.javacourse.se.lesson21;

public class Ostrich extends Birds{


    public Ostrich(String name) {
        super(name);
    }

    public void hideHead(){

        System.out.println("I'm Ostrich and I'm scared");
    }

    public void walk(String str){
        System.out.println("Ho-ho-ho"+str);
    }
}
