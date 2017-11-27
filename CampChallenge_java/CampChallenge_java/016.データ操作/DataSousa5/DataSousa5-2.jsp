<%-- 
    Document   : DataSousa5-2
    Created on : 2017/11/27, 10:48:38
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
        <%
        request.setCharacterEncoding("UTF-8");
        String num = request.getParameter("num");
        
        int num1 = Integer.parseInt(num);
        out.print("元の値："+num1+"<br>");
        
        while(num1 > 1){
            if(num1%2==0){
                num1=num1/2;
                out.print("2 ");
            }else if(num1%3==0){
                num1=num1/3;
                out.print("3 ");
            }else if(num1%5==0){
                num1=num1/5;
                out.print("5 ");
            }else if(num1%7==0){
                num1=num1/7;
                out.print("7 ");
            }else{
                out.print("余った値"+num1);
                break;
            }
        
            
        }
        %>
    </body>
</html>
