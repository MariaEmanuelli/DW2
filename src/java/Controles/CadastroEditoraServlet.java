/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controles;

import DAOs.DAOEditora;
import Entidades.Editora;
import static Entidades.Editora_.enderecoList;
import Entidades.Endereco;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Maria Emanuelli
 */
@WebServlet(name = "CadastroEditoraServlet", urlPatterns = {"/CadastroEditoraServlet"})
public class CadastroEditoraServlet extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CadastroEditoraServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> Cadastro feito " + request.getContextPath() + "</h1>");
            out.println("<a href=\"/BibliotecaMaria/paginas/index.jsp\"> Inicio</a>");
            out.println("</body>");
            out.println("</html>");
            Integer idEditora = Integer.parseInt(request.getParameter("idEditora"));
            String nomeEditora = request.getParameter("nomeEditora");
            String cnpj = request.getParameter("cnpj");
            String endereco = request.getParameter("endereco");
            
            DAOEditora controle = new DAOEditora();
            Editora editora = new Editora();
            
            editora.setIdEditora(idEditora);
            editora.setNomeEditora(nomeEditora);
            editora.setCnpj(cnpj);
            editora.setEnderecoList((List<Endereco>) enderecoList);
            controle.inserir(editora);

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
    

    }
}

