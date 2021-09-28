package com.eomcs.design_pattern.decorator.ex01.before;

public class B extends A{

  public void f1(String name) {

    // 새 기능 추가
    // => 머리말 출력 기능
    System.out.println("[머리말]-----------------------");
    super.f1(name);
  }
}
