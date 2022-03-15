package com.tw.pathashala;

public class Quantity {

    private final double magnitude;
    private final String metric;

    public Quantity(double magnitude, String metric) {
        this.magnitude = magnitude;
        this.metric = metric;
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
        if (metric != that.metric) {

            if (metric.equals("m") && that.metric.equals("cm")) {
                return 100 * magnitude == that.magnitude;
            }


        }
        return magnitude == that.magnitude;
    }
}
