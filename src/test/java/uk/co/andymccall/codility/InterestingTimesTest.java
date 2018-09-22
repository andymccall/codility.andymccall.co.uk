package uk.co.andymccall.codility;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InterestingTimesTest {

    InterestingTimes interestingTimesUnderTest = new InterestingTimes();

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void solution_test_1() {
        Assert.assertEquals("",3,interestingTimesUnderTest.solution("11:00:00","11:00:10"));
    }

    @Test
    public void solution_test_2() {
        Assert.assertEquals("",3,interestingTimesUnderTest.solution("22:22:21","22:22:23"));
    }

    @Test
    public void solution_test_3() {
        Assert.assertEquals("",1,interestingTimesUnderTest.solution("15:15:00","15:15:12"));
    }

}