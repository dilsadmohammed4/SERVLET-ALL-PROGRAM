<html>
<head>
<title>JSP forward example with parameters</title>
</head>
<body>
<jsp:forward page="display.jsp">
<jsp:param name="name" value="Samson" />
<jsp:param name="site" value="jspnew.com" />
<jsp:param name="topiclname" value="jsp forward action" />
<jsp:param name="reqcamefrom" value="index.jsp" />
</jsp:forward>
</body>
</html>