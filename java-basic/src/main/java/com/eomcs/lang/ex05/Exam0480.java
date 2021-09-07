package com.eomcs.lang.ex05;

//# 비트 연산자 : 응용 III
//
public class Exam0480 {
  public static void main(String[] args) {

    final int LOGOUT = 0x01; // 0000 0001   -  로그아웃
    final int GENERAL = 0x02; // 0000 00010  -  일반 로그인
    final int ADMIN = 0x04; // 0000 0100  -  관리자 로그인


    int menu1 = LOGOUT; // 로그아웃 상태에서만 접근 가능
    int menu2 = GENERAL; // 일반으로 로그인 된 사용자만 접근 가능
    int menu3 = ADMIN; // 관리자로 로그인 된 사용자만 접근 가능
    int menu4 = LOGOUT | GENERAL | ADMIN; // 모든 사용자 사용 가능

    // 접근 테스트
    System.out.println((menu1 & LOGOUT) > 0);

    // 계산 원리
    // menu1 :  0000 0001
    // LOGOUT : 0000 0001
    // ----------------
    //0000 0001    <-- 0보다 큰 값이 나온다.

    // 해설 : 어떤 값에 대해 LOGOUT 값을 & 했을 때 true가 나온다면,
    // 그 값을 2진수로 보았을 때 LOGOUT 비트가 1이라는 의미이다.

    System.out.println((menu1 & GENERAL) > 0);
    // menu1 :   0000 0001
    // GELERAL : 0000 0010
    //      ---------------
    //           0000 0000
    // 해설 : 어떤 값에 대해 GENERAL 값을 & 했을 때 true가 나온다면,
    // GENERAL 비트(오른쪽에서 두 번째 비트)가 1인지 검사한다는 뜻이다.

    System.out.println((menu1 & ADMIN) > 0);
    // menu1 :   0000 0001
    // ADMIN :   0000 0100
    //      ---------------
    //           0000 0000
    // 해설 : 어떤 값에 대해 ADMIN 값을 & 했을 때 true가 나온다면,
    // 그 값을 어떤 2진수로 보았을 때 ADMIN 비트가 1이라는 의미다
  }
}
