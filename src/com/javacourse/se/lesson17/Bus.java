package com.javacourse.se.lesson17;

public class Bus {
    public String model, color;
    public Engine engine;
    public Transmission transmission;
    public final String SERIAL_NUMBER = "D234AB";
    public final int SERIAL_NUMBER_2 = 23456;

    public void go(){
        System.out.println("GO");
    }

    public void showKm(String km2){
        km2 = km2 +2;
        System.out.println(km2);
    }


}
