/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 *
 * @author guest1Day
 */
public class db1 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           Connection db_con = null;
           PreparedStatement db_st= null;
           ResultSet db_data=null;
           
          
      try{
//          DBへの接続
               Class.forName("com.mysql.jdbc.Driver").newInstance();     
               db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge_db","root","");
               out.print("接続しました"+"<br>");
               
//          userの中のnameの？に似たものを出したい、というSQL文を実行（prepareStatement)
//         　PreparedStatement#executeQueryメソッドはデータベースに対するSQL文を実行するために使われます
               db_st = db_con.prepareStatement("select * from user where name like ?");
//          1番目の？の佐藤●●をsetString    ※↑の？はいくつも設定できる。その中の1番目の？を指すとき(1,・・・と書く
//          ?の置き換えのset●●メソッド
               db_st.setString(1, "佐藤%");
//          executeQueryは戻り値があるselectに使う
//          executeUpdateは戻り値がないupdateとかに使う
//          戻り値というのは結果が表示されるかどうかで判断する
//          例えばupdateは実行してもOKかどうか出るだけで結果は表示されない一方、selectは結果が表示される
//          もし戻り値がなければResultSetがいらないので、↓のwhile～もいらない  
               db_data=db_st.executeQuery();
//          ResultSetのデータの有無をチェックnextメソッド     
               while(db_data.next()){
                   out.print("名前："+db_data.getString("name")+"<br>");
               }
               db_data.close();
               db_st.close();
               db_con.close();
              
//        　例外処理      
//          SQLの問題が出るとSQLExceptionに入る
           }catch(SQLException e_sql){
               System.out.println("接続時エラーが発生しました："+e_sql.toString());
//         Exceptionは（SQLExceptionを含む）全ての例外が出たとき投げられる
           }catch(Exception e){
               System.out.println("エラーが発生しました"+e.toString());
//         finallyは絶対行ってほしい処理
//         closeする前にエラーが発生してしまった場合DBを閉じれるようにしておく
//         db_conがnullでないなら（中身がある＝閉じてないなら）閉じる。nullならエラーメッセージ
           }finally{
              if(db_con!=null){
                  try{
                      db_con.close();  
                  }catch(Exception e_con){
                      System.out.println(e_con.getMessage());
                  }
              }  
           }
        }
    }
    
// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
        