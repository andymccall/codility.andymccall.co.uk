package uk.co.andymccall.various;

public class NamedLoops {

    public static void solution() {

    outer:
        for (int i=0; i<10; i++) {
            inner:
            System.out.println("hi!");
            for (int j=0; j<10; j++) {
                System.out.println("ho!");
                continue outer;
            }
            System.out.println("we go");
        }
    }

    public static void main(String[] args) {
        solution();
    }

}
