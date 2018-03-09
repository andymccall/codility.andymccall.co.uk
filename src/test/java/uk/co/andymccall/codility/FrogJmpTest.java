package uk.co.andymccall.codility;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FrogJmpTest {

    FrogJmp frogJmpUnderTest = new FrogJmp();

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void solution_test_1() {
        Assert.assertEquals("    FrogJmp.solution has failed!",
                3,
                frogJmpUnderTest.solution(10,85,30));

    }
}