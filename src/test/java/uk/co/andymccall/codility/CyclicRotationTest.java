package uk.co.andymccall.codility;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CyclicRotationTest {

    CyclicRotation cyclicRotationUnderTest = new CyclicRotation();

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void solution_test_1() {
        int[] testArray = {3,8,9,7,6};
        int testRotations = 3;
        Assert.assertArrayEquals("CyclicRotation.solution has failed!",
                new int[] {9,7,6,3,8},
                cyclicRotationUnderTest.solution(testArray,testRotations));    }
}