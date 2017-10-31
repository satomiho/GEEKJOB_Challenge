<%-- 
    Document   : loopshori3
    Created on : 2017/10/31, 15:21:25
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
int answer=0;    
for(int i=0;i<100;i++){
    answer=answer+(i+1);          
    out.print(answer+"<br>");
}

//forは回数が決まっているループに使う。
//whileは実行してみるまで回数が分からないループに使う。
//
//プログラムの設計を考えた時、「この値が0未満になるまで繰り返し～」と考えているならwhile。
//「10回繰り返し」とか「この配列の全部」とかならforを使う。
//プログラミングというのは、同じ事に対し色々な書き方ができる事が多い。
//実行効率が重視される事も稀にあるけれど、基本的には、自分の意図に最も近い記述を選ぶのが良い。


%>
