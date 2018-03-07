package uk.co.andymccall.codility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryTreeAmplitude {

    public class Tree {
        public int x;
        public Tree l;
        public Tree r;
    }

    private int highestAmplitude=0;

    public int solution(Tree T) {

        if ((T == null) || (T.l == null && T.r == null)) {
            highestAmplitude = 0;
        }

        List<Integer> paths = new ArrayList<>();

        traverse(T, paths);

        return highestAmplitude;

    }

    private void traverse (Tree root, List<Integer> path){

        List<Integer> tempPath = new ArrayList<>();

        tempPath.addAll(path);
        tempPath.add(root.x);

        if (root.l != null){
            traverse (root.l, tempPath);
        }
        if (root.r != null){
            traverse (root.r, tempPath);
        }

        if (root.l == null && root.r == null){
            int pathAmplitude = calculateAmplitude(tempPath);
            if (pathAmplitude > highestAmplitude) {
                highestAmplitude = pathAmplitude;
            }
            tempPath.clear();
        }

    }

    private int calculateAmplitude(List<Integer> path) {
        return Collections.max(path) - Collections.min(path);
    }

}
