<html>
<title>First JSP</title>
<body>
<h1><center>Resume</center></h1>

<table>
<tr><td><b>Date And Time:</b><% java.util.Date d=new java.util.Date();out.println(" "+d.toString()); %></td></tr>
<tr><td><% out.println("Name: Dilsad Mohammed."); %></td></tr>
<tr><td><% out.println("Roll: 1970006."); %></td></tr>
<tr><td><% out.println("Course: MCA."); %></td></tr>
<tr><td><% out.println("Roll: 1970006."); %></td></tr>
<tr><td><% out.println("CGPA: Ungoing..."); %></td></tr>

</table>
</body>
</html>