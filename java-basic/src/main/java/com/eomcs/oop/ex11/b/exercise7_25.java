package com.eomcs.oop.ex11.b;

class Outer{
  class Inner{
    int iv = 100;
  }
}


public class exercise7_25 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Outer outer = new Outer();
    Outer.Inner kk = outer.new Inner();
    System.out.println(kk.iv);

  }

}
