package com.eomcs.oop.ex00;

public class Exam0200 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Test t1 = new Test();

    test1(t1);
    System.out.println(t1.b);
  }


  static void test1(Test p) {
    p.b = 3000;
  }

}
