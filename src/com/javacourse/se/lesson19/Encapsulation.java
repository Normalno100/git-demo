package com.javacourse.se.lesson19;

public class Encapsulation {
    public int getA(int i) {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB(int i) {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    private int a, b;

    public int showResult(){
        return a+b;
    }
}
