package com.tw.pathashala;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class QuantityTest {

    @Test
    void should_equate_1_cm_to_1_cm() {
        Quantity oneCentimeter = new Quantity(1);
        Quantity anotherOneCentimeter = new Quantity(1);

        assertThat(oneCentimeter, is(equalTo(anotherOneCentimeter)));
    }

    @Test
    void should_not_equate_1_cm_to_2_cm() {
        Quantity oneCentimeter = new Quantity(1);
        Quantity twoCentimeter = new Quantity(2);

        assertThat(oneCentimeter, is(not(equalTo(twoCentimeter))));
    }

    @Test
    void should_equate_1_m_to_100_cm() {
        Quantity oneMeter = Quantity.create_meter(1);
        Quantity hundredCentimeters = Quantity.create_centimeter(100);

        assertThat(oneMeter, is(equalTo(hundredCentimeters)));

    }


}
