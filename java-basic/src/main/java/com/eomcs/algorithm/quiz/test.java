package com.eomcs.algorithm.quiz;

//출처: codefights.com
//
//숫자 배열이 있다.
//나누어 0이 떨어지는 수가 몇 쌍이 있는지 구하라!
//
//한 줄에 버그가 있다. 고쳐라! 
public class test {

  public static int divisorsPairs(int[] sequence) {

    int result = 0;
    for(int i = 0 ; i < sequence.length ; i++) {
      for(int j = i+1; j < sequence.length ; j++) {
        if(sequence[i] % sequence[j] == 0 || sequence[j] % sequence[i] == 0)
          result++;

        System.out.printf("%d<----->%d\n",sequence[i], sequence[j]);

      }
    }
    return result;

  }

  public static void main(String[] args) {
    int[] values = {8,4,2,3,6,10,5};
    System.out.println(divisorsPairs(values));

  }

}
