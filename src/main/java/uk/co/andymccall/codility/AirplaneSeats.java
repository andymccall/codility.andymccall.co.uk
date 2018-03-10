package uk.co.andymccall.codility;

import java.util.Arrays;

public class AirplaneSeats {

    public int solution(int N, String S) {

        int seatsInRow = 12;
        int currentCount = 0;
        int families = 0;

        String[] seating = S.trim().split("\\s+");

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < seatsInRow; j++) {

                String seat = (String.valueOf(i + 1) + (numberToSeat(j)));

                if (seat.contains("X")) {
                    currentCount = 0;
                } else {
                    if (Arrays.asList(seating).contains(seat)) {
                        currentCount = 0;
                    } else {
                        currentCount++;
                        if (currentCount == 3) {
                            families++;
                            currentCount = 0;
                        }
                    }
                }
            }
        }

        return families;

    }

    private char numberToSeat(int i) {
        switch (i) {
            case 0:
                return 'A';
            case 1:
                return 'B';
            case 2:
                return 'C';
            case 3:
                return 'X';
            case 4:
                return 'D';
            case 5:
                return 'E';
            case 6:
                return 'F';
            case 7:
                return 'G';
            case 8:
                return 'X';
            case 9:
                return 'H';
            case 10:
                return 'J';
            case 11:
                return 'K';
            default:
                return 'X';
        }
    }
}
