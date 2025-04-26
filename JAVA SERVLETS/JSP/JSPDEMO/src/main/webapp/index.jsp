<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Demo on Eclipse</title>
</head>
<body>
	<%@ include file="header.jsp" %>
	<h1>Hello this is a working dynamic page</h1>
	
	<%
	Cookie userCookie = new Cookie("newUser","true");
	Cookie username = new Cookie("userName","abhishek");
	response.addCookie(userCookie);
	response.addCookie(username);
	%>
	
	<%
		Cookie[] cookie = request.getCookies();
		for(Cookie cookies: cookie){
			out.println(cookies.getName()+":"+cookies.getValue()+"\n");
		}
		
	%>
	<script>
	localStorage.setItem("Cart",{"ITEM1 ":"APPLES","ITEM 2":"MANGOES"});
	alert(localStorage.getItem("Cart")["ITEM1"]);
	</script>
	<%-- <%=cookie[1].getName() %>:<%=cookie[1].getValue() %> --%>
	<form action="HelloServlets" method="post">
		<label>Name</label>
		<input type="text" name="username"/>
		<input type="submit" value="Submit"/>
	</form>
	<% out.print("Hello !"+session.getAttribute("username")); %>
</body>
</html>