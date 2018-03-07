package uk.co.andymccall.codility;

import java.util.Arrays;

public class TemperatureAmplitude {

    public String solution1(int[] A) {

        int seasonSize = A.length / 4;

        int[] winterArray = Arrays.copyOfRange(A,0,seasonSize);
        for (int x = 0;  x<winterArray.length; x++) {
            System.out.print(winterArray[x]+",");
        }
        System.out.println();
        int[] springArray = Arrays.copyOfRange(A,seasonSize,seasonSize*2);
        for (int x = 0;  x<springArray.length; x++) {
            System.out.print(springArray[x]+",");
        }
        System.out.println();
        int[] summerArray = Arrays.copyOfRange(A,seasonSize*2,seasonSize*3);
        for (int x = 0;  x<summerArray.length; x++) {
            System.out.print(summerArray[x]+",");
        }
        System.out.println();
        int[] autumnArray = Arrays.copyOfRange(A,seasonSize*3,seasonSize*4);
        for (int x = 0;  x<autumnArray.length; x++) {
            System.out.print(autumnArray[x]+",");
        }
        System.out.println();

        int winterAmplitude=Arrays.stream(winterArray).max().getAsInt()
                - Arrays.stream(winterArray).min().getAsInt();
        int springAmplitude=Arrays.stream(springArray).max().getAsInt()
                - Arrays.stream(springArray).min().getAsInt();;
        int summerAmplitude=Arrays.stream(summerArray).max().getAsInt()
                - Arrays.stream(summerArray).min().getAsInt();;
        int autumnAmplitude=Arrays.stream(autumnArray).max().getAsInt()
                - Arrays.stream(autumnArray).min().getAsInt();;

        if ((winterAmplitude > springAmplitude)
                && (winterAmplitude > summerAmplitude)
                && (winterAmplitude > autumnAmplitude)) {
            return "WINTER";
        }

        if ((springAmplitude > summerAmplitude)
                && (springAmplitude > autumnAmplitude)
                && (springAmplitude > winterAmplitude)) {
            return "SPRING";
        }

        if ((summerAmplitude > autumnAmplitude)
                && (summerAmplitude > winterAmplitude)
                && (summerAmplitude > springAmplitude)) {
            return "SUMMER";
        }

        if ((autumnAmplitude > winterAmplitude)
                && (autumnAmplitude > springAmplitude)
                && (autumnAmplitude > summerAmplitude)) {
            return "AUTUMN";
        }

        return "ERROR";

    }

    public String solution(int[] A) {

        int seasonSize = A.length / 4;
        int highestAmplitude=0;
        int highestSeason=-1;

        for (int i = 0; i< 4; i++) {
            int[] tempArray = Arrays.copyOfRange(A,i*seasonSize,(i*seasonSize)+seasonSize);

            int amplitude=Arrays.stream(tempArray).max().getAsInt()
                    - Arrays.stream(tempArray).min().getAsInt();

            if (amplitude > highestAmplitude || highestSeason == -1) {
                highestSeason = i;
                highestAmplitude = amplitude;
            }
        }

        switch (highestSeason) {
            case 0: return "WINTER";
            case 1: return "SPRING";
            case 2: return "SUMMER";
            case 3: return "AUTUMN";
        }
        return "ERROR";
    }
}