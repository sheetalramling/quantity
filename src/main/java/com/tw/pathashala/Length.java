package com.tw.pathashala;

import static com.tw.pathashala.Metric.*;

public class Length {

    private final double magnitude;
    Metric metric;

    private Length(double magnitude,Metric metric) {
        this.magnitude = magnitude;
        this.metric=metric;
    }

    public static Length in_centimeter(int magnitude) {
        return new Length(magnitude ,CENTIMETER);
    }

    public static Length in_meter(int magnitude) {
        return new Length(magnitude,METER);
    }

    public static Length in_kilometer(double magnitude) {
        return new Length(magnitude,KILOMETER);
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
        double unit_1=this.metric.getUnit()*this.magnitude;
        double unit_2=that.metric.getUnit()*that.magnitude;
        return unit_1==unit_2;
    }
}
