<%-- 
    Document   : switchbun1
    Created on : 2017/10/30, 13:37:22
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding= "UTF-8"%>
<%
int num = 1;
switch(num){
    case 1:
        out.print("one");
        break;  
    case 2:
        out.print("two");
        break;
    default:
        out.print("想定外");
        break;
        
}


%>
