package se.gritacademy;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.DoubleStream;


import static org.junit.jupiter.api.Assertions.assertEquals;


class MathematicsTest {

    Mathematics math = new Mathematics();

    @Test
    void testMinLong() {
        assertEquals(1000000000L,math.minLong(2000000000L,1000000000L));
    }

    @Test
    void testMinFloat() {
        assertEquals(1.2345f,math.minFloat(3.212f,1.2345f));
    }

    @Test
    void testMinInteger() {
        assertEquals(123,math.minInteger(273273,123));
    }

    @Test
    void testMinDouble() {
        assertEquals(12.00d,math.minDouble(16.02d,12.00d));
    }

    @Test
    void testPowerOff() {
        assertEquals(36.00d,math.powerOff(6.00d,2.00d));
    }

    @Test
    void testValueIntegerPlusOne() {
        assertEquals(4, math.valueIntegerPlusOne(3));
    }

    @Test
    void testValueLongPlusOne() {
        assertEquals(3000000001L,math.valueLongPlusOne(3000000000L));
    }
    @Test
    void testValueIntegerMinusOne() {
        assertEquals(2, math.valueIntegerMinusOne(3));
    }

    @Test
    void testValueLongMinusOne() {
        assertEquals(2999999999L,math.valueLongMinusOne(3000000000L));
    }

    @Test
    void testSquaredOf() {
        assertEquals(6.00d,math.squaredOf(36.00d));
    }

    @Test
    void testCubicValueOf() {
        assertEquals(4.932424148660941d, math.cubicValueOf(120.00d));

    }

    /*
    *  setting delta at 0.9d so that run time ends at some point
    *  set MathematicsTest.randomValue[*] in configuration for endless loop until failure
    */

    @ParameterizedTest
    @MethodSource("randomNumber")
    void randomValue(double number) {
        assertEquals(0.0d,number,0.9d);
        System.out.println(number);
    }
    static DoubleStream randomNumber(){
        return DoubleStream.of(Math.random());
    }

}