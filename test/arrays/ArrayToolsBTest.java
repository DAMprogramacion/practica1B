package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayToolsBTest {
    //crear test
    @Test
    void getSubstractOrSum() {
    }
    //crear metodo countNumberOfZeros de acuerdo a los test
    @Test
    void countNumberOfZeros() {
        assertNull(ArrayToolsB.countNumberOfZeros(null));
        assertEquals(0, ArrayToolsB.countNumberOfZeros(new int[]{}));
        assertEquals(0, ArrayToolsB.countNumberOfZeros(new int[]{1,2}));
        assertEquals(1, ArrayToolsB.countNumberOfZeros(new int[]{1,0,2}));
        assertEquals(2, ArrayToolsB.countNumberOfZeros(new int[]{0,1,0,2}));
    }
   //crear test
    @Test
    void isSeemItems() {
    }
    //crear metodo changeOrderArray de acuerdo a los test
    @Test
    void changeOrderArray() {
        assertNull(ArrayToolsB.changeOrderArray(null));
        assertArrayEquals(new String[]{}, ArrayToolsB.changeOrderArray(new String[]{}));
        assertArrayEquals(new String[]{""}, ArrayToolsB.changeOrderArray(new String[]{""}));
        assertArrayEquals(new String[]{"hola"}, ArrayToolsB.changeOrderArray(new String[]{"hola"}));
        assertArrayEquals(new String[]{"hola","adios"}, ArrayToolsB.changeOrderArray(new String[]{"adios","hola"}));
        assertArrayEquals(new String[]{"hola","ok","adios"}, ArrayToolsB.changeOrderArray(new String[]{"adios","ok","hola"}));
    }
}