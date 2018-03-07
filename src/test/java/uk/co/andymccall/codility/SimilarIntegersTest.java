package uk.co.andymccall.codility;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimilarIntegersTest {

    private SimilarIntegers similarIntegersUnderTest = new SimilarIntegers();

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void solution_test_1() {
        Assert.assertEquals("SimilarIntegers.solution has failed!",
                12,
                similarIntegersUnderTest.solution(1213));
    }

    @Test
    public void solution_test_2() {
        Assert.assertEquals("SimilarIntegers.solution has failed!",
                6,
                similarIntegersUnderTest.solution(123));
    }

    @Test
    public void solution_test_3() {
        Assert.assertEquals("SimilarIntegers.solution has failed!",
                1,
                similarIntegersUnderTest.solution(100));
    }

}