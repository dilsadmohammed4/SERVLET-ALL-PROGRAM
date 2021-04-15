<html>
<body>

<%@ page import="java.util.*"%>
<% int n=Integer.parseInt(request.getParameter("x"));
%>
<%! public int square(int n){ 
return n*n;
}%>
<font color=red size=7><%=square(n)%></font>


</body>
</html>
