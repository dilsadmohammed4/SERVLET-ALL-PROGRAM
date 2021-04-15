<html>
<head><title>Sum</title></head>
<body>
<%
int x=Integer.parseInt(request.getParameter("num1"));
int y=Integer.parseInt(request.getParameter("num2"));
int sum,sub,mul;
double div;
sum=x+y;
sub=x-y;
div=x/y;
mul=x*y;
%>
x= <%=x%><br>
y= <%=y%><br>
Addition: <%=sum%><br>
Subtraction: <%=sub%><br>
Multiplication: <%=mul%><br>
Division: <%=div%><br>
</body>
</html>