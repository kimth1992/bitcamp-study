package com.eomcs.pms.handler;

import com.eomcs.pms.domain.Task;

public class TaskList2 {

  static class Node{

    Task task;
    Node next;

    Node(Task task){
      this.task = task;
    }
  }

  Node head;
  Node tail;
  int size = 0;

  public void add(Task task) {
    Node node = new Node(task);

    if(head == null) {
      head = tail = null;
    } else {
      tail.next = node;
      tail = node;
    }

    size++;
  }

  public Task[] toArray() {
    Task[] arr = new Task[this.size]; // 배열에 저장된 값을 담을 정도의 크기를 가진 새 배열을 만든다.
    Node node = head;

    for(int i = 0 ; i < size ; i++) {
      arr[i] = node.task;
      node = node.next;
    }
    return arr;
  }

  public Task findByNo(int no) {
    Node node = head;
    while(node != null) {
      if(node.task.no == no) {
        return node.task;
      }
      node =node.next;
    }
    return null;
  }


  public boolean remove(Task task) {
    Node node = head;
    Node prev = null;

    while (node != null) {
      if (node.task == task) {
        if (node == head) {
          head = node.next;
        } else {
          prev.next = node.next; // 이전 노드를 다음 노드와 연결한다.
        }

        node.next = null; // 다음 노드와의 연결을 끊는다.

        if (node == tail) { // 삭제할 현재 노드가 마지막 노드라면
          tail = prev; // 이전 노드를 마지막 노드로 설정한다.
        }
        size--;
        return true;
      }

      // 현재 노드가 아니라면,
      prev = node; // 현재 노드의 주소를 prev 변수에 저장하고,
      node = node.next; // node 변수에는 다음 노드의 주소를 저장한다.
    }

    return false;

  }


}








