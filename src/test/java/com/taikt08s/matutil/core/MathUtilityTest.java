package com.taikt08s.matutil.core;

import com.taikt08s.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilityTest {

    //Cau truc test case: ID|Description|Step/Procedures|Expected Result|Status
    //Test case #1 - Verify getFactorial with n=0
    //Step :
    //          1. Given n=0
    //          2. Call/Invoke getFactorial(n=0)
    //Expected result:
    //                            the method must return 1 as the result of 0!
    //Status: PASSED||FAILED
    @Test
    public void verifyFactorialGivenRightArgument0ReturnOk() {
        assertEquals(1, MathUtility.getFractorial(0));
    }
@Test
    public void verifyFactorialGivenRightArgument1ReturnOk() {
        assertEquals(1, MathUtility.getFractorial(1));
    }
    @Test
    public void verifyFactorialGivenRightArgument2ReturnOk() {
        assertEquals(2, MathUtility.getFractorial(2));
    }
}
