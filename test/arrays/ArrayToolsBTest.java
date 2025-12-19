package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayToolsBTest {
    //crear test
    @Test
    void getSubstractOrSum() {
        assertNull(ArrayToolsB.getSubstractOrSum(null, '+'));
        assertNull(ArrayToolsB.getSubstractOrSum(new int[] {1,2}, '*'));
        assertEquals(0, ArrayToolsB.getSubstractOrSum(new int[]{}, '+'));
        assertEquals(0, ArrayToolsB.getSubstractOrSum(new int[]{}, '-'));
        assertEquals(6, ArrayToolsB.getSubstractOrSum(new int[]{1,2,3}, '+'));
        assertEquals(-6, ArrayToolsB.getSubstractOrSum(new int[]{1,2,3}, '-'));
        assertEquals(-3, ArrayToolsB.getSubstractOrSum(new int[]{-1,-2}, '+'));
        assertEquals(3, ArrayToolsB.getSubstractOrSum(new int[]{-1,-2}, '-'));
        assertEquals(-3, ArrayToolsB.getSubstractOrSum(new int[]{3}, '-'));
        assertEquals(3, ArrayToolsB.getSubstractOrSum(new int[]{3}, '+'));
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
        assertNull(ArrayToolsB.isSeemItems(null));
        assertFalse(ArrayToolsB.isSeemItems(new int[]{}));
        assertTrue(ArrayToolsB.isSeemItems(new int[]{1}));
        assertFalse(ArrayToolsB.isSeemItems(new int[]{1,2}));
        assertTrue(ArrayToolsB.isSeemItems(new int[]{1,1}));
        assertFalse(ArrayToolsB.isSeemItems(new int[]{1,1,2}));
        assertTrue(ArrayToolsB.isSeemItems(new int[]{1,1,1}));
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