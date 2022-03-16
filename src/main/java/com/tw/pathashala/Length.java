package com.tw.pathashala;

import static com.tw.pathashala.Metric.*;

public class Length {

    private final double magnitude;
    Metric metric;

    private Length(double magnitude, Metric metric) {
        this.magnitude = magnitude;
        this.metric = metric;
    }

    public static Length inCentimeter(double magnitude) {
        return new Length(magnitude, CENTIMETER);
    }

    public static Length inMeter(double magnitude) {
        return new Length(magnitude, METER);
    }

    public static Length inKilometer(double magnitude) {
        return new Length(magnitude, KILOMETER);
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

    public Length add(Length length) {
        double convertedBaseUnitValue=metric.convertToBaseUnit(length.magnitude,length);
        return new Length(magnitude + metric.converter(convertedBaseUnitValue,metric),metric);


    }

    public Length subtract(Length length) {
        double convertedBaseUnitValue=metric.convertToBaseUnit(length.magnitude, length);
        return new Length(magnitude  - metric.converter(convertedBaseUnitValue,metric),metric);

    }
}

