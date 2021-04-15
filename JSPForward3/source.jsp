<b>From source.jsp</b>
<br>
<% int a=7;
int b=3;
int c=a+b;%>
<jsp:forward page="destination.jsp">
<jsp:param name="p1" value="<%="a="+a+","+"b="+b%>"/>
<jsp:param name="p2" value="<%=c%>"/>
</jsp:forward>
<b>from source.jsp end</b>