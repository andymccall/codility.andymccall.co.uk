package uk.co.andymccall.various;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseSentenceTest {

    ReverseSentence reverseSentence = new ReverseSentence();

    @Test
    public void solution_test_1() {
        String testSentence = "This is a test sentence";
        Assert.assertEquals("ReverseSentence.solution has failed!",
                "sentence test a is This",
                reverseSentence.solution(testSentence));
    }

    @Test
    public void solution_test_2() {
        String testSentence = "Test";
        Assert.assertEquals("ReverseSentence.solution has failed!",
                "Test",
                reverseSentence.solution(testSentence));
    }

    @Test
    public void solution_test_3() {
        String testSentence = "Test three";
        Assert.assertEquals("ReverseSentence.solution has failed!",
                "three Test",
                reverseSentence.solution(testSentence));
    }

    @Test
    public void solution_test_4() {
        String testSentence = "";
        Assert.assertEquals("ReverseSentence.solution has failed!",
                "",
                reverseSentence.solution(testSentence));
    }
}