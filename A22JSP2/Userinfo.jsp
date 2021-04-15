<%@ page import = " java.util.* " %>
<html>
<body>
<%
String username=request.getParameter("uname");
String password=request.getParameter("pass");
out.print("Name: "+username+" Password: "+password);
%>
</body>
</html>