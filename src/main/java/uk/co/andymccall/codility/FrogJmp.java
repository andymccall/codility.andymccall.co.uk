package uk.co.andymccall.codility;

public class FrogJmp {

    // This tests will pass correctness, but fail performance
    public int solution1(int X, int Y, int D) {

        int jumps=0;

        for (int i=X; i<Y; i=i+D) {
            jumps++;
        }

        return jumps;

    }

    // This test will pass correctness and performance
    public int solution(int X, int Y, int D) {
        return Double.valueOf(Math.ceil((Y-X)/(double)D)).intValue();
    }

}
