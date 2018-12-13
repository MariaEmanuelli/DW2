/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controles;

import DAOs.DAOEditora;
import Entidades.Editora;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jaque
 */
@WebServlet(name = "EditoraServlet", urlPatterns = {"/editora"})
public class EditoraServlet extends HttpServlet {

    Locale ptBr = new Locale("pt", "BR");
    NumberFormat formatoDinheiro = NumberFormat.getCurrencyInstance(ptBr);

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
            String nomeEditora = request.getParameter("nomeEditora");

            String resultado = "";
            if (nomeEditora != null) {
                resultado = listaEditoraNome(nomeEditora);
            } else {
                resultado = listaEditorasCadastrados();
            }
            request.getSession().setAttribute("resultado", resultado);
            response.sendRedirect(request.getContextPath() + "/paginas/editora.jsp");
        }
    }

    protected String listaEditoraNome(String nomeEditora) {
        DAOEditora editora = new DAOEditora();
        String tabela = "";
        List<Editora> lista = editora.listByNome(nomeEditora);
        for (Editora l : lista) {
            tabela += "<tr>"
                    + "<td>" + l.getNomeEditora()+ "</td>"
                    + "<td>" + l.getCnpjEditora()+ "</td>"
                    + "</tr>";
        }

        return tabela;
    }

    protected String listaEditorasCadastrados() {
        DAOEditora editora = new DAOEditora();
        String tabela = "";
        List<Editora> lista = editora.listInOrderNome();
        for (Editora l : lista) {
            tabela += "<tr>"
                    + "<td>" + l.getNomeEditora()+ "</td>"
                    + "<td>" + l.getCnpjEditora()+ "</td>"
                    + "</tr>";
        }

        return tabela;
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
        System.out.println("teste doget");
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
        System.out.println("teste dopost");
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
