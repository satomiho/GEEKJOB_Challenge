<%-- 
    Document   : DataSousa2
    Created on : 2017/11/24, 13:06:45
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
            out.print(request.getParameter("name"));
            out.print(request.getParameter("gender"));
            out.print(request.getParameter("mulText"));
        %>    
    </body>
</html>
