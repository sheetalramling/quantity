package com.tw.pathashala;

import static com.tw.pathashala.Metric.*;

public class Length {

    private final double magnitude;
    private final Metric metric;

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
        double magnitude1= metric.convertToBaseUnit(this.magnitude,this.metric);
        double magnitude2= metric.convertToBaseUnit(that.magnitude,that.metric);
        return magnitude1==magnitude2;
    }

    public Length plus(Length length) {
        double convertedBaseUnitValue=metric.convertToBaseUnit(length.magnitude,length.metric);
        return new Length(magnitude + metric.converter(convertedBaseUnitValue,metric),metric);


    }

    public Length minus(Length length) {
        double convertedBaseUnitValue=metric.convertToBaseUnit(length.magnitude,length.metric);
        return new Length(magnitude  - metric.converter(convertedBaseUnitValue,metric),metric);

    }
}

