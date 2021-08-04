package com.eomcs.pms.handler;

import com.eomcs.pms.domain.Board;

public class Node {
  Board board;  // 값
  Node next; // 주소


  public Node(Board board) {
    this.board = board;
  }
}