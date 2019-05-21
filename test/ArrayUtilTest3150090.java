// Leivadaros Paraskevas
// 3150090

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArrayUtilTest3150090 {
    @Test
    void NullArray() throws IllegalArgumentException {
        int[] array = null;
        ArrayUtil.reverse(array, 0);
    }

    @Test
    void NegativeStartParameter() throws IllegalArgumentException {
        int[] array = new int[1];
        ArrayUtil.reverse(array, -2);
    }

    @Test
    void InvalidStartParameter() throws IllegalArgumentException {
        int[] array = new int[1];
        ArrayUtil.reverse(array, 1);
    }

    @Test
    void HugeArray() {
        int[] array = new int[123456789];
        ArrayUtil.reverse(array, 1);
        Assertions.assertTrue(ArrayUtil.reverse(array, 1));
    }

    @Test
    void NormalFunction() {
        int[] array = new int[5];
        ArrayUtil.reverse(array, 1);
        Assertions.assertTrue(ArrayUtil.reverse(array, 1));
    }
}