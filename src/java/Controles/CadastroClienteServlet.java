


package Controles;

import DAOs.DAOCliente;
import Entidades.Cliente;
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
@WebServlet(name = "CadastroClienteServlet", urlPatterns = {"/CadastroClienteServlet"})
public class CadastroClienteServlet extends HttpServlet {

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
            out.println("<title>Servlet CadastroClienteServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> Cadastro feito " + request.getContextPath() + "</h1>");
            out.println("<a href=\"/BibliotecaMaria/index.html\"> Inicio</a>");
            out.println("</body>");
            out.println("</html>");
            int idCliente = Integer.parseInt(request.getParameter("idCliente"));
            String nomeCliente = request.getParameter("nomeCliente");
            String enderecoCliente = request.getParameter("enderecoCliente");
            String cpfCliente = request.getParameter("cpfCliente");
            String telefoneCliente = request.getParameter("telefoneCliente");
            String celularCliente = request.getParameter("celularCliente");
            String emailCliente = request.getParameter("emailCliente");
            String senhaCliente = request.getParameter("senhaCliente");
            
            DAOCliente controle = new DAOCliente();
            Cliente cliente = new Cliente();
            
            cliente.setIdCliente(idCliente);
            cliente.setNomeCliente(nomeCliente);
            cliente.setEnderecoCliente(enderecoCliente);
            cliente.setCpfCliente(cpfCliente);
            cliente.setTelefoneCliente(telefoneCliente);
            cliente.setCelularCliente(celularCliente);
            cliente.setEmailCliente(emailCliente);
            cliente.setSenhaCliente(senhaCliente);
            controle.inserir(cliente);
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
