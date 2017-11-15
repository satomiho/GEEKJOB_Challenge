/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author guest1Day
 */
public class BlackJack extends HttpServlet {

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
            Dealer1 dealer = new Dealer1();
            User1 user = new User1();
    
            dealer.setCard(dealer.deal());
            user.setCard(dealer.deal());
            
            out.print("dealerの手札："+dealer.myCard+"<br>");
            out.print("userの手札"+user.myCard+"<br>");
            
            dealer.open();
            user.open();
            
            out.print("dealerの合計"+dealer.open()+"<br>");
            out.print("userの合計"+user.open()+"<br>");
            
            if(dealer.checkSum()){
                dealer.setCard(dealer.hit());
                out.print("dealer:HITしました"+"<br>");
                
            }else{
                out.print("dealer;HITしませんでした"+"<br>");
            }
            if(user.checkSum()){
                user.setCard(dealer.hit());
                out.print("user:HITしました"+"<br>");
            }else{
                out.print("user:HITしませんでした"+"<br>");
            }
            
            if(dealer.open() > 21|| user.open() >21){
                if(dealer.open() >21 && user.open() > 21){
                    out.print("dealerの合計"+dealer.open()+"<br>");
                    out.print("userの合計"+user.open()+"<br>");
                    out.print("両者バースト");
                               
     
                }else if(user.open() > 21){
                    out.print("dealerの合計"+dealer.open()+"<br>");
                    out.print("userの合計"+user.open()+"<br>");
                    out.print("userのバースト");  
                               
     
                }else{
                    out.print("dealerの合計"+dealer.open()+"<br>");
                    out.print("userの合計"+user.open()+"<br>");
                    out.print("dealerのバースト");
                               
     
                }
            }else if(dealer.open() == 21 ||user.open() == 21){
                    out.print("dealerの合計"+dealer.open()+"<br>");
                    out.print("userの合計"+user.open()+"<br>");
                    out.print("ブラックジャック"+"<br>");
                          
     
                if(dealer.open() == 21 && user.open() == 21){
                    out.print("dealerの合計"+dealer.open()+"<br>");
                    out.print("userの合計"+user.open()+"<br>");
                    out.print("引き分け");          
     
                }else if(user.open() ==21){
                    out.print("dealerの合計"+dealer.open()+"<br>");
                    out.print("userの合計"+user.open()+"<br>");  
                    out.print("userの勝ち");
                               
     
                }else{
                    out.print("dealerの合計"+dealer.open()+"<br>");
                    out.print("userの合計"+user.open()+"<br>");
                    out.print("dealerの勝ち");
                               
     
                }
            }else if(dealer.open() == user.open()){
                    out.print("dealerの合計"+dealer.open()+"<br>");
                    out.print("userの合計"+user.open()+"<br>");
                    out.print("引き分け");
                           
     
                }else if(user.open() > dealer.open()){
                    out.print("dealerの合計"+dealer.open()+"<br>");
                    out.print("userの合計"+user.open()+"<br>");    
                    out.print("userの勝利");
                                   
     
                }else{
                    out.print("dealerの合計"+dealer.open()+"<br>");
                    out.print("userの合計"+user.open()+"<br>");
                    out.print("dealerの勝利");
                              
     
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


