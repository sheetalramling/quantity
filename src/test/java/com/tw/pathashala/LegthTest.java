package com.tw.pathashala;

import org.junit.jupiter.api.Test;

import static com.tw.pathashala.Length.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class LengthTest {


    @Test
    void should_equate_1_cm_to_1_cm() {
         Length oneCentimeter=in_centimeter(1);
         Length anotherOneCentimeter = in_centimeter(1);

        assertThat(oneCentimeter, is(equalTo(anotherOneCentimeter)));
    }

    @Test
    void should_not_equate_1_cm_to_2_cm() {
        Length oneCentimeter = in_centimeter(1);
        Length twoCentimeter = in_centimeter(2);

        assertThat(oneCentimeter, is(not(equalTo(twoCentimeter))));
    }


    @Test
    void should_equate_100_cm_to_1_m() {
        Length hundredCentimeter = in_centimeter(100);
        Length oneMeter = in_meter(1);

        assertThat(hundredCentimeter, is(equalTo(oneMeter)));
    }

    @Test
    void should_equate_100_cm_to_0_Point_001_km() {
        Length hundredCentimeter = in_centimeter(100);
        Length kilometer = in_kilometer(0.001);

        assertThat(hundredCentimeter, is(equalTo(kilometer)));
    }


}
