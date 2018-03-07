package uk.co.andymccall.codility;

public class OddOccurrencesInArray {

    public int solution(int[] A) {

        int oddOccurence=0;

        for (int i=0; i< A.length; i++ ) {
            oddOccurence ^= A[i];
        }

        return oddOccurence;

    }

}
