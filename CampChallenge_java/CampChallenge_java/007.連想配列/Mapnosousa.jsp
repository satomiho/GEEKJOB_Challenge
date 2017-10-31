<%-- 
    Document   : Mapnosousa
    Created on : 2017/10/31, 10:24:48
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.HashMap"%>
<%
HashMap<String, String>data = new HashMap<String, String>();
        
data.put("1","AAA");
data.put("Hello","World");
data.put("soeda","33");
data.put("20","20");

out.print(data);

%>