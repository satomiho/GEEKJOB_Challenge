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


/**
 *
 * @author guest1Day
 */
public class InsutoModorichi3 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    String[] prof(int num) {
        String[] data = {"1", "佐藤美穂", "10月16日", "高田馬場"};
        String[] data2 = {"2", "鈴木美穂", "11月16日", "目白"};
        String[] data3 = {"3", "高橋美穂", "12月16日", null};
        int NUM = Integer.parseInt(data[0]);
        int NUM2 = Integer.parseInt(data2[0]);
        int NUM3 = Integer.parseInt(data3[0]);
        if (NUM == num) {
            return data;
        } else if (NUM2 == num) {
            return data2;
        } else if (NUM3 == num) {
            return data3;
        }
        return null;

    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            Integer limit = 2;
            for (int i = 1; i <= limit; i++) {
                String[] hairetsu = prof(i);
//           numに何をいれるか？→回数のiにすればOK！

                for (String uketori : hairetsu) {
                    if (uketori == hairetsu[0]) {

                    } else if (uketori == null) {
                        continue;
                    } else {
                        out.print(uketori + "<br>");
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
