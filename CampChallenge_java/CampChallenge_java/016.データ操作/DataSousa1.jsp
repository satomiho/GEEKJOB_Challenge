<%-- 
    Document   : DataSousa1
    Created on : 2017/11/24, 11:32:24
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
        <form action="./DataSousa2.jsp"method="post">
            氏名<input type="text"name="name"><br>
            性別<input type="radio"name="gender"value="男">男
            <input type="radio"name="gender"value="女">女<br>
            
            趣味<textarea name="mulText"></textarea><br>
            <input type="submit"name="btnSubmit"value="送信">
            
        </form>
    </body>
</html>
