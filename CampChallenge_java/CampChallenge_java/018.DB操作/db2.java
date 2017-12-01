/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.text.SimpleDateFormat;

/**
 *
 * @author guest1Day
 */
public class db2 extends HttpServlet {

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
            throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            Connection db_con = null;
            PreparedStatement db_st= null;
            
            try{    
//                DBにアクセス
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge_db","root","");
                out.print("接続");
                db_st = db_con.prepareStatement("insert into profiles value(?,?,?,?,?);");

                db_st.setInt(1,5);
                db_st.setString(2,"佐藤信照");
                db_st.setString(3,"0120-888-999");
                db_st.setInt(4,13);
                db_st.setString(5,"2007-05-17");
//                SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
//                db_st.setDate(5,new java.sql.Date(dateFormat.parse("20040517")));            

               int result = db_st.executeUpdate();
               out.print("INSERT:"+"result"+"行追加しました");
               
            
               db_st.close();
               db_con.close();
             
//        　例外処理      
//          SQLの問題が出るとSQLExceptionに入る
           }catch(SQLException e_sql){
               System.out.println("接続時エラーが発生しました："+e_sql.toString());
//         Exceptionは（SQLExceptionを含む）全ての例外が出たとき投げられる
           }catch(Exception e){
               System.out.println("エラーが発生しました"+e.toString());
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