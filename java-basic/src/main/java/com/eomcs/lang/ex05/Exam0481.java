package com.eomcs.lang.ex05;

//# 비트 연산자 : 응용 III
//
public class Exam0481 {
  public static void main(String[] args) {

    final int LOGOUT = 0x01; // 0000 0001   -  로그아웃
    final int GENERAL = 0x02; // 0000 00010  -  일반 로그인
    final int ADMIN = 0x04; // 0000 0100  -  관리자 로그인


    int menu1 = LOGOUT; // 로그아웃 상태에서만 접근 가능
    int menu2 = GENERAL; // 일반으로 로그인 된 사용자만 접근 가능
    int menu3 = ADMIN; // 관리자로 로그인 된 사용자만 접근 가능
    int menu4 = LOGOUT | GENERAL | ADMIN; // 모든 사용자 사용 가능
    int menu5 = GENERAL | ADMIN; // 모든 사용자 사용 가능

    // 접근 테스트
    System.out.println((menu2 & LOGOUT) > 0);
    System.out.println((menu2 & GENERAL) > 0);
    System.out.println((menu2 & ADMIN) > 0);

    System.out.println("------------------------");

    System.out.println((menu3 & LOGOUT) > 0);
    System.out.println((menu3 & GENERAL) > 0);
    System.out.println((menu3 & ADMIN) > 0);

    System.out.println("------------------------");

    System.out.println((menu4 & LOGOUT) > 0);
    System.out.println((menu4 & GENERAL) > 0);
    System.out.println((menu4 & ADMIN) > 0);

  }
}
