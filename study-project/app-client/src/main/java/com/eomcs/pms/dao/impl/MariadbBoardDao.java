package com.eomcs.pms.dao.impl;

import java.sql.Connection;
import java.util.List;
import com.eomcs.pms.dao.BoardDao;
import com.eomcs.pms.domain.Board;

// 역할
// - 게시글을 데이터를 서버를 통해 관리한다.
//
public class MariadbBoardDao implements BoardDao {

  Connection con;

  public MariadbBoardDao(Connection con) {
    this.con = con;
  }

  @Override
  public void insert(Board board) throws Exception {


  }

  @Override
  public List<Board> findAll() throws Exception {
    return null;
  }

  @Override
  public List<Board> findByKeyword(String keyword) throws Exception {
    return null;
  }

  @Override
  public Board findByNo(int no) throws Exception {
    return null;
  }

  @Override
  public void update(Board board) throws Exception {
  }

  @Override
  public void delete(int no) throws Exception {
  }
}



