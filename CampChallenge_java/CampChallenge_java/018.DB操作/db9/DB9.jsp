<%-- 
    Document   : DB9
    Created on : 2017/12/04, 15:10:36
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <body>
        <form method="post" action="db9">
        ID<br><input type="number" name="profilesID"><br>
        名前<br><input type="text" name="name"><br>
        tel<br><input type="text" name="tel"><br>
        年齢<br><input type="number" name="age"><br>
        生年月日<br><input type="number" name="birthday"><br><br>
        
        <input type="submit" name="btnSubmit" value="送信">      
        
        </form>
    </body>
</html>
