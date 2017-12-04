<%-- 
    Document   : DB12
    Created on : 2017/12/04, 16:42:17
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>複合検索</title>
    </head>
    <body>
        <form method="post" action="db12">
            名前<br><input type="text" name="name"><br>
            年齢<br><input type="number" name="age"><br>
            誕生日<br><input type="text" name="birthday"><br>
            
            <input type="submit" name="btnSubmit" value="検索">
            
        </form>
    </body>
</html>
