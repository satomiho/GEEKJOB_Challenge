<%-- 
    Document   : DataSousa8
    Created on : 2017/11/27, 16:14:03
    Author     : guest1Day
--%>
<%
    request.setCharacterEncoding("UTF-8");
    HttpSession hs = request.getSession();
    hs.setAttribute("Name",request.getParameter("name"));
    hs.setAttribute("Gender",request.getParameter("gender"));
    hs.setAttribute("MulText", request.getParameter("mulText"));
    
    String n = (String)hs.getAttribute("Name");
    String g = (String)hs.getAttribute("Gender");
    String m = (String)hs.getAttribute("MulText");
    
    String gen="";
    String gend="";
    if(g!=null){
        if(g.equals("男")){
            gen="checked";
        }else{
            gend="checked";
        }
    }
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="./DataSousa8.jsp" method="post">
            氏名<input type="text" name="name" value=<%if(n!=null){out.print(n);}%>><br>
            性別<input type="radio" name="gender" value="男" <%=gen%>>男
            <input type="radio" name="gender" value="女" <%=gend%>>女<br>
            
            趣味<textarea name="mulText"><%if(m!=null){out.print(m);}%></textarea><br>
            <input type="submit"name="btnSubmit"value="送信">      
        </form>
    </body>
</html>


