package uk.co.andymccall.codility;

import java.util.HashSet;
import java.util.Set;

public class SimilarIntegers {

    private int total;
    private Set<String> done = new HashSet<>();

    private void calculatePermutations(String source, String source2) {

        if (source2.length() != 0) {
            char ch = source2.charAt(0);
            for (int i = 0; i <= source.length(); i++)

                calculatePermutations(source.substring(0, i) + ch + source.substring(i, source.length()),
                        source2.substring(1, source2.length()));
        } else {

            String temp = source.replaceFirst("^0+(?!$)", "");
            if (temp.length() == source.length()) {
                done.add(source);
                total = done.size();
            }
        }
    }

    public int solution(int N) {
        String toCalculate = String.valueOf(N);
        calculatePermutations("", toCalculate);
        return total;
    }

}