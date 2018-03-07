package uk.co.andymccall.codility;

import java.util.Arrays;

public class SubsequenceAmplitude {

    public int solution(int[] A) {

        int calculatedValue = 0;
        int value = -1;

        Arrays.sort(A);

        int globalI = 0;

        for (int i = 0; i < A.length - 1; i++) {

            if (value == -1 && A[i + 1] - A[i] < 2) {
                globalI = 2;
                value = A[i + 1] - A[i];
            } else if (value == 0 && A[i + 1] - A[i] <= 1) {
                globalI = globalI + 1;
                value = A[i + 1] - A[i];
            } else if (value == 1 && A[i + 1] - A[i] == 0) {
                globalI = globalI + 1;
            } else {
                value = -1;
                calculatedValue = Math.max(calculatedValue, globalI);
                globalI = 0;
            }
        }
        return Math.max(calculatedValue, globalI);
    }

}
