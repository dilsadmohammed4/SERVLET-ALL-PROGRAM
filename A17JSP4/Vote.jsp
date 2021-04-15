<html>
<head><title>Eligibility</title></head>
<body>
<%
String name = request.getParameter("name");
int num=Integer.parseInt(request.getParameter("num"));
%>
Name: <%=name%><br>
Age:<%=num%><br>
<%

if (num >= 18) {
        out.println("Eligible For Voting.");
    }
    else if(num<=0){
        out.println("Enter Correct Age.");
    }
    else {
        out.println("Not Eligible For Voting");
    }
%>
</body>
</html>