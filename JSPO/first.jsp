<html>
<b>Implicit objects utilization</b><hr>
<body>
Mr/Ms:<b><font size="5" color="green"><%=request.getParameter("t1")%></font>:welcome to Advance Java Class:</b><br><br>
<table border="1" color="blue">
<tr><td>request object class name is</td>
<td><i><%=request.getClass()%></i></td></tr>
<tr><td>response object class name is </td>
<td><i><%=response.getClass()%></i></td></tr>
<tr><td>session object class name is </td>
<td><i><%=session.getClass()%></i></td></tr>
<tr><td>application object class name is </td>
<td><i><%=application.getClass()%></i></td></tr>
<tr><td>pageContext object class name is</td>
<td><i><%=pageContext.getClass()%></i></td></tr>
<tr><td>page object class name is </td>
<td><i><%=page.getClass()%></i></td></tr>
<tr><td>exception object is not visible inside normal page it visible inside only in error page</td>
<td><%--<%=exception.getClass()%>--%></td></tr>
<tr><td>config object class name is </td>
<td><i><%=config.getClass()%></i></td></tr>
<tr><td>out object class name is </td>
<td><i><%=out.getClass()%></i></td></tr>
<tr><td><b>other method call on request object</b></td></tr>
<tr><td>request header</td>
<td><%=request.getHeader("user-agent")%></td></tr>
<tr><td>request method</td>
<td><%=request.getMethod()%></td></tr>
<tr><td>request URI</td>
<td><%=request.getRequestURI()%></td></tr>
<tr><td>request protocol</td>
<td><%=request.getProtocol()%></td></tr>
</table></html>