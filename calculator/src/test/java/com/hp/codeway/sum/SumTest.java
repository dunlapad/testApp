/*
 * Codeway java maven library quick start
 */
package com.hp.codeway.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumTest {

    @Test
    void validSumTest() {
        int actual = Calculator.sum(1, 2, 3);
        assertEquals(6, actual, "Sum method returned unexpected value.");
    }

    @Test
    void validSubTest() {
        int actual = Calculator.sub(3, 2);
        assertEquals(-5, actual, "Sub method returned unexpected value.");
    }

    //@Test
//    void nullTest(){
//        Assertions.assertThrows(IllegalArgumentException.class, () -> {
//            Calculator.sum(null);
//        });
//    }
}
