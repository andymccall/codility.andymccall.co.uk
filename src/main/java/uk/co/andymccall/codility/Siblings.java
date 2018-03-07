package uk.co.andymccall.codility;

import java.util.Arrays;

public class Siblings {

    public int solution(int N) {

        int testNumber=N;
        int highestInt=0;

        if ((testNumber > 0) && (testNumber < 10001)) {

            String temp = Integer.toString(testNumber);
            char [] charArray = temp.toCharArray();

            StringBuilder higestStringSibling = new StringBuilder();
            Arrays.sort(charArray);
            for (int i=charArray.length-1; i>-1; i--) {
                higestStringSibling.append(charArray[i]);
            }
            highestInt=Integer.parseInt(higestStringSibling.toString());
        }

        return highestInt;
    }

}
