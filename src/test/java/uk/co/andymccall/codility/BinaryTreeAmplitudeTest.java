package uk.co.andymccall.codility;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTreeAmplitudeTest {

    BinaryTreeAmplitude binaryTreeAmplitudeUnderTest = new BinaryTreeAmplitude();

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void solution_test_1() {

        BinaryTreeAmplitude.Tree tree1 = binaryTreeAmplitudeUnderTest.new Tree();
        BinaryTreeAmplitude.Tree tree2 = binaryTreeAmplitudeUnderTest.new Tree();
        BinaryTreeAmplitude.Tree tree3 = binaryTreeAmplitudeUnderTest.new Tree();
        BinaryTreeAmplitude.Tree tree4 = binaryTreeAmplitudeUnderTest.new Tree();
        BinaryTreeAmplitude.Tree tree5 = binaryTreeAmplitudeUnderTest.new Tree();
        BinaryTreeAmplitude.Tree tree6 = binaryTreeAmplitudeUnderTest.new Tree();
        BinaryTreeAmplitude.Tree tree7 = binaryTreeAmplitudeUnderTest.new Tree();
        BinaryTreeAmplitude.Tree tree8 = binaryTreeAmplitudeUnderTest.new Tree();
        BinaryTreeAmplitude.Tree tree9 = binaryTreeAmplitudeUnderTest.new Tree();

        tree9.x = 3;
        tree9.l = null;
        tree9.r = null;

        tree8.x = 1;
        tree8.l = null;
        tree8.r = null;

        tree7.x = 4;
        tree7.l = tree9;
        tree7.r = null;

        tree6.x = 7;
        tree6.l = tree8;
        tree6.r = null;

        tree5.x = 2;
        tree5.l = null;
        tree5.r = null;

        tree4.x = 12;
        tree4.l = null;
        tree4.r = null;

        tree3.x = 9;
        tree3.l = tree6;
        tree3.r = tree7;

        tree2.x = 8;
        tree2.l = tree4;
        tree2.r = tree5;

        tree1.x = 5;
        tree1.l = tree2;
        tree1.r = tree3;

        Assert.assertEquals("BinaryTreeAmplitude.solution has failed!",
                            8,
                            binaryTreeAmplitudeUnderTest.solution(tree1));

    }
}