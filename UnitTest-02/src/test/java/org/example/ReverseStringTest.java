package org.example;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest extends ReverseString {

    @org.junit.jupiter.api.Test
    void testReverseString() {

        ReverseString string = new ReverseString();


        assertEquals(string.reverseString("hello"),"oleh","not a correct output");
    }
}