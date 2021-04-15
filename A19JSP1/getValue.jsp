<jsp:useBean id="ab" class="p.Student" scope="session" />
<center> <font color="red" size="5" >
   <font size="6" color="green">NAME IS :   <jsp:getProperty name="ab" property="name"/></font><br>
        <font size="6" color="green">Age IS :   <jsp:getProperty name="ab" property="age" /></font><br>
        <font size="6" color="green">Salary IS :   <jsp:getProperty name="ab" property="salary" /></font>