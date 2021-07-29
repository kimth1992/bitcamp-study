package com.eomcs.oop.ex06.e;

class Parent{
  int x = 100;

  Parent() {
    this(200);
  }

  Parent(int x) {
    this.x = x;
  }

  int getX() {
    return x;
  }
}

class Child extends Parent{
  int x = 3000;

  Child() {
    this(1000);
  }

  Child(int x) {
    this.x = x;
  }

  int getX() {
    System.out.printf("this값을 붙이지 않은 x 값은 %d 입니다.\n", x);
    System.out.printf("현재클래스(this, Child)의 x 값은 %d 입니다.(x랑 this.x랑 같다는 얘기)\n", this.x);
    System.out.printf("조상클래스(super, Parent)의 x 값은 %d 입니다.\n", super.x);
    return x;
  }

}

public class Test {

  public static void main(String[] args) {

    Child c = new Child();
    System.out.println(c.getX());

  }

}
