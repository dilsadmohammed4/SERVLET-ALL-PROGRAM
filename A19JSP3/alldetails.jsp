<jsp:useBean id="userinfo" class="mun.AllNumber"></jsp:useBean>
<%
out.print("Sum of 2, 3, 5 is "+userinfo.AllSum(2,3,5));
%><br>
<%
out.print("Product of 2, 3, 5 is "+userinfo.AllProduct(2,3,5));
%>