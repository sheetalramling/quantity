package com.tw.pathashala;

enum Metric {
    CENTIMETER(1), METER(100), KILOMETER(100000);

    private final int unit;


    Metric(int unit) {
        this.unit = unit;
    }

    public int getUnit() {
        return unit;
    }

    public double convertToBaseUnit(double magnitude,Length length) {
        return magnitude*length.metric.getUnit();
    }

    public double converter(double magnitude, Metric metric) {
        return magnitude/metric.getUnit();
    }
}

