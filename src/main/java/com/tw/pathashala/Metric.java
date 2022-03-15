package com.tw.pathashala;

enum Metric{
    CENTIMETER(1),
    METER(100),
    KILOMETER(100000);
    private final int baseUnit ;


    Metric(int baseUnit){
       this.baseUnit =baseUnit;
    }


    /*@Override
    public String toString() {
        return String.valueOf(baseUnit);
    }*/
}

