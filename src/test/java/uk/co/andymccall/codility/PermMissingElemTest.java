package uk.co.andymccall.codility;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PermMissingElemTest {

    PermMissingElem permMissingElemUnderTest = new PermMissingElem();

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void solution_test_1() {
        int test[]={2,3,1,5};
        Assert.assertEquals("PermMissingElem.solution has failed!",
                4,
                permMissingElemUnderTest.solution(test));

    }

    @Test
    public void solution_test_2() {
        int test[]={7,4,3,2,5,1};
        Assert.assertEquals("PermMissingElem.solution has failed!",
                6,
                permMissingElemUnderTest.solution(test));

    }

    @Test
    public void solution_test_3() {
        int test[]={};
        Assert.assertEquals("PermMissingElem.solution has failed!",
                1,
                permMissingElemUnderTest.solution(test));

    }

    @Test
    public void solution_test_4() {
        int test[]={1};
        Assert.assertEquals("PermMissingElem.solution has failed!",
                2,
                permMissingElemUnderTest.solution(test));

    }

}