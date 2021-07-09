package com.eomcs.lang.ex04;

public class exam0000 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub


    for(int i = 0; i<20 ; i++) {

      if((i+1)%2==0 || (i+1)%3 == 0) {
        continue;
      }
      else {
        System.out.printf("%d는 2의배수 혹은 3의배수가 아닙니다.\n",i+1);
      }

    }

  }

}
