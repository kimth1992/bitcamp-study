package com.eomcs.basic.ex10;

public class Exam0120 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    long time =  System.currentTimeMillis();
    System.out.println(time);

    java.sql.Date d = new java.sql.Date(time);
    System.out.println(d.toString());
  }

}
