package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraysTest extends Arrays {

    @Test
    void testEqualityOfTwoGivenArrays() {
        Arrays arrays = new Arrays();

        int[] array1 = {1,4,6,8};
        int[] array2 = {6,4,8,1};

        java.util.Arrays.sort(array2);
        assertArrayEquals(array1,array2);
    }

    @Test
    void testArraySortingNullException() {
            Arrays arrays = new Arrays();

            assertThrows(NullPointerException.class,() -> {
                arrays.arraySorting(null);
            });


    }
}