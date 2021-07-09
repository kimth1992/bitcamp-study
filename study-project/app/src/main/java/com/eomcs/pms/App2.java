package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class App2 {

  public static void main(String[] args) {

    final int MAX = 100;

    int[] no = new int[MAX];
    String[] title = new String[MAX];
    String[] content = new String[MAX];
    Date[] startDate = new Date[MAX];
    Date[] endDate = new Date[MAX];
    String[] owner = new String[MAX];
    String[] members = new String[MAX];


    System.out.println("[프로젝트]");
    Scanner keyboardScan = new Scanner(System.in);
    int size = 0;
    for(int i = 0; i < MAX; i++) {

      System.out.print("번호? ");
      no[i] = Integer.parseInt(keyboardScan.nextLine());

      System.out.print("프로젝트명? ");
      title[i] = keyboardScan.nextLine();

      System.out.print("내용? ");
      content[i] = keyboardScan.nextLine();

      System.out.print("시작일? ");
      startDate[i] = Date.valueOf(keyboardScan.nextLine());

      System.out.print("종료일? ");
      endDate[i] = Date.valueOf(keyboardScan.nextLine());

      System.out.print("만든이? ");
      owner[i] = keyboardScan.nextLine();

      System.out.print("팀원? ");
      members[i] = keyboardScan.nextLine();

      size++;

      boolean isExit = false;
      System.out.println("계속 입력하시겠습니까?(y/N)");

      while(true) {
        String input = keyboardScan.nextLine();
        if(input.equalsIgnoreCase("n") || input.equals("")) {
          isExit = true;
          break;
        }
        else if(input.equalsIgnoreCase("y")) {
          isExit = false;
          break;
        }
        else {
          System.out.println("잘못된 값을 입력하셨습니다. (y/N)중 하나를 입력해 주세요.");
        }

      }

      if(isExit == true)
        break;

    }


    keyboardScan.close();

    System.out.println("--------------------------------");

    for(int i = 0; i < size; i++) {
      System.out.printf("%d, %s, %s, %s, %s\n", no[i], title[i], startDate[i], endDate[i], owner[i]);
    }
  }
}
