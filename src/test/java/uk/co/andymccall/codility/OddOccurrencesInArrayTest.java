package uk.co.andymccall.codility;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OddOccurrencesInArrayTest {

    OddOccurrencesInArray oddOccurrencesInArrayUnderTest = new OddOccurrencesInArray();

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void solution_test_1() {
        int test[]={9,3,9,3,9,7,9};
        Assert.assertEquals("OddOccurrencesInArray.solution has failed!",
                7,
                oddOccurrencesInArrayUnderTest.solution(test));

    }

    @Test
    public void solution_test_2() {
        int test[]={9,3,9,3,2,4,6,9,7,9};
        Assert.assertEquals("OddOccurrencesInArray.solution has failed!",
                7,
                oddOccurrencesInArrayUnderTest.solution(test));

    }
}