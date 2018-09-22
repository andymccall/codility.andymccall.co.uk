package uk.co.andymccall.codility;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InterestingTimes {

    final long ONE_SECOND_IN_MILLIS = 1000;

    private int interestingCount=0;

    public static long countUniqueCharacters(String input) {
        return input.chars()
                .distinct()
                .count();
    }

    public int solution(String S, String T) {

        String startTime = S;
        String endTime = T;

        Date currentDate = new Date();
        Date endDate = new Date();

        DateFormat sdf = new SimpleDateFormat("kk:mm:ss");

        try {
            currentDate = sdf.parse(startTime);
            endDate = sdf.parse(endTime);
        } catch (Exception e) {
            System.out.println("Unable to parse start or end time!");
        }

        do {
            long currentTimeInMs = currentDate.getTime();
            String tempString = sdf.format(currentDate).replace(":", "");
            if (countUniqueCharacters(tempString) <= 2) {
                interestingCount++;
            }
            currentDate = new Date(currentTimeInMs + (ONE_SECOND_IN_MILLIS));
        } while (currentDate.getTime() <= endDate.getTime());

        return interestingCount;
    }

}
