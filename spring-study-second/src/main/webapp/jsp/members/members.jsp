<%@ page import="hello.survlet.basic.domain.member.MemberRepository" %>
<%@ page import="java.util.List" %>
<%@ page import="hello.survlet.basic.domain.member.Member" %><%--
  Created by IntelliJ IDEA.
  User: yangjeong-woo
  Date: 2026. 4. 15.
  Time: 오전 12:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  MemberRepository memberRepository = MemberRepository.getInstance();
  List<Member> members = memberRepository.findAll();
%>
<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
