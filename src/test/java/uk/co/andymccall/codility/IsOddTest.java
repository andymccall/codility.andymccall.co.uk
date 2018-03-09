package uk.co.andymccall.codility;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsOddTest {

    IsOdd isOddUnderTest = new IsOdd();

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void isOdd_test_1() {
        Assert.assertTrue("IsOdd.isOdd has failed!", isOddUnderTest.isOdd(3));
    }

    @Test
    public void isOdd_test_2() {
        Assert.assertFalse("IsOdd.isOdd has failed!", isOddUnderTest.isOdd(2));
    }

}