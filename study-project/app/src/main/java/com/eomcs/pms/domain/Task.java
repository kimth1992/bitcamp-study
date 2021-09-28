package com.eomcs.pms.domain;

import java.sql.Date;
import com.eomcs.csv.CsvValue;

public class Task implements CsvValue{
  private int no;
  private String content;
  private Date deadline;
  private Member owner;
  private int status;
  private Project project;

  @Override
  public String toString() {
    return "Task [no=" + no + ", content=" + content + ", deadline=" + deadline + ", owner=" + owner
        + ", status=" + status + ", project=" + project + "]";
  }



  @Override
  public String toCsvString() {
    return String.format("%d,%s,%s,%d,%d,%s",
        this.getNo(),
        this.getContent(),
        this.getDeadline(),
        this.getStatus(),
        this.getOwner().getNo(),
        this.getOwner().getName());
  }

  @Override
  public void loadCsv(String csv) {

    String[] values = csv.split(",");

    this.setNo(Integer.valueOf(values[0]));
    this.setContent(values[1]);
    this.setDeadline(Date.valueOf(values[2]));
    this.setStatus(Integer.valueOf(values[3]));

    Member m = new Member();
    m.setNo(Integer.valueOf(values[4]));
    m.setName(values[5]);

    this.setOwner(m);

  }


  public int getNo() {
    return no;
  }
  public void setNo(int no) {
    this.no = no;
  }
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }
  public Date getDeadline() {
    return deadline;
  }
  public void setDeadline(Date deadline) {
    this.deadline = deadline;
  }
  public int getStatus() {
    return status;
  }
  public void setStatus(int status) {
    this.status = status;
  }
  public Project getProject() {
    return project;
  }
  public void setProject(Project project) {
    this.project = project;
  }
  public Member getOwner() {
    return owner;
  }
  public void setOwner(Member owner) {
    this.owner = owner;
  }



}
