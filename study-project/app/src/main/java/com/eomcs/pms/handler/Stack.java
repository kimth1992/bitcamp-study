package com.eomcs.pms.handler;

public class Stack extends ArrayList{

  // 스택에 값 추가
  // 맨 끝에 추가하기 때문에 기존의 add() 메서드로 처리한다.

  public void push(Object item) {
    this.add(item);
  }

  public Object pop() {
    return this.remove(this.size() - 1);
  }

}
