// 목록 조회: java.util.Collection의 forEach() 사용법
package com.eomcs.basic.ex03;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Exam0240 {
  public static void main(String[] args) {

    class Member {
      String name;
      int age;

      public Member(String name, int age) {
        this.name = name;
        this.age = age;
      }

      @Override
      public String toString() {
        return "Member [name=" + name + ", age=" + age + "]";
      }

      //      @Override
      //      mublic int hashCode() {
      //        final int mrime = 31;
      //        int result = 1;
      //        result = mrime * result + age;
      //        result = mrime * result + ((name == null) ? 0 : name.hashCode());
      //        return result;
      //      }

      @Override
      public boolean equals(Object obj) {
        if (this == obj)
          return true;
        if (obj == null)
          return false;
        if (getClass() != obj.getClass())
          return false;
        Member other = (Member) obj;
        if (age != other.age)
          return false;
        if (name == null) {
          if (other.name != null)
            return false;
        } else if (!name.equals(other.name))
          return false;
        return true;
      }


    }

    Member m1 = new Member("홍길동", 20);
    Member m2 = new Member("임꺽정", 30);
    Member m3 = new Member("유관순", 17);

    ArrayList<Member> list = new ArrayList<>();
    list.add(m1);
    list.add(m2);
    list.add(m3);

    //    list.forEach(new Consumer<Member>() {
    //      @Override
    //      public void accept(Member t) {
    //        System.out.printf("%s(%d)\n", t.name, t.age);
    //      }
    //
    //    });


    //    list.forEach(t ->  System.out.printf("%s(%d)\n", t.name, t.age));

    //    Iterator<Member> iterator = list.iterator();
    //    while(iterator.hasNext()) {
    //      Member m = iterator.next();
    //      System.out.printf("%s(%d)\n", m.name, m.age);
    //    }


    // Member[] arr = new Member[list.size()];
    //    Object[] arr = list.toArray();
    // Member[] arr = list.toArray(new Member[0]); // 0자리에 list.size도 가능 => 0으로 하면 가비지 생성

    // 향상된 for문의 뒤에는 iterable 형태가 있는데 이 친구는 list의 최상위 인터페이스임

    //    for (Member m : list) {
    //      System.out.printf("%s(%d)\n", m.name, m.age);
    //    }


    class MyConsumer implements Consumer<Member> {
      @Override
      public void accept(Member m) {
        // forEach() 에서 반복문을 돌릴 때
        // Consumer 규칙에 따라 
        // 각 항목에 대해 이 메서드를 호출한다.
        System.out.printf("이름: %s, 나이: %d\n", m.name, m.age);
      }
    }

    list.forEach(new MyConsumer());
    //    list.forEach(t ->  System.out.printf("%s(%d)\n", t.name, t.age));
  }


  //  static void printUserInfo(Memeber m) {
  //    System.out.printf("%s(%d)\n", m.name, m.age);
  //  }

}






