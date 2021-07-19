package com.eomcs.pms.handler;

import java.sql.Date;
import com.eomcs.pms.domain.Board;
import com.eomcs.util.Prompt;

public class BoardHandler {

  Board[] boards = new Board[100];
  int size = 0;

  public static void add(BoardHandler that) {


    System.out.println("[새 게시글]");
    Board board = new Board();

    board.no = Prompt.inputInt("번호> ");
    board.title = Prompt.inputString("제목> ");
    board.content = Prompt.inputString("내용> ");
    board.writer = Prompt.inputString("작성자> ");

    System.out.println("게시판에 입력되었습니다.");

    board.registeredDate = new Date(System.currentTimeMillis());
    // board.viewCount = 0;

    that.boards[that.size++] = board;


  }


  public static void list(BoardHandler that) {
    System.out.println("[게시글 목록]");

    for(int i = 0; i < that.size ; i++) {
      System.out.printf("%d, %s, %s, %s, %d, %d\n", 
          that.boards[i].no,
          that.boards[i].title,
          that.boards[i].writer,
          that.boards[i].registeredDate,
          that.boards[i].viewCount,
          that.boards[i].like);
    }
  }

}
