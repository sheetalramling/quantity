package com.tw.pathashala;

public class LengthConversions {
    private static final int METER_TO_CENTIMETER = 100;
    public static final int KILOMETER_TO_CENTIMETER = 100000;

    public static Length in_meter(double magnitude) {
        return new Length(magnitude * METER_TO_CENTIMETER, Metric.CENTIMETER);
    }

    public static Length in_centimeter(double magnitude) {
        return new Length(magnitude*1, Metric.CENTIMETER);
    }

    public static Length in_kilometer(double magnitude) {
        return new Length(magnitude* KILOMETER_TO_CENTIMETER, Metric.CENTIMETER);
    }
}
