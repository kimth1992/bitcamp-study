// String - 기타 메서드
package com.eomcs.basic.ex02;

public class Exam0171 {
  public static void main(String[] args) {

    String[] arr = {"101", "제목", "내용", "4", "2021-2-2"};

    String s1 = String.format("%s,%s,%s,%s,%s",arr[0],arr[1],arr[2],arr[3],arr[4]);
    System.out.println(s1);

    String s2 = String.format("%s,%s,%s,%s,%s", arr);
    System.out.println(s2);

    String s3 = String.join(",", arr[0],arr[1],arr[2],arr[3],arr[4]);
    System.out.println(s3);

  }
}


