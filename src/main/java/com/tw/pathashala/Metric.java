package com.tw.pathashala;

enum Metric {
    CENTIMETER(1), METER(100), KILOMETER(100000);

    private final int unit;


    Metric(int unit) {
        this.unit = unit;
    }


    public double convertToBaseUnit(double magnitude, Metric metric) {
        return magnitude*metric.unit;
    }

    public double converter(double magnitude, Metric metric) {
        return magnitude/metric.unit;
    }
}

