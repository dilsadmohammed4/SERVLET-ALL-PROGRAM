<jsp:useBean id="userinfo" class="num.Square"></jsp:useBean>
<%
out.print("Square of 5 is "+userinfo.square(5));
%><br>
<%
out.print("Cube of 5 is "+userinfo.cube(5));
%>