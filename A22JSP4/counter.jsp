<%@ page import="java.io.*,java.util.*" %>
<html>
<head>
<title>Application Implicit Object Example</title>
</head>
<body>
<%
//Comment: This would return null for the first time
Integer counter= (Integer)application.getAttribute("numberOfVisits");
if( counter ==null || counter == 0 ){
//Comment: For the very first Visitor
counter = 1;
}else{
//Comment: For Others
counter = counter+ 1;
}
application.setAttribute("numberOfVisits", counter);
%>
<h3>Total number of hits to this Page is: <%= counter%></h3>
</body>
</html>