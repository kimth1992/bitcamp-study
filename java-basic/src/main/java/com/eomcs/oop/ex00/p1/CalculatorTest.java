package com.eomcs.oop.ex00.p1;

public class CalculatorTest {
  public static void main(String[] args) {
    // 2 + 3 + 4 - 7 * 3 = 6
    // 3 * 2 - 1 = 5

    // 메서드를 만들고 보니 결과값만 리턴하고 저장할 변수를 따로 생성하지 않았습니다.
    // 어쩔수 없이 메인메서드에서 만들어서 저장해줍니다.

    int r1 = 0;
    int r2 = 0;

    r1 = Calculator.plus(r1, 2);
    r1 = Calculator.plus(r1, 3);
    r1 = Calculator.plus(r1, 4);
    r1 = Calculator.minus(r1, 7);
    r1 = Calculator.multiple(r1, 3);

    r2 = Calculator.plus(r2, 3);
    r2 = Calculator.multiple(r2, 2);
    r2 = Calculator.minus(r2, 1);

    System.out.println(r1);
    System.out.println(r2);
  }


}

// 만들고 나니 계산하는 곳에서 결과값을 출력하는게 편할 것 같아서 그렇게 만들어 보겠습니다.


