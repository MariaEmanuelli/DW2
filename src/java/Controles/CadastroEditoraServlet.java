


package Controles;

import DAOs.DAOEditora;
import Entidades.Editora;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alexa
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
            out.println("<body bgcolor='#D8B889'>");
            out.println("<h1> Cadastro feito " + request.getContextPath() + "</h1>");
            out.println("<a href=\"/BibliotecaMaria/index.html\"> Inicio</a>");
            out.println("</body>");
            out.println("</html>");
            int idEditora = Integer.parseInt(request.getParameter("idEditora"));
            String nomeEditora = request.getParameter("nomeEditora");
            String cnpjEditora = request.getParameter("cnpjEditora");
            
            DAOEditora controle = new DAOEditora();
            Editora editora = new Editora();
            
            editora.setIdEditora(idEditora);
            editora.setNomeEditora(nomeEditora);
            editora.setCnpjEditora(cnpjEditora);
            controle.inserir(editora);
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
