package uk.co.andymccall.codility;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SiblingsTest {

    private Siblings siblingsUnderTest = new Siblings();

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void solution_test_1() {
        Assert.assertEquals("Siblings.solution has failed!",
                321,
                siblingsUnderTest.solution(213));
    }

    @Test
    public void solution_test_2() {
        Assert.assertEquals("Siblings.solution has failed!",
                553,
                siblingsUnderTest.solution(553));
    }

    @Test
    public void solution_test_3() {
        Assert.assertEquals("Siblings.solution has failed!",
                0,
                siblingsUnderTest.solution(0));
    }

    @Test
    public void solution_test_4() {
        Assert.assertEquals("Siblings.solution has failed!",
                8642,
                siblingsUnderTest.solution(8264));
    }

    @Test
    public void solution_test_5() {
        Assert.assertEquals("Siblings.solution has failed!",
                1,
                siblingsUnderTest.solution(1));
    }

}