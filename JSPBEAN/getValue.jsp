<jsp:useBean id="ab" class="p.BeanDemo" scope="session" />
<center> <font color="red" size="5" >
   <font size="6" color="green">NAME IS :   <jsp:getProperty name="ab" property="name"/></font><br>
        <font size="6" color="green">ROLL IS :   <jsp:getProperty name="ab" property="roll" /></font>