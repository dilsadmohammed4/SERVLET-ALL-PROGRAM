<html>
<head><title>Check Credentials</title>
</head>
<body>
<%
String uid=request.getParameter("id");
String password=request.getParameter("pass");
session.setAttribute("session-uid", uid);
if(uid.equals("admin") && password.equals("admin"))
{
response.sendRedirect("success.jsp");
}
else
{
response.sendRedirect("failed.jsp");
}
%>
</body>
</html>