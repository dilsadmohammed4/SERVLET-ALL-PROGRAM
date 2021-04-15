<html>
<head>
<title>Displaying User Details</title>
</head>
<body>
<%
String username= (String) pageContext.getAttribute("UName",
PageContext.SESSION_SCOPE);
String userpassword= (String) pageContext.getAttribute("UPassword",
PageContext.SESSION_SCOPE);
out.println("Hi "+username);
out.println("Your Password is: "+userpassword);
%>
</body>
</html>