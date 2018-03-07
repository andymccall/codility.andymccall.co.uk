package uk.co.andymccall.codility;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TemperatureAmplitudeTest {

    TemperatureAmplitude temperatureAmplitudeUnderTest = new TemperatureAmplitude();

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void solution_test_1() {
        int test[]={-3,-14,-5,7,8,42,8,3};
        Assert.assertEquals("TemperatureAmplitude.solution has failed!",
                "SUMMER",
                temperatureAmplitudeUnderTest.solution(test));

    }

    @Test
    public void solution_test_2() {
        int test[]={2,-3,3,1,10,8,2,5,13,-5,3,-18};
        Assert.assertEquals("TemperatureAmplitude.solution has failed!",
                "AUTUMN",
                temperatureAmplitudeUnderTest.solution(test));

    }
}