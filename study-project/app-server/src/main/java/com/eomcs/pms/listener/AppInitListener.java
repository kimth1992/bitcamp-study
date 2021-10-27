package com.eomcs.pms.listener;

import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import com.eomcs.pms.dao.MemberDao;

@WebListener
public class AppInitListener implements ServletContextListener{

  SqlSession sqlSession = null;

  @Override
  public void contextInitialized(ServletContextEvent sce) {
    System.out.println("애플리케이션 시작됨!");

    try {
      sqlSession = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream(
          "com/eomcs/pms/conf/mybatis-config.xml")).openSession();

      // sqlsession 객체를 통해 memberdao 객체 구현
      MemberDao memberDao = sqlSession.getMapper(MemberDao.class);

      // 모든 웹 컴포넌트(서블릿, 리스너, 필터)가 공유할 객체를 두는 저장소
      ServletContext sc = sce.getServletContext();
      // sc는 웹애플리케이션공용저장소

      // 웹 애플리케이션 공용 저장소에 DAO 객체를 보관한다.
      // => 이 저장소에 보관된 객체는 서블릿에서 사용할 것이다.
      sc.setAttribute("memberDao", memberDao);
      sc.setAttribute("sqlSession", sqlSession);

    } catch (IOException e) {
      System.out.println("DAO 객체 준비 중 오류 발생!");
    }
  }

  @Override
  public void contextDestroyed(ServletContextEvent sce) {
    System.out.println("애플리케이션 종료됨!");

    sqlSession.close();
  }

}
