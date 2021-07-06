package com.eomcs.pms;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    int a = 0;
    int b = 0;
    int num = 0;
    Scanner sc = new Scanner(System.in);
    num = sc.nextInt();

    for(int i = 0; i < num ; i++) {
      a = sc.nextInt();
      b= sc.nextInt();
      System.out.println(a+b);
    }

  }

}
