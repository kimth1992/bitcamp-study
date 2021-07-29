// 오버라이딩(overriding) - 오버라이딩을 하는 이유?
package com.eomcs.oop.ex06.c;



public class Exam0020 {

  static class Score {

    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;


    public void compute() {
      this.sum = this.kor + this.eng + this.math;
      this.aver = this.sum / 3f;
    }
  }

  static  class Score2 extends Score {
    protected int music;
    protected int art;


    public void compute() {
      this.sum = this.kor + this.eng + this.math + this.music + this.art;
      this.aver = this.sum / 5f;
    }
  }

  public static void main(String[] args) {



    Score2 score = new Score2();

    score.kor = 100;
    score.eng = 100;
    score.math = 100;
    score.music = 50;
    score.art = 50;

    // 새로 추가한 필드에 맞춰 계산이 달라야 한다.
    score.compute();

    System.out.printf("%d(%f)\n", score.sum, score.aver);

    // Score2 클래스의 변경 사항에 맞춰
    // compute() 메서드를 재정의 하였다.
    // 그래서 합계와 평균이 제대로 나오는 것이다.

  }
}
