<html>
<head><title>Total Mark</title></head>
<body>
<%
String name = request.getParameter("name");
String rollNo = request.getParameter("rollNo");
String branch = request.getParameter("branch");
int java=Integer.parseInt(request.getParameter("java"));
int ooad=Integer.parseInt(request.getParameter("ooad"));
int mc=Integer.parseInt(request.getParameter("mc"));
int cg=Integer.parseInt(request.getParameter("cg"));
int ddms=Integer.parseInt(request.getParameter("ddms"));
%>
Name: <%=name%><br>
Roll No:<%=rollNo%><br>
Branch:<%=branch%><br>
<%
double total,percentage;
total = java + ooad + mc + cg + ddms;
percentage=(total/500.00)*100;
%>

 Total Mark: <%=total%><br>
 Percentage: <%=percentage%><br>
 <%
 if(percentage>=90){
      out.println("O Grade");
 }
 else if(percentage>=80&&percentage<90){
     out.println("E Grade");
 }
 else if(percentage>=70&&percentage<80){
     out.println("A Grade");
 }
 else if(percentage>=60&&percentage<70){
     out.println("B Grade");
 }
 else if(percentage>=50&&percentage<60){
     out.println("C Grade");
 }
 else{
       out.println("Fail");
 }

%>
</body>
</html>