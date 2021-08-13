// inner class : 바깥 클래스의 인스턴스 멤버 접근하기 2
package com.eomcs.oop.ex11.c;

class B3 {


  // 인스턴스 멤버
  int v1 = 10;

  class X {
    int v1 = 100;

    void test() {

      int v1 = 2000;

      // 인스턴스 멤버에 접근 가능
      // =>   바깥클래스명.this.인스턴스멤버명
      System.out.printf("v1 = %d\n" ,v1); // 로컬 변수
      System.out.printf("v1 = %d\n", this.v1); // 인스턴스 변수
      System.out.printf("v1 = %d\n", B3.this.v1); // 바깥 객체의 인스턴스 변수
    }
  }
}

public class Exam0230 {

  public static void main(String[] args) {
    B3 outer = new B3();
    outer.v1 = 11;

    B3.X x1 = outer.new X();
    x1.test();
    System.out.println("---------------------");

    B3.X x2 = outer.new X();
    x2.test();
    System.out.println("---------------------");

    B3 outer2 = new B3();

    B3.X x3 = outer.new X();
    x3.test();
    System.out.println("---------------------");

  }

}