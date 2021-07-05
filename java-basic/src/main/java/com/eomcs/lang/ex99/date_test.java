package com.eomcs.lang.ex99;

import java.text.SimpleDateFormat;
import java.util.Date;

public class date_test {

  public static void main(String[] args) {
    // TODO Auto-generated method stub


    Date d = new Date();
    System.out.println(d);
    SimpleDateFormat f1 = new SimpleDateFormat("yyyy-mm-dd");
    SimpleDateFormat f2 = new SimpleDateFormat("hh: mm : ss");


    System.out.println(f1.format(d));
    System.out.println(f2.format(d));

  }

}
