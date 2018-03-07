package uk.co.andymccall.codility;

public class CyclicRotation {

    public int[] solution(int[] A, int K) {

        if(A.length <= 1 || K == 0){
            return A;
        }

        while(K > A.length){
            K -= A.length;
        }

        if(A.length == K){
            return A;
        }

        int hinge = A.length - K;
        int[] temp = new int[A.length];

        for(int i = 0; i < temp.length-hinge; i++){
            temp[i] = A[hinge + i];
        }

        for(int j = 0; j < hinge; j++){
            temp[j+K] = A[j];
        }

        for(int i = 0; i < temp.length; i++){
            A[i] = temp[i];
        }
        return temp;
    }
}
