package com.eomcs.pms;

public class Test {

  static void deleteValue(int[] arr, int value) {


    int index = -1;
    for(int i = 0 ; i < arr.length ; i++) {
      if(arr[i] == value) {
        index = i;
        break;
      }
    }

    for(int i = index +1 ; i < arr.length ; i++) {

      arr[i-1] = arr[i];  
    }
    arr[arr.length -1] = -1;
  }

  public static void main(String[] args) {
    int[] arr = {100, 200, 300};
    deleteValue(arr, 100);

    for (int value : arr) {
      if(value == -1)
        break;
      System.out.println(value);
    }
  }
}
