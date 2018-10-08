package uk.co.andymccall.codility;

import java.text.SimpleDateFormat;
import java.util.*;

import static java.lang.Math.toIntExact;

public class BusyWeek {

    static final long ONE_MINUTE_IN_MILLIS = 60000;

    static private class DiaryEntry implements Comparable<DiaryEntry> {
        private String day;
        private String startTime;
        private String endTime;

        @Override
        public int compareTo(DiaryEntry entryToCompare) {

            Map<String, Integer> mp = new HashMap<>();

            mp.put("MON", 1);
            mp.put("TUE", 2);
            mp.put("WED", 3);
            mp.put("THU", 4);
            mp.put("FRI", 5);
            mp.put("SAT", 6);
            mp.put("SUN", 7);

            int compareDay = mp.get(this.day).intValue() - mp.get(entryToCompare.day).intValue();

            if (compareDay != 0) {
                return compareDay;
            } else {
                try {
                    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
                    Date time = sdf.parse(startTime);
                    Date timeToCompare = sdf.parse(entryToCompare.startTime);
                    return time.compareTo(timeToCompare);
                } catch (Exception e) {
                    ;
                }

            }

            return compareDay;
        }

        @Override
        public String toString() {
            return "DiaryEntry{" +
                    "day=" + day +
                    ", startTime='" + startTime + '\'' +
                    ", endTime='" + endTime + '\'' +
                    '}';
        }
    }

    public int solution(String S) {

        if(S != null && S.length() == 0){ return 10080; }

        List<DiaryEntry> calendar = new ArrayList<>();

        for (String time : S.split("\\r?\\n")) {
            String[] splitTime = time.split("\\s+");

            DiaryEntry entry = new DiaryEntry();

            entry.day = splitTime[0].toUpperCase();
            entry.startTime = splitTime[1].split("\\-")[0];
            entry.endTime = splitTime[1].split("\\-")[1];

            calendar.add(entry);

        }

        calendar.sort(DiaryEntry::compareTo);

        long longestTimeInMinutes = 0;
        Date firstDate;
        Date secondDate;

        // Calculate 00:00 to first time...
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MMM EEE HH:mm");
        try {
            firstDate = sdf.parse("2016/FEB MON 00:00");
            secondDate = sdf.parse("2016/FEB " + calendar.get(0).day + " " + calendar.get(0).startTime);
            longestTimeInMinutes = (secondDate.getTime() - firstDate.getTime()) / ONE_MINUTE_IN_MILLIS;
        } catch (Exception e) {
            ;
        }

        // Calculate every time, except the last...
        for (int i = 0; i < calendar.size(); i++) {
            try {
                firstDate = sdf.parse("2016/FEB " + calendar.get(i).day + " " + calendar.get(i).endTime);
                secondDate = sdf.parse("2016/FEB " + calendar.get(i + 1).day + " " + calendar.get(i + 1).startTime);

                long difference = (secondDate.getTime() - firstDate.getTime()) / ONE_MINUTE_IN_MILLIS;

                if (longestTimeInMinutes < difference) {
                    longestTimeInMinutes = difference;
                }
            } catch (Exception e) {
                ;
            }
        }

        // Calculate the last time to 00:00
        try {
            firstDate = sdf.parse("2016/FEB " + calendar.get(calendar.size()-1).day + " " + calendar.get(calendar.size()-1).endTime);
            secondDate = sdf.parse("2016/FEB SUN 24:00");

            long difference = (secondDate.getTime() - firstDate.getTime()) / ONE_MINUTE_IN_MILLIS;

            if (longestTimeInMinutes < difference) {
                longestTimeInMinutes = difference;
            }
        } catch (Exception e) {
            ;
        }

        return toIntExact(longestTimeInMinutes);

    }

}
