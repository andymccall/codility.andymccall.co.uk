package uk.co.andymccall.codility;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HolidayWeeksTest {

    HolidayWeeks holidayWeeksUnderTest = new HolidayWeeks();

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void solution_test_1() {
        Assert.assertEquals("HolidayWeeks.solution has failed!",
                7,
                holidayWeeksUnderTest.solution(2014,"April","May","Wednesday"));
    }

    @Test
    public void solution_test_2() {
        Assert.assertEquals("HolidayWeeks.solution has failed!",
                7,
                holidayWeeksUnderTest.solution(2014,"May","April","Wednesday"));
    }

    @Test
    public void solution_test_3() {
        Assert.assertEquals("HolidayWeeks.solution has failed!",
                12,
                holidayWeeksUnderTest.solution(2020,"January","March","Thursday"));
    }

}