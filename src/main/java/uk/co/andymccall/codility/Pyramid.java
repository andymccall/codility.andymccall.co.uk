package uk.co.andymccall.codility;

public class Pyramid {

    public void solution(int N) {

        for(int i=0;i<N;i++) {
            for(int j=0;j<N-i;j++) {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
