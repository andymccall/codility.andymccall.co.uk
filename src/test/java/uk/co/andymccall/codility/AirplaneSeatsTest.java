package uk.co.andymccall.codility;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AirplaneSeatsTest {

    AirplaneSeats airplaneSeatsUnderTest = new AirplaneSeats();

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void solution_test_1() {
        String seatsTaken = "1A 2F 1C";
        Assert.assertEquals("AirplaneSeats.solution has failed!",
                4,
                airplaneSeatsUnderTest.solution(2,seatsTaken));
    }

    @Test
    public void solution_test_2() {
        String seatsTaken = "1A 1B 1C 1D 1E 1F 1G 1H 1J 1K";
        Assert.assertEquals("AirplaneSeats.solution has failed!",
                0,
                airplaneSeatsUnderTest.solution(1,seatsTaken));
    }

    @Test
    public void solution_test_3() {
        String seatsTaken = "";
        Assert.assertEquals("AirplaneSeats.solution has failed!",
                150,
                airplaneSeatsUnderTest.solution(50,seatsTaken));
    }

    @Test
    public void solution_test_4() {
        String seatsTaken = "1B 1E 1J 2B 2E 2J 3B 3E 3J 4B 4E 4J 5B 5E 5J";
        Assert.assertEquals("AirplaneSeats.solution has failed!",
                0,
                airplaneSeatsUnderTest.solution(5,seatsTaken));
    }

    @Test
    public void solution_test_5() {
        String seatsTaken = "11A";
        Assert.assertEquals("AirplaneSeats.solution has failed!",
                32,
                airplaneSeatsUnderTest.solution(11,seatsTaken));
    }
}