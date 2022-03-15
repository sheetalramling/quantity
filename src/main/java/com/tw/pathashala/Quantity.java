package com.tw.pathashala;

public class Quantity {

    private final double magnitude;


    public Quantity(double magnitude) {
        this.magnitude = magnitude;

    }

    static Quantity create_meter(double magnitude) {
        return new Quantity(magnitude * 100);
    }

    static Quantity create_centimeter(double magnitude) {
        return new Quantity(magnitude);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        Quantity that = (Quantity) obj;
        return magnitude == that.magnitude;
    }
}
