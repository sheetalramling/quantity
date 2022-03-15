package com.tw.pathashala;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class QuantityTest {

    @Test
    void should_equate_1_cm_to_1_cm() {
        Quantity oneCentimeter = new Quantity(1, "Cm");
        Quantity anotherOneCentimeter = new Quantity(1, "Cm");

        assertThat(oneCentimeter, is(equalTo(anotherOneCentimeter)));
    }

    @Test
    void should_not_equate_1_cm_to_2_cm() {
        Quantity oneCentimeter = new Quantity(1, "Cm");
        Quantity twoCentimeter = new Quantity(2, "Cm");

        assertThat(oneCentimeter, is(not(equalTo(twoCentimeter))));
    }

    @Test
    void should_equate_1_m_to_100_cm() {
        Quantity oneMetre = new Quantity(1, "m");
        Quantity hundredCentimeters = new Quantity(100, "cm");


        assertThat(oneMetre, is(equalTo(hundredCentimeters)));

    }


}
