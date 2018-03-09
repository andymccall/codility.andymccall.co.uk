package uk.co.andymccall.codility;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PyramidTest {

    Pyramid pyramidUnderTest = new Pyramid();

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void solution_test_1() {
        pyramidUnderTest.solution(9);
    }
}