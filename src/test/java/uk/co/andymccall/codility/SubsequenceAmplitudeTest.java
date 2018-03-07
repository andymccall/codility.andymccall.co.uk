package uk.co.andymccall.codility;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SubsequenceAmplitudeTest {

    private SubsequenceAmplitude subsequenceAmplitudeUnderTest = new SubsequenceAmplitude();

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void solution_test_1() {
        int test[]={6,10,6,9,7,8};
        Assert.assertEquals("SubsequenceAmplitude.solution has failed!",
                            3,
                            subsequenceAmplitudeUnderTest.solution(test));
    }

    @Test
    public void solution_test_2() {
        int test[]={9};
        Assert.assertEquals("SubsequenceAmplitude.solution has failed!",
                            0,
                            subsequenceAmplitudeUnderTest.solution(test));
    }

    @Test
    public void solution_test_3() {
        int test[]={0};
        Assert.assertEquals("SubsequenceAmplitude.solution has failed!",
                            0,
                            subsequenceAmplitudeUnderTest.solution(test));
    }

    @Test
    public void solution_test_4() {
        int test[]={};
        Assert.assertEquals("SubsequenceAmplitude.solution has failed!",
                0,
                subsequenceAmplitudeUnderTest.solution(test));
    }

    @Test
    public void solution_test_5() {
        int test[]={6,10,1,2,6,6,7};
        Assert.assertEquals("SubsequenceAmplitude.solution has failed!",
                4,
                subsequenceAmplitudeUnderTest.solution(test));
    }

    @Test
    public void solution_test_6() {
        int test[]={5,6,1,3,2,4};
        Assert.assertEquals("SubsequenceAmplitude.solution has failed!",
                2,
                subsequenceAmplitudeUnderTest.solution(test));
    }

    @Test
    public void solution_test_7() {
        int test[]={5,6,1,3,2,4};
        Assert.assertEquals("SubsequenceAmplitude.solution has failed!",
                2,
                subsequenceAmplitudeUnderTest.solution(test));
    }

    @Test
    public void solution_test_8() {
        int test[]={5,5};
        Assert.assertEquals("SubsequenceAmplitude.solution has failed!",
                0,
                subsequenceAmplitudeUnderTest.solution(test));
    }

}