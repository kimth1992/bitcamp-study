package com.eomcs.pms;

import java.util.Date;
import java.util.Scanner;

public class App_test5 {
  // 조회용으로만 사용할 변수라면 상수로 선언한다.

  public static void main(String[] args) {
    System.out.println("[회원]");

    final int MAX_LENGTH = 3;


    int[] no = new int[MAX_LENGTH];
    String[] name = new String[MAX_LENGTH];
    String[] email = new String[MAX_LENGTH];
    String[] password = new String[MAX_LENGTH];
    String[] photo = new String[MAX_LENGTH];
    String[] tel = new String[MAX_LENGTH];
    Date[] registeredDate = new Date[MAX_LENGTH];


    Scanner keyboardScan = new Scanner(System.in);

    for (int i = 0; i < MAX_LENGTH; i++) {

      System.out.print("번호? ");
      no[i] = Integer.parseInt(keyboardScan.nextLine());
      System.out.print("이름? ");
      name[i] = keyboardScan.nextLine();
      System.out.print("이메일? ");
      email[i] = keyboardScan.nextLine();
      System.out.print("암호? ");
      password[i] = keyboardScan.nextLine();
      System.out.print("사진? ");
      photo[i] = keyboardScan.nextLine();
      System.out.print("전화? ");
      tel[i] = keyboardScan.nextLine();
      registeredDate[i] = new Date();
      System.out.println();

    }



    keyboardScan.close(); // 데이터 입출력이 끝났으면 도구를 닫는다.
    System.out.println("--------------------------------");

    for(int i = 0; i< MAX_LENGTH; i++) {

      System.out.println("번호: " + no[i]);
      System.out.println("이름: " + name[i]);
      System.out.println("이메일: " + email[i]);
      System.out.printf("암호: %s\n", password[i]);
      System.out.printf("사진: %s\n", photo[i]);
      System.out.printf("전화: %s\n", tel[i]);
      System.out.printf("가입일: %s\n", registeredDate[i]);
      System.out.println();
    }

  }

}