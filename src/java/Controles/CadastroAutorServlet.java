


package Controles;

import DAOs.DAOAutor;
import Entidades.Autor;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
@WebServlet(name = "CadastroAutorServlet", urlPatterns = {"/CadastroAutorServlet"})
public class CadastroAutorServlet extends HttpServlet {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
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
            out.println("<title>Servlet CadastroAutorServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> Cadastro feito " + request.getContextPath() + "</h1>");
            out.println("<a href=\"/BibliotecaMaria/index.html\"> Inicio</a>");
            out.println("</body>");
            out.println("</html>");
            int idAutor = Integer.parseInt(request.getParameter("idAutor"));
            String nomeAutor = request.getParameter("nomeAutor");
            Date nascimentoAutor = null;
            try {
                nascimentoAutor = sdf.parse(request.getParameter("nascimentoAutor"));
            } catch (ParseException ex) {
                Logger.getLogger(CadastroAutorServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            DAOAutor controle = new DAOAutor();
            Autor autor = new Autor();
            
            autor.setIdAutor(idAutor);
            autor.setNomeAutor(nomeAutor);
            autor.setDataNascimentoAutor(nascimentoAutor);
            controle.inserir(autor);
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
