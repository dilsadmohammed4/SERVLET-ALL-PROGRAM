<jsp:useBean id="userinfo" class="mydetails.Details"></jsp:useBean>
<jsp:setProperty property="*" name="userinfo"/>
You have enterted below details:<br>
<jsp:getProperty property="username" name="userinfo"/><br>
<jsp:getProperty property="password" name="userinfo"/><br>
<jsp:getProperty property="age" name="userinfo" /><br>