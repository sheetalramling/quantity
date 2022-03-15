package com.tw.pathashala;

public class Length {


    private final double magnitude;
    private static Metric metric;

    public Length(double magnitude, Metric metric) {
        this.magnitude = magnitude;
        this.metric=metric;
    }

    public static Length in_centimeter(int magnitude) {
        return new Length(magnitude,Metric.CENTIMETER);
    }

    public static Length in_meter(int magnitude) {
        return new Length(magnitude*100 ,Metric.METER);
    }

    public static Length in_kilometer(double magnitude) {
        return new Length(magnitude*100000 ,Metric.KILOMETER);
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
        //System.out.println(that.metric);
        //System.out.println(that.metric);
        return magnitude == that.magnitude;
    }
}
