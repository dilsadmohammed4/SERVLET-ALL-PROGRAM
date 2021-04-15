<html>
<head><title>Combination</title></head>
<body>
<%
int p=Integer.parseInt(request.getParameter("num1"));
int q=Integer.parseInt(request.getParameter("num2"));
int r=Integer.parseInt(request.getParameter("num3"));
%>
A= <%=p%><br>
B= <%=q%><br>
C= <%=r%><br>
Possible Combination:<br>
<%
int[] input={p,q,r};
for (int x = 0; x < 3; x++) {
    for (int y = 0; y < 3; y++) {
        for (int z = 0; z < 3; z++) {
        if (x != y && y != z && z != x) {
            out.println(input[x]+""+input[y]+""+input[z]);
%>
<br>
<%

            }
        }
    }
}
%>



</body>
</html>