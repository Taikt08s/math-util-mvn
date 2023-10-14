package com.taikt08s.matutil.core;

import com.taikt08s.mathutil.core.MathUtility;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MathUtilityDDTTest {

    //chuan bi bo data se nhoi vao ham assert()
    // ham tra ve mang 2 chieu sex dung de so sanh n! =? hay khong
    public static Object[][] initData() {
        //int[] a = {5, 10, 15, 20, 25};
        Object[][] testData = {{0, 1}, {1, 1}, {3, 6}, {4, 24}, {5, 120}};
        return testData;
    }
//nhoi data vao ham kiem thu

    @ParameterizedTest
    @MethodSource("initData")
    public void verifyFactorialGivenRightArgumentReturnsOK(int n, long expected) {
        assertEquals(expected, MathUtility.getFractorial(n));
    }
}
