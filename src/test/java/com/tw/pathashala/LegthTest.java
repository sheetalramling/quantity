package com.tw.pathashala;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class LengthTest {

    @Test
    void should_equate_1_cm_to_1_cm() {
        Length oneCentimeter = Length.in_centimeter(1);
        Length anotherOneCentimeter = Length.in_centimeter(1);

        assertThat(oneCentimeter, is(equalTo(anotherOneCentimeter)));
    }

    @Test
    void should_not_equate_1_cm_to_2_cm() {
        Length oneCentimeter = Length.in_centimeter(1);
        Length twoCentimeter = Length.in_centimeter(2);

        assertThat(oneCentimeter, is(not(equalTo(twoCentimeter))));
    }

    @Test
    void should_equate_1_m_to_100_cm() {
        Length oneMeter = Length.in_meter(1);
        Length hundredCentimeters = Length.in_centimeter(100);

        assertThat(oneMeter, is(equalTo(hundredCentimeters)));
    }
    @Test
    void should_equate_100_cm_to_0_point_001_km() {
        Length kilometer = Length.in_kilometer(0.001);
        Length hundredCentimeters = Length.in_centimeter(100);

        assertThat(kilometer, is(equalTo(hundredCentimeters)));
    }

}
