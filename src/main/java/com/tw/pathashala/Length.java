package com.tw.pathashala;



public class Length {

    public static final int METER_TO_CENTIMETER = 100;
    public static final int KILOMETER_TO_CENTIMETER = 100000;
    private final double magnitude;


    public Length(double magnitude) {
        this.magnitude = magnitude;

    }

    public static Length in_meter(double magnitude) {
        return new Length(magnitude * METER_TO_CENTIMETER);
    }

    public static Length in_centimeter(double magnitude) {
        return new Length(magnitude);
    }

    public static Length in_kilometer(double magnitude) {
        return new Length(magnitude* KILOMETER_TO_CENTIMETER);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        Length that = (Length) obj;
        return magnitude == that.magnitude;
    }
}
