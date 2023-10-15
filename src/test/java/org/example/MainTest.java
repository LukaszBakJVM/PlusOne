package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main main =new Main();

    @Test
    void plusOne() {
        int[] tab={1,2,3};
        int[]result={1,2,4};
        int[] ints = main.plusOne(tab);
        assertArrayEquals(result,ints);

    }
    @Test
    void plusOne1() {
        int[] tab={4,3,2,1};
        int[]result={4,3,2,2};
        int[] ints = main.plusOne(tab);
        assertArrayEquals(result,ints);

    }
    @Test
    void plusOne2() {
        int[] tab={9};
        int[]result={1,0};
        int[] ints = main.plusOne(tab);
        assertArrayEquals(result,ints);

    }
}