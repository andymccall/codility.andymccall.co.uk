package uk.co.andymccall.codility;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BeautifulOrchardTest {

    private BeautifulOrchard beautifulOrchardUnderTest = new BeautifulOrchard();

    @Test
    public void solution_test_1() {
        Integer test[]={6,1,4,6,3,2,7,4};
        Assert.assertEquals("BeautifulOrchard.solution() has failed",
                24,beautifulOrchardUnderTest.solution(test,3,2));
    }

    @Test
    public void solution_test_2() {
        Integer test[]={10,9,15};
        Assert.assertEquals("BeautifulOrchard.solution() has failed",
                -1,beautifulOrchardUnderTest.solution(test,2,2));
    }

    @Test
    public void solution_test_3() {
        Integer test[]={50,50,50,999,49,49,49};
        Assert.assertEquals("BeautifulOrchard.solution() has failed",
                1198,beautifulOrchardUnderTest.solution(test,3,2));
    }

    @Test
    public void solution_test_4() {
        Integer test[]={0,0,0,0,0,0};
        Assert.assertEquals("BeautifulOrchard.solution() has failed",
                0,beautifulOrchardUnderTest.solution(test,3,2));
    }

    @Test
    public void solution_test_5() {
        Integer test[]={0,0};
        Assert.assertEquals("BeautifulOrchard.solution() has failed",
                -1,beautifulOrchardUnderTest.solution(test,3,2));
    }

    @Test
    public void solution_test_6() {
        Integer test[]={-9,-8,-3,-9,-9,-4};
        Assert.assertEquals("BeautifulOrchard.solution() has failed",
                0,beautifulOrchardUnderTest.solution(test,3,2));
    }

}