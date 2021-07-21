package com.eomcs.pms.handler;

import java.sql.Date;
import com.eomcs.pms.domain.Board;
import com.eomcs.util.Prompt;

public class BoardHandler {

  static final int MAX_LENGTH = 5;

  Board[] boards = new Board[MAX_LENGTH]; //
  int size = 0;

  public void add() {


    System.out.println("[새 게시글]");
    Board board = new Board();

    board.no = Prompt.inputInt("번호> ");
    board.title = Prompt.inputString("제목> ");
    board.content = Prompt.inputString("내용> ");
    board.writer = Prompt.inputString("작성자> ");

    System.out.println("게시판에 입력되었습니다.");

    board.registeredDate = new Date(System.currentTimeMillis());
    // board.viewCount = 0;

    boards[size++] = board;


  }


  public void list() {
    System.out.println("[게시글 목록]");

    for(int i = 0; i < size ; i++) {
      System.out.printf("%d, %s, %s, %s, %d, %d\n", 
          this.boards[i].no,
          this.boards[i].title,
          this.boards[i].writer,
          this.boards[i].registeredDate,
          this.boards[i].viewCount,
          this.boards[i].like);
    }
  }

  public void detail() {
    System.out.println("[게시글 상세보기]");
    int no = Prompt.inputInt("번호? ");

    Board board = null;

    for(int i = 0 ; i < size ; i++) {
      if(boards[i].no == no) {
        board = boards[i];
        break;
      }
    }


    if(board == null) {
      System.out.println("해당 번호의 게시글이 없습니다.");
      return;
    }

    System.out.printf("제목 : %s\n", board.title);
    System.out.printf("내용 : %s\n", board.content);
    System.out.printf("작성자 : %s\n", board.writer);
    System.out.printf("등록일 : %s\n", board.registeredDate);
    System.out.printf("조회수 : %s\n", ++board.viewCount);

    //
    //        if(existNo(no)) {
    //            
    //          System.out.printf("제목: %s\n"
    //              + "내용: %s\n"
    //              + "작성자 : %s\n"
    //              + "등록일 : %s\n"
    //              + "조회수 : %d\n", 
    //              boards[no-1].title,
    //              this.boards[no-1].content,
    //              this.boards[no-1].writer,
    //              this.boards[no-1].registeredDate,
    //              ++this.boards[no-1].viewCount);
    //        }
    //        else {
    //          System.out.println("해당번호의 게시글이 없습니다.");
    //          return;
    //        }
  }

  //  boolean existNo(int no) {
  //    for (int i = 0; i < size; i++) {
  //      if (boards[i].no == no) {
  //        return true;
  //      }
  //    }
  //    return false;
  //  }


  public void update() {
    System.out.println("[게시글 변경]");
    int no = Prompt.inputInt("번호? ");
    Board board = null;

    for(int i = 0 ; i < this.size ; i++) {
      if(boards[i].no == no) {
        board = boards[i];
        break;
      }
    }

    if(board == null) {
      System.out.println("해당 번호의 게시글이 없습니다.");
      return;
    }

    System.out.printf("제목(%s)", boards[2].title);
    //Prompt.inputString("제목(%s)", boards[2].title)
    String label = String.format("제목(%s)? : \n",board.title);
    String title = Prompt.inputString(label);

    //label = String.format("내용(%s)? : \n", board.content);
    String content = Prompt.inputString(String.format("내용(%s)? : \n", board.content));


    String input = Prompt.inputString("정말 변경하시겠습니까?(y/N)");
    if(input.equalsIgnoreCase("n") || input.length() == 0) {
      System.out.println("게시글 변경을 취소하였습니다.");
    } else if(input.equalsIgnoreCase("y")) {
      board.title = title;
      board.content = content;
      System.out.println("게시글을 변경하였습니다.");
    }

  }


  public void delete() {
    System.out.println("[게시글 삭제]");
    int no = Prompt.inputInt("번호? ");

    Board board = null;
    int i = 0;
    int j = 0;

    for(i = 0 ; i < this.size ; i++) {
      if(boards[i].no == no) {
        board = boards[i];
        j = i;
        break;
      }
    }

    if(board == null) {
      System.out.println("해당 번호의 게시글이 없습니다.");
      return;
    }

    String input = Prompt.inputString("정말 삭제하시겠습니까?(y/N)");
    if(input.equalsIgnoreCase("n") || input.length() ==0) {
      System.out.println("게시글 삭제를 취소하였습니다.");
    } else if(input.equals("y")) {

      for(i = 0 ; i < size - j; i++) {

        boards[j] = boards[j+1];
        j++;

      }
      boards[--size] = null;

      System.out.println("게시글을 삭제하였습니다.");
    }


  }


}
