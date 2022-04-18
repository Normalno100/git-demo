package com.javacourse.se.lesson10;

public class ControlOperators {

    int a = 7, b = 7;
    boolean value = false;

    public void foo() {

        if (value) {
            System.out.println("True");
            a++;
            if(a<b){
                System.out.println("YES");
            }
        } else if(b > a){
            System.out.println("False");
        } else{
            System.out.println("AAAAAAAA");
        }
    }


}
