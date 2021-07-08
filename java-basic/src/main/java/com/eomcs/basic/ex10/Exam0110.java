package com.eomcs.basic.ex10;

public class Exam0110 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    long time =  System.currentTimeMillis();
    System.out.println(time);

    java.util.Date d = new java.util.Date();  //util은 객체를 만드는 순간의 시간을 저장해 둔다.
    System.out.println(d.toString());
    System.out.printf("%ty-%tm-%td", d,d,d);
  }

}
