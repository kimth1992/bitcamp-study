// 오버라이딩(overriding) - this/super의 사용
package com.eomcs.oop.ex06.c;

// this.메서드() 호출?
// => 현재 클래스부터 호출할 메서드를 찾아 올라 간다.
//
// super.메서드() 호출?
// => 부모 클래스부터 호출할 메서드를 찾아 올라 간다.
//

public class Exam0421 {
  static class X {
    void m1() {
      System.out.println("X의 m1()");
    }
    void m2() {
      System.out.println("X의 m2()");
    }
  }


  static class X2 extends X {
    @Override
    void m1() {
      System.out.println("X2의 m1()");
    }
  }


  static class X3 extends X2 {
    @Override
    void m2() {
      System.out.println("X3의 m2()");
    }
  }


  static class X4 extends X3 {
    @Override
    void m1() {
      System.out.println("X4의 m1()");
    }

    void test() {
      this.m1(); //  this가 실제 가리키는 인스턴스를 기준으로
      super.m1(); // super는 그 메서드가 포함된 클래스 기준으로 super 찾기

      this.m2(); // X5의 m2()
      super.m2(); // X3의 m2()

      //      super.super.m1(); // 컴파일 오류! 이런 문법은 없다! 무협지 문법!

    }
  }

  static class X5 extends X4{
    @Override
    void m1() {
      System.out.println("X5의 m1()");
    }
    @Override
    void m2() {
      System.out.println("X5의 m2()");
    }
  }



  public static void main(String[] args) {
    X5 obj = new X5();
    obj.test();

    // 레퍼런스에서 super를 사용할 수 없다.
    //    obj.super.m1(); // 컴파일 오류!
  }
}








