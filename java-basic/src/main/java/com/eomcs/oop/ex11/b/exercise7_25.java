package com.eomcs.oop.ex11.b;

class Outer{
  static class Inner{
    int iv = 100;
  }
}


public class exercise7_25 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Outer.Inner kk = new Outer.Inner();
    System.out.println(kk.iv);

    //    Outer outer = new Outer();
    //    Outer.Inner kk = outer.new Inner();
    //    System.out.println(kk.iv);

  }

}
