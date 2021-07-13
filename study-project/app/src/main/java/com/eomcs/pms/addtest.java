package com.eomcs.pms;

import java.util.Scanner;

public class addtest {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    int a, b;
    System.out.println("a, b 값을 입력하세요");
    a = sc.nextInt();
    b = sc.nextInt();


    System.out.println(add(a,b));
    add1(a,b);
    System.out.println(add2());



  }



  static int add(int a, int b) {

    return a + b;

  }

  static void add1(int a, int b) {


    System.out.println(a+b);
  }

  static int add2() {
    int a;
    int b;
    System.out.println("a, b 값을 입력하세요.");
    a = sc.nextInt();
    b= sc.nextInt();

    return a + b;
  }


  static long add(long a, long b) {

    return a+b;
  }



}
