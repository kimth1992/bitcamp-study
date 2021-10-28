<%@page import="com.eomcs.pms.domain.Member"%>
<%@page import="org.apache.ibatis.session.SqlSession"%>
<%@page import="com.eomcs.pms.dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces = "true"%>
<%
int no = Integer.parseInt(request.getParameter("no"));

Member member = memberDao.findByNo(no);

if (member == null) {
  throw new Exception("해당 번호의 회원이 없습니다.");
} else {
  memberDao.delete(no);
  sqlSession.commit();
}
  response.sendRedirect("MemberList.jsp");
%>
  

<%!
// 자바 서블릿 클래스를 만들 떄 클래스에 선언할 변수와 메서드를 작성한다.
  MemberDao memberDao;
SqlSession sqlSession;

public void jspInit() {
  ServletConfig config = getServletConfig();
  ServletContext 웹애플리케이션공용저장소 = config.getServletContext();
  memberDao = (MemberDao)웹애플리케이션공용저장소.getAttribute("memberDao");
  sqlSession =(SqlSession) 웹애플리케이션공용저장소.getAttribute("sqlSession");
}
%>