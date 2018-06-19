package uk.co.andymccall.codility;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryGapTest {

    private BinaryGap binaryGapUndertest = new BinaryGap();

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void solution_test_1() {
        assertEquals("BinaryGap.solution has failed!",
                5,
                binaryGapUndertest.solution(1041));
    }

    @Test
    public void solution_test_2() {
        assertEquals("BinaryGap.solution has failed!",
                2,
                binaryGapUndertest.solution(9));
    }

    @Test
    public void solution_test_3() {
        assertEquals("BinaryGap.solution has failed!",
                0,
                binaryGapUndertest.solution(2147483647));
    }

    @Test
    public void solution_test_4() {
        assertEquals("BinaryGap.solution has failed!",
                3,
                binaryGapUndertest.solution(328));
    }
}