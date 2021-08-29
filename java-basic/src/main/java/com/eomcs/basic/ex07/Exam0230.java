// java.util.HashSet 클래스 사용 - 값을 꺼내는 방법 II
package com.eomcs.basic.ex07;

import java.util.HashSet;

public class Exam0230 {
  public static void main(String[] args) {

    HashSet<String> set = new HashSet<>();
    set.add("aaa");
    set.add("bbb");
    set.add("ccc");
    set.add("ddd");
    set.add("eee");

    for(String s : set) {
      System.out.println(s + (", "));
    }
    System.out.println();
  }
}



