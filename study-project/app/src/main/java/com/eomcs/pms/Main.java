package com.eomcs.pms;

import java.util.Scanner;

public class Main{
  public static void main(String[] args){


    // 정수 10개로 이루어진 수열 A와 정수 5가 주어진다.
    //n = 10, x = 5

    Scanner sc = new Scanner(System.in);
    int n = 0;
    int x = 0;
    n = sc.nextInt();
    x = sc.nextInt();

    for(int i = 0; i <n; i++) {
      if(i < x)
        System.out.println(i);
    }



  }

}
