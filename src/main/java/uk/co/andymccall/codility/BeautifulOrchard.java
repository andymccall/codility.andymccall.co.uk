package uk.co.andymccall.codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BeautifulOrchard {

    static private class CountAndIndex {
        private int count;
        private int nextStartPosition;

    }

    static CountAndIndex highestSubSequence(Integer[] arrayToSearch, int sizeOfSubSequence){

        CountAndIndex tempCountAndIndex = new CountAndIndex();

        int sumForFirstPrev = 0;

        CountAndIndex currentCountAndIndex = new CountAndIndex();

        for(int i = 0; i < arrayToSearch.length; i++){
            if(i <= arrayToSearch.length - sizeOfSubSequence) {
                for (int j = i; j < i + sizeOfSubSequence; j++) {
                    tempCountAndIndex.count += arrayToSearch[j];
                }
            }
            if(tempCountAndIndex.count >  sumForFirstPrev) {
                sumForFirstPrev = tempCountAndIndex.count;
                tempCountAndIndex.nextStartPosition = i;
            }
            tempCountAndIndex.count = 0;
        }

        currentCountAndIndex.count = sumForFirstPrev;
        currentCountAndIndex.nextStartPosition = tempCountAndIndex.nextStartPosition;

        return currentCountAndIndex;

    }

    public int solution(Integer[] A, int K, int L) {

        int count = 0;
        Integer[] beforeSubSequence, afterSubSequence;
        CountAndIndex tempSequence;
        List<Integer> mergedSequenceList;

        // Before we waste any time, check to see if the
        // calculation is possible on the array....
        if (K + L > A.length)
        {
            return -1;
        }

        // Find the array that contains the highest subsequence for Alice
        tempSequence = highestSubSequence(A, K);

        // Add to count
        count+=tempSequence.count;

        beforeSubSequence = Arrays.copyOfRange(A, 0, tempSequence.nextStartPosition);
        afterSubSequence = Arrays.copyOfRange(A, tempSequence.nextStartPosition+K, A.length);

        // Merge the two sequences
        mergedSequenceList = new ArrayList(Arrays.asList(beforeSubSequence));
        mergedSequenceList.addAll(Arrays.asList(afterSubSequence));

        // Convert back to array
        Integer[] mergedSequence=mergedSequenceList.toArray(new Integer[0]);

        // Find the array that contains the highest subsequence for Bob
        tempSequence = highestSubSequence(mergedSequence, L);

        // Add to count
        count+=tempSequence.count;

        return count;
    }

}
