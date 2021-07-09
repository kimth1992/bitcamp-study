package com.eomcs.pms;

import java.util.Date;
import java.util.Scanner;

public class App_final {
  // 날짜의 출력형식을 "yyyy-mm-dd"로 변경한다.

  public static void main(String[] args) {
    System.out.println("[회원]");

    final int MAX_LENGTH = 100;


    int[] no = new int[MAX_LENGTH];
    String[] name = new String[MAX_LENGTH];
    String[] email = new String[MAX_LENGTH];
    String[] password = new String[MAX_LENGTH];
    String[] photo = new String[MAX_LENGTH];
    String[] tel = new String[MAX_LENGTH];
    Date[] registeredDate = new Date[MAX_LENGTH];


    Scanner keyboardScan = new Scanner(System.in);
    int size = 0;


    for(int i = 0; i < MAX_LENGTH; i++) {


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

      size++;

      boolean isExit = false;

      System.out.print("계속 입력하시겠습니까?(y/N)");

      while(true){
        String input = keyboardScan.nextLine();


        if(input.equalsIgnoreCase("N")|| input.equals("")) {
          isExit = true;
          break;
        }
        else if(input.equalsIgnoreCase("y")) {
          isExit = false;
          break;
        }
        else {
          System.out.println("입력된 문자가 잘못 되었습니다. y 또는 N으로 입력해주세요.\n");

        }
      }

      if(isExit)
        break;
    }



    keyboardScan.close(); // 데이터 입출력이 끝났으면 도구를 닫는다.
    System.out.println("--------------------------------");


    for(int i1 = 0; i1< size; i1++) {

      System.out.printf("%d, %s, %s, %s, %tY-%5$tm-%5$td \n", no[i1], name[i1], email[i1],  
          tel[i1], registeredDate[i1]);
      //      System.out.println("번호: " + no[i]);
      //      System.out.println("이름: " + name[i]);
      //      System.out.println("이메일: " + email[i]);
      //      // System.out.printf("암호: %s\n", password[i]);
      //      // System.out.printf("사진: %s\n", photo[i]);
      //      System.out.printf("전화: %s\n", tel[i]);
      //      System.out.printf("가입일: %tY-%1$tm-%1$td\n", registeredDate[i]);
      System.out.println();
    }

  }

}

