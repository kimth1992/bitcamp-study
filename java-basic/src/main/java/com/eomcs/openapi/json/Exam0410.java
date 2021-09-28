// 다른 객체를 목록으로 포함하는 경
package com.eomcs.openapi.json;

import java.sql.Date;
import com.google.gson.Gson;

public class Exam0410 {
  public static void main(String[] args) {

    // 1 ) 객체 준비
    Member m = new Member();
    m.setNo(100);
    m.setName("홍길동");
    m.setEmail("hong@test.com");
    m.setPassword("1111");
    m.setPhoto("hong.gif");
    m.setTel("010-2222-1111");
    m.setRegisteredDate(new Date(System.currentTimeMillis()));


    Board b = new Board();
    b.setNo(1);
    b.setTitle("제목");
    b.setContent("내용");
    b.setWriter(m);
    b.setViewCount(98);
    b.setLike(5);
    b.setRegisteredDate(new Date(System.currentTimeMillis()));

    // 2) JSON 처리 객체 준비

    // 3) 객체의 값을 JSON 문자열로 얻기
    String jsonStr = new Gson().toJson(b);

    System.out.println(jsonStr);
  }

}

// 다른 객체를 포함했을 때 JSON 형식


//{
//프로퍼티명 : 값,
//프로퍼티명 : {프로퍼티명:값, 프로퍼티명:값, ...},
