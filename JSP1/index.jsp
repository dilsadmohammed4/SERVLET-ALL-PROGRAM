<!doctype html>
<html>

<head>
    <title>Serv-JSP Comm</title>
</head>

<body>
    <% if(request.getAttribute("message") !=null) { out.println("<h1>" + request.getAttribute("message") + "</h1>");
        }
        %>

        <form action="ServletComm">
            <center>
                <font color='blue' size='8'>Enter A Number:</font>
                <input type='text' size='50' name='t1'><br><br>
                <input type='submit' value='SUBMIT' name='b1' />
                &nbsp;<input type='reset' value='RESET' name='b2' />
            </center>
        </form>
</body>

</html>