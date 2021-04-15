<html>
<head><title>Sum</title></head>
<body>
<%
int x=Integer.parseInt(request.getParameter("no1"));
int y=Integer.parseInt(request.getParameter("no2"));
out.print("X :"+x+"<br>");
out.print("Y :"+y+"<br>");
out.print("Sum :"+(x+y)+"<br>");
out.print("Sub :"+(x-y)+"<br>");
out.print("Mul :"+(x*y)+"<br>");
out.print("Div :"+(x/y)+"<br>");
%>
 </body>
</html>