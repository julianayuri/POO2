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
 * @author 20151bsi0266
 */
public class RecebeDados1 extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        try  {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RecebeDados1</title>");            
            out.println("</head>");
            out.println("</body>");

            
            out.println("<h1>Servidor Recebeu:<br></h1>"); 
            out.println("<h1>Modelo do carro: " + request.getParameter("modeloCarro") + "</h1>");
            out.println("<h1>Placa: " + request.getParameter("placa") + "</h1>");
            out.println("<h1>Renavam: " + request.getParameter("renavam") + "</h1>");
            out.println("<h1>Ano: " + request.getParameter("ano") + "</h1>");
            out.println("<h1>Kilometragem: " + request.getParameter("kilometragem") + "</h1>");
            out.println("<h1>Acessórios: " + request.getParameter("acessorios") + "</h1>");
            out.println("<h1>Valor: " + request.getParameter("valor") + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

 
    @Override
    public String getServletInfo() {
        return "Servlet Recebe Dados";
    }// </editor-fold>

}
