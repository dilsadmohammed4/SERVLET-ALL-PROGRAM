<html>
<head><title>10's Table</title></head>
<body>
<%
int n=Integer.parseInt(request.getParameter("num1"));
%>

Entered Number Is: <%=n%><br>
<p>10'S Table Of <%=n%> Are:</p>
<%
for(int i=1;i<=10;i++){
%>
<%
    out.print(n+" * "+i+" = "+n*i+" ");
%>
<br>
<%
}
%>

</body>
</html>