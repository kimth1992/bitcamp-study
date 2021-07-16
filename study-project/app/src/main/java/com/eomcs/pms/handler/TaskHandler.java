package com.eomcs.pms.handler;

import com.eomcs.pms.domain.Task;
import com.eomcs.util.Prompt;

public class TaskHandler {
  // 작업 정보
  static final int TASK_LENGTH = 100;
  static int tSize = 0;
  static Task[] tasks = new Task[TASK_LENGTH];


  public static void add() {
    System.out.println("[작업 등록]");

    Task task = new Task();

    task.No = Prompt.inputInt("번호? ");
    task.Content = Prompt.inputString("내용? ");
    task.Deadline = Prompt.inputDate("마감일? ");

    System.out.println("상태?");
    System.out.println("0: 신규");
    System.out.println("1: 진행중");
    System.out.println("2: 완료");
    task.Status = Prompt.inputInt("> ");
    task.Owner = Prompt.inputString("담당자? ");

    tasks[tSize++] = task;


  }

  public static void list() {
    System.out.println("[작업 목록]");

    for (int i = 0; i < tSize; i++) {
      String stateLabel = null;
      switch (tasks[i].Status) {
        case 1:
          stateLabel = "진행중";
          break;
        case 2:
          stateLabel = "완료";
          break;
        default:
          stateLabel = "신규";
      }
      // 번호, 작업명, 마감일, 프로젝트, 상태, 담당자
      System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
          tasks[i].No, 
          tasks[i].Content, 
          tasks[i].Deadline, 
          stateLabel, 
          tasks[i].Owner);
    }
  }
}
