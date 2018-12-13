package Controles;

import DAOs.DAOAutor;
import DAOs.DAOEditora;
import DAOs.DAOGenero;
import DAOs.DAOLivro;
import DAOs.DAOStatus;
import Entidades.Autor;
import Entidades.Editora;
import Entidades.Genero;
import Entidades.Livro;
import static Entidades.Livro_.anoPublicacaoLivro;
import static Entidades.Livro_.autorIdAutor;
import Entidades.Status;
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
@WebServlet(name = "CadastroLivroServlet", urlPatterns = {"/CadastroLivroServlet"})
public class CadastroLivroServlet extends HttpServlet {

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy");

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
            out.println("<title>Servlet CadastroLivroServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> Cadastro feito " + request.getContextPath() + "</h1>");
            out.println("<a href=\"/BibliotecaMaria/index.html\"> Inicio</a>");
            out.println("</body>");
            out.println("</html>");
            int idLivro = Integer.parseInt(request.getParameter("idLivro"));
            String nomeLivro = request.getParameter("nomeLivro");
            String edicao = request.getParameter("edicao");
            int quantidadeEstoqueLivro = Integer.parseInt(request.getParameter("quantidade"));
            Date anoPublicacao = null;
            try {
                anoPublicacao = sdf.parse(request.getParameter("anoPublicacao"));
            } catch (ParseException ex) {
                Logger.getLogger(CadastroLivroServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            int idAutor = Integer.parseInt(request.getParameter("idAutor"));
            int idEditora = Integer.parseInt(request.getParameter("idEditora"));
            int idGenero = Integer.parseInt(request.getParameter("idGenero"));
            int idStatus = Integer.parseInt(request.getParameter("idStatus"));

            DAOLivro controle = new DAOLivro();
            Livro livro = new Livro();

            DAOAutor daoAutor = new DAOAutor();
            Autor autor = daoAutor.listById(idAutor).get(0);
            
            DAOGenero daoGenero = new DAOGenero();
            Genero genero = daoGenero.listById(idGenero).get(0);
            
            DAOEditora daoEditora = new DAOEditora();
            Editora editora = daoEditora.listById(idEditora).get(0);
            
            DAOStatus daoStatus = new DAOStatus();
            Status status = daoStatus.listById(idStatus).get(0);


            livro.setIdLivro(idLivro);
            livro.setNomeLivro(nomeLivro);
            livro.setEdicaoLivro(nomeLivro);
            livro.setAnoPublicacaoLivro(anoPublicacao);
            livro.setQuantidadeEstoqueLivro(quantidadeEstoqueLivro);
            livro.setAutorIdAutor(autor);
            livro.setEditoraIdEditora(editora);
            livro.setGeneroIdGenero(genero);
            livro.setStatusIdStatus(status);
            controle.inserir(livro);
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
