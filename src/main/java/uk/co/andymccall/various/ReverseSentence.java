package uk.co.andymccall.various;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseSentence {

    public String solution(String S) {

        List<Object> list = Arrays.asList(S.trim().split("\\s+"));
        Collections.reverse(list);

        return list.toString().replaceAll("[^A-Za-z0-9 ]", "");

    }

}
