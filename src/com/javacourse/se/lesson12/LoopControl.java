package com.javacourse.se.lesson12;

import com.javacourse.se.lesson11.OperatorSwitch;

public class LoopControl {

    boolean value = true;
    int a =5, b = 7;

    public void foo(){

       do {
           a++;
           System.out.println(a);
       } while (a<b);

    }
}
