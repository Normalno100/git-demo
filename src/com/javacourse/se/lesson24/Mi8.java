package com.javacourse.se.lesson24;

public class Mi8 extends Helicopter implements VerticalTakeoff{
    public void fly(){
        System.out.println("Helicopter");
    }

    @Override
    public void verticalTakeoff() {
        System.out.println("Helicopter vertical");
    }
}
