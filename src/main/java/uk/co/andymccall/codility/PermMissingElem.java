package uk.co.andymccall.codility;

public class PermMissingElem {

    public int solution(int[] A) {

        long N = A.length + 1;
        long sum = N * (N + 1) / 2;
        for (int i = 0; i < A.length; i++) sum -= A[i];
        return (int) sum;

    }
}
