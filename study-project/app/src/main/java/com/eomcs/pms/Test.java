package com.eomcs.pms;

import java.util.Arrays;
public class Test {

  public static void main(String[] args) {
    System.out.println("[프로젝트]");


    int[] scores = { 1, 2, 3, 4, 5, 6, 7 };

    int[] newScores = new int[7];
    System.arraycopy(scores, 0, newScores, 0, 7);

    int[] partialNewScores = new int[3];
    System.arraycopy(scores, 4, partialNewScores, 0, 3);

    System.out.println(Arrays.toString(scores)); // [1, 2, 3, 4, 5, 6, 7]
    System.out.println(Arrays.toString(newScores)); // [1, 2, 3, 4, 5, 6, 7]
    System.out.println(Arrays.toString(partialNewScores)); // [5, 6, 7]


  }
}

