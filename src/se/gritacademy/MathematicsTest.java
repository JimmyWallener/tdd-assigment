package se.gritacademy;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.DoubleStream;


import static org.junit.jupiter.api.Assertions.assertEquals;

class MathematicsTest {

    Mathematics math = new Mathematics();

    @org.junit.jupiter.api.Test
    void testMinLong() {
        assertEquals(1000000000L,math.minLong(2000000000L,1000000000L));
    }

    @org.junit.jupiter.api.Test
    void testMinFloat() {
        assertEquals(1.2345f,math.minFloat(3.212f,1.2345f));
    }

    @org.junit.jupiter.api.Test
    void testMinInteger() {
        assertEquals(123,math.minInteger(273273,123));
    }

    @org.junit.jupiter.api.Test
    void testMinDouble() {
        assertEquals(12.00d,math.minDouble(16.02d,12.00d));
    }

    @org.junit.jupiter.api.Test
    void testPowerOff() {
        assertEquals(36.00d,math.powerOff(6.00d,2.00d));
    }

    @org.junit.jupiter.api.Test
    void testValueIntegerPlusOne() {
        assertEquals(4, math.valueIntegerPlusOne(3));
    }

    @org.junit.jupiter.api.Test
    void testValueLongPlusOne() {
        assertEquals(3000000001L,math.valueLongPlusOne(3000000000L));
    }
    @org.junit.jupiter.api.Test
    void testValueIntegerMinusOne() {
        assertEquals(2, math.valueIntegerMinusOne(3));
    }

    @org.junit.jupiter.api.Test
    void testValueLongMinusOne() {
        assertEquals(2999999999L,math.valueLongMinusOne(3000000000L));
    }

    @org.junit.jupiter.api.Test
    void testSquaredOff() {
        assertEquals(6.00d,math.squaredOff(36.00d));
    }

    @org.junit.jupiter.api.Test
    void testCubicValueOff() {
        assertEquals(4.932424148660941d, math.cubicValueOff(120.00));

    }
    
    @ParameterizedTest
    @MethodSource("randomNumber")
    void randomValue(double number) {
        Assertions.assertTrue(number < 10);
        
    }
    static DoubleStream randomNumber(){
        return DoubleStream.of(Math.random() * 10);
    }
}