package com.eomcs.oop.ex01;

class Data {
  int x;
}

public class test {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int a = 4;

    Data d = new Data();
    d.x = 10;
    System.out.println("main() : x = " + d.x);

    change(d.x);
    System.out.println("After change(d.x)");
    System.out.println("main() : x = " + d.x);


  }

  static void change(int x) {
    x = 1000;
    System.out.println("change() : x = " + x);
  }

}

