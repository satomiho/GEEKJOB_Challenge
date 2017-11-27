<%-- 
    Document   : DataSousa4
    Created on : 2017/11/24, 14:18:47
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
        <form action ="./DataSousa4-2.jsp"method="get">
        
            総額<input type="number" name="total"><br>
            個数<input type="number" name="count"><br>
            商品種別<input type="radio" name="type"value="1">雑貨
            <input type="radio" name="type" value="2">生鮮食品
            <input type="radio" name="type" value="3">その他<br>
            
            <input type="submit" name="btnSubmit"value="送信">
                                
        </form>
    </body>
</html>
