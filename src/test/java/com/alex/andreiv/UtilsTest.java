package com.alex.andreiv;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    @Test
    void isDividerFor() {
        assertThrows(ArithmeticException.class, () -> Utils.isDividerFor(0, 123) );
        assertTrue(Utils.isDividerFor(2, 4));
        assertTrue(Utils.isDividerFor(9, 27));
        assertTrue(Utils.isDividerFor(14, 28));
        assertTrue(Utils.isDividerFor(2, 168));
        assertTrue(Utils.isDividerFor(3, 3*56));
        assertFalse(Utils.isDividerFor(2, 0));
        assertFalse(Utils.isDividerFor(2, 5));
        assertFalse(Utils.isDividerFor(3, 55));
    }

    @Test
    void isPrime() {
        assertFalse(Utils.isPrime(0));
        assertFalse(Utils.isPrime(1));
        assertTrue(Utils.isPrime(2));
        assertTrue(Utils.isPrime(3));
        assertFalse(Utils.isPrime(4));
        assertTrue(Utils.isPrime(1987));
    }
}