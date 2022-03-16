package com.tw.pathashala;

import org.junit.jupiter.api.Test;
import static com.tw.pathashala.Length.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


class LengthTest {


    @Test
    void should_equate_1_cm_to_1_cm() {
        Length oneCentimeter = inCentimeter(1);
        Length anotherOneCentimeter = inCentimeter(1);

        assertThat(oneCentimeter, is(equalTo(anotherOneCentimeter)));
    }

    @Test
    void should_not_equate_1_cm_to_2_cm() {
        Length oneCentimeter = inCentimeter(1);
        Length twoCentimeter = inCentimeter(2);

        assertThat(oneCentimeter, is(not(equalTo(twoCentimeter))));
    }

    @Test
    void should_equate_100_cm_to_1_m() {
        Length hundredCentimeter = inCentimeter(100);
        Length oneMeter = inMeter(1);

        assertThat(hundredCentimeter, is(equalTo(oneMeter)));
    }

    @Test
    void should_equate_100_cm_to_point_001_km() {
        Length hundredCentimeter = inCentimeter(100);
        Length pointZeroZeroOneKilometer = inKilometer(0.001);

        assertThat(hundredCentimeter, is(equalTo(pointZeroZeroOneKilometer)));
    }

    @Test
    void should_equate_1_m_plus_100_cm_to_2cm() {
        Length oneMeter = inMeter(1);
        Length hundredCentimeter = inCentimeter(100);
        Length twoMeter = inMeter(2);

        Length oneMeterPlusHundredCentimeter = oneMeter.plus(hundredCentimeter);

        assertThat(oneMeterPlusHundredCentimeter, is(equalTo(twoMeter)));
    }

    @Test
    void should_equate_200_cm_plus_1_km_to_100200cm() {
        Length twoHundredCentimeter = inCentimeter(200);
        Length oneKilometer = inKilometer(1);
        Length oneHundredThousandTwoHundred = inCentimeter(100200);

        Length twoHundreCentimeterdPlusOneKilometer = twoHundredCentimeter.plus(oneKilometer);

        assertThat(twoHundreCentimeterdPlusOneKilometer, is(equalTo(oneHundredThousandTwoHundred)));
    }


    @Test
    void should_equate_1_m_minus_50_cm_to_point5_m() {
        Length oneMeter = inMeter(1);
        Length fiftyCentimeter = inCentimeter(50);
        Length pointFiveMeter = inMeter(0.5);

        Length oneMeterMinusFiftyCentimeter = oneMeter.minus(fiftyCentimeter);

        assertThat(oneMeterMinusFiftyCentimeter, is(equalTo(pointFiveMeter)));
    }



    @Test
    void should_equate_2000_cm_minus_1_m_to_19000_cm() {
        Length twoThousandCentimeter = inCentimeter(2000);
        Length oneMeter = inMeter(1);
        Length nineteenThousandCentimeter = inCentimeter(1900);

        Length oneMeterMinusNineteenThousandCentimeter = twoThousandCentimeter.minus(oneMeter);

        assertThat(oneMeterMinusNineteenThousandCentimeter, is(equalTo(nineteenThousandCentimeter)));
    }

}
