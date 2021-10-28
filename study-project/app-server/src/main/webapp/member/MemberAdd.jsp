<%@page import="org.apache.ibatis.session.SqlSession"%>
<%@page import="com.eomcs.pms.domain.Member"%>
<%@page import="com.eomcs.pms.dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces = "true"%>
<%
Member member = new Member();

member.setName(request.getParameter("name"));
member.setEmail(request.getParameter("email"));
member.setPassword(request.getParameter("password"));
member.setPhoto(request.getParameter("photo"));
member.setTel(request.getParameter("tel"));

memberDao.insert(member);
sqlSession.commit();
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