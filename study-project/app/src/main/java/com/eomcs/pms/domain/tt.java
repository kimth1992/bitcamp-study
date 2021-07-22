package com.eomcs.pms.domain;

public class tt {

  public static void main(String[] args) {
    // TODO Auto-generated method stub


    ww w1 = new ww();
    ww w2 = new ww();
    w1.a = 100;
    w1.b = 200;

    w2.a = 300;
    w2.b = 1000;

    w1.add(w1.a, w1.b);
    ww.add2(w2.a, w2.b);

  }

}


class ww{

  int a;
  static int b;

  void add(int a, int b) {
    System.out.printf("a + b = %d + %d = %d\n",a, b, a+b);
  }

  static void add2(int a, int b) {
    System.out.printf("a + b = %d + %d = %d\n",a, b, a+b);
  }

}