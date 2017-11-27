<%-- 
    Document   : DataSousa4-2
    Created on : 2017/11/24, 16:55:37
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
        String total= request.getParameter("total");
        String count =request.getParameter("count");
        String type=request.getParameter("type");
        
        int total1=Integer.parseInt(total);
        int count1=Integer.parseInt(count);
        int type1=Integer.parseInt(type);
        
        switch(type1){
            case 1:
                out.print("雑貨<br>");
                break;
            case 2:
                out.print("生鮮食品");
                break;
            case 3:
                out.print("その他");
                break;
        }
        int answer=total1/count1;
        out.print("ひとつにつき"+answer+"円です<br>");
        
        if(total1>=5000){
            out.print((total1*0.05)+"ポイント加算されました");
        }else{
            out.print((total1*0.01)+"ポイント加算されました");
        }
        
        %>
    </body>
</html>
