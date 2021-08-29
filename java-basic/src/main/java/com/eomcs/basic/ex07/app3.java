package com.eomcs.basic.ex07;


import java.util.Scanner;

public class app3 {

  public static void main(String[] args) {
    Scanner keyboardScan = new Scanner(System.in);
    while (true) {
      System.out.print("메인> ");
      String input = keyboardScan.nextLine();
      if (input.equals("exit") || input.equals("quit")) {
        System.out.println("안녕!");
        break;
      } else if (input.equals("/main/login")) {
        System.out.println("[로그인]");
        System.out.println("1. 아이디/비번 입력");
        System.out.println("2. 아이디 찾기");
        System.out.println("3. 비번 찾기");
        System.out.print("> ");
        int no = Integer.valueOf(keyboardScan.nextLine());

        switch (no) {
          case 1:
            System.out.println("[아이디/비번 입력]");
            System.out.print("아이디 : ");
            keyboardScan.nextLine();
            System.out.print("비밀번호 : ");
            keyboardScan.nextLine();
            System.out.println("로그인 성공!");
            break;
          case 2:
            System.out.println("[아이디 찾기]");
            System.out.print("성함 : ");
            String name = keyboardScan.next();
            System.out.print("생년월일 : ");
            keyboardScan.next();
            System.out.print("핸드폰번호 : ");
            keyboardScan.next();
            System.out.println();
            System.out.printf("%s님의 아이디는 000입니다.\n", name);
            break;
          case 3:
            System.out.println("[비밀번호 찾기]");
            System.out.print("성함 : ");
            name = keyboardScan.next();
            System.out.print("생년월일 : ");
            keyboardScan.next();
            System.out.print("핸드폰번호 : ");
            keyboardScan.next();
            System.out.print("아이디 : ");
            keyboardScan.next();
            System.out.println();
            System.out.printf("%s님의 비밀번호를 다시 설정해주세요.\n", name);
            System.out.print("비밀번호 설정 : ");
            keyboardScan.next();
            System.out.print("비밀번호 확인 : ");
            keyboardScan.next();
            break;
        }
      } else if (input.equals("/main/logout")) {
        System.out.println("[로그아웃]\n> ");
        if (input.equals("exit") || input.equals("quit")) {
          System.out.println("안녕!");
          break;
        }
      }


      //
      //
      //    System.out.println("[카테고리]");
      //    System.out.println("1. 소개");
      //    System.out.println("2. 약국");
      //    System.out.println("3. 힐러");
      //    System.out.println("4. 커뮤니티");
      //    keyboardScan.nextInt();
      //
      //    System.out.println("[게시판1]");
      //    System.out.println("<게시판 글쓰기>\n입력 : ");
      //    keyboardScan.next();
      //    System.out.println("글 등록 완료!");
      //    System.out.println();
      //
      //    System.out.println("<게시판 삭제>\n정말 삭제하시겠어요?");
      //    keyboardScan.next();
      //    System.out.println("글 삭제 완료!");
      //
      //    System.out.println("[게시판2]");
      //    System.out.println("<게시판 글쓰기>\n입력 : ");
      //    keyboardScan.next();
      //    System.out.println("글 등록 완료!");
      //    System.out.println();
      //
      //    System.out.println("<게시판 삭제>\n정말 삭제하시겠어요?");
      //    keyboardScan.next();
      //    System.out.println("글 삭제 완료!");
      //
      //    System.out.println("[게시판3]");
      //    System.out.println("<게시판 글쓰기>\n입력 : ");
      //    keyboardScan.next();
      //    System.out.println("글 등록 완료!");
      //    System.out.println();
      //
      //    System.out.println("<게시판 삭제>\n정말 삭제하시겠어요?");
      //    keyboardScan.next();
      //    System.out.println("글 삭제 완료!");
    }
    keyboardScan.close();
  }

}