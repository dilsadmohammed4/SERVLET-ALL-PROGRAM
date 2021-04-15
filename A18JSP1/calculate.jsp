<html>
<head><title>Total Price</title></head>
<body>
<%
String pro1 = request.getParameter("pro1");
String pro2 = request.getParameter("pro2");
String pro3 = request.getParameter("pro3");
int u1=Integer.parseInt(request.getParameter("u1"));
int u2=Integer.parseInt(request.getParameter("u2"));
int u3=Integer.parseInt(request.getParameter("u3"));
int price1=Integer.parseInt(request.getParameter("price1"));
int price2=Integer.parseInt(request.getParameter("price2"));
int price3=Integer.parseInt(request.getParameter("price3"));
int p1=u1*price1;
int p2=u2*price2;
int p3=u3*price3;
double total,percentage;
total = u1*price1 + u2*price2 + u3*price3;
%>

    <table width="30%">
        <tr>
            <td>Sl No.</td>
            <td>Item</td>
            <td></td>
            <td>Unit</td>
            <td></td>
            <td>Price</td>
        </tr>
        <tr>
            <td>1. </td>
            <td><%=pro1%></td>
            <td> x </td>
            <td><%=u1%></td>
            <td> = </td>
            <td><%=p1%></td>
        </tr>
        <tr>
            <td>2.</td>
            <td><%=pro2%></td>
            <td> x </td>
            <td><%=u2%></td>
            <td> = </td>
            <td><%=p2%></td>
        </tr>
        <tr>
            <td>3.</td>
            <td><%=pro3%></td>
            <td> x </td>
            <td><%=u3%></td>
            <td> = </td>
            <td><%=p3%></td>
        </tr>
        <tr>
            <td></td>
            <td></td>
            <td></td>
            <td> Total: </td>
            <td> = </td>
            <td><%=total%></td>
        </tr>
    </table>

</body>
</html>