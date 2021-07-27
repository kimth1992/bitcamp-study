// 클래스 변수의 응용 : 상수 변수 import 하기
//


package com.eomcs.oop.ex03;

// 상수 변수를 같은 클래스의 멤버처럼 사용하고 싶다면
// 즉 클래스 이름 없이 사용하고 싶다면,
// 상수 변수를 미리 import하여 컴파일러에게 그 소속을 알려줘라.
import static com.eomcs.oop.ex03.Member.GUEST;
import static com.eomcs.oop.ex03.Member.MANAGER;
import static com.eomcs.oop.ex03.Member.MEMBER;

public class Exam0163 {


  public static void main(String[] args) {


    Member m4 = new Member();
    m4.id = "aaa";
    m4.password = "1111";
    m4.type = GUEST;
    // 스태틱 변수는 변수명 앞에 클래스명을 명시해야 한다.

    Member m5 = new Member();
    m5.id = "bbb";
    m5.password = "1111";
    m5.type = MANAGER;

    Member m6 = new Member();
    m6.id = "ccc";
    m6.password = "1111";
    m6.type = MEMBER;
  }
}








