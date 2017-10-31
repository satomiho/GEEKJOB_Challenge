<%-- 
    Document   : while
    Created on : 2017/10/31, 15:49:28
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
int num=1000;
while(num>100){
    num=num/2;
    out.print(num+"<br>");  
}



%>