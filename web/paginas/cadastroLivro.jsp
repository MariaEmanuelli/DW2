<%@page import="DAOs.DAOGenero"%>
<%@page import="Entidades.Genero"%>
<%@page import="Entidades.Status"%>
<%@page import="DAOs.DAOStatus"%>
<%@page import="Entidades.Autor"%>
<%@page import="DAOs.DAOAutor"%>
<%@page import="Entidades.Editora"%>
<%@page import="DAOs.DAOEditora"%>
<%@page import="Entidades.Livro"%>
<%@page import="DAOs.DAOLivro"%>
<%@page import="Entidades.Livro"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@page import="java.util.*, 
        DAOs.DAOLivro ,
        Entidades.Livro" %>
<%
    DAOLivro daol = new DAOLivro();
    List<Livro> catl = daol.listInOrderNome();
%>
<%
    DAOGenero daog = new DAOGenero();
    List<Genero> catg = daog.listInOrderNome();
%>
<%
    DAOEditora daoe = new DAOEditora();
    List<Editora> cate = daoe.listInOrderNome();
%>
<%
    DAOAutor daoa = new DAOAutor();
    List<Autor> cata = daoa.listInOrderNome();
%>
<%
    DAOStatus daos = new DAOStatus();
    List<Status> cats = daos.listInOrderNome();
%>
<!DOCTYPE html>
<html> 
    <head>
        <title> Cadastro Livro</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/> 
        <script type="text/javascript" src="js/jquery.validate.min"></script>

        <script type="text/javascript" src="js/jquery.mask.min"></script>
        <script type="text/javascript" src="js/jquery-3.2.1.min"></script>


        <script type="text/javascript">

            /**
             
             * Basic jQuery Validation Form Demo Code
             
             * Copyright Sam Deering 2012
             
             * Licence: http://www.jquery4u.com/license/
             
             */

            (function ($, W, D)

            {

                var JQUERY4U = {};



                JQUERY4U.UTIL =
                        {

                            setupFormValidation: function ()

                            {

                                //form validation rules

                                $("#formforn").validate({

                                    rules: {

                                        id: "required",

                                        nome: "required"


                                    },

                                    messages: {

                                        id: "Id não pode estar e branco",

                                        nome: "Nome não pode estar em branco"


                                    },

                                    submitHandler: function (form) {

                                        form.submit();

                                        // alert("Dados Enviados com Sucesso :)");



                                    }

                                });

                            }

                        }



                //when the dom has loaded setup form validation rules

                $(D).ready(function ($) {

                    JQUERY4U.UTIL.setupFormValidation();

                });



            })(jQuery, window, document);

        </script>
    </head>
    <body bgcolor="#D8B889">
        <h3> Cadastrar Livro </h3>

        <div id="cadastros">
            <fieldset>
                <legend> Cadastro Livro </legend>


                <form method="post" action="${pageContext.request.contextPath}/CadastroLivroServlet" role="form">
                    <div class="row">
                        <div class="col-lg-6">        
                            <div class="form-group">
                                <label>Id</label>
                                <input class="form-control" type="text" name="id" />
                            </div>
                            <div class="form-group">
                                <label>Nome</label>
                                <input class="form-control" type="text" name="nome" />
                            </div>
                            <div class="form-group">
                                <label>Edição</label>
                                <input class="form-control" type="text" name="edicao" />
                            </div>
                            <div class="form-group">
                                <label>Ano de Publicacao</label>
                                <input class="form-control" type="text" name="anoPublicacao" />
                            </div>
                            <div class="form-group">
                                <label>Quantidade</label>
                                <input class="form-control" type="text" name="quantidade" />
                            </div>
                        </div>
                        <div class="col-lg-6">        
                            <div class="form-group">
                                <label>Genero</label>
                                <select class="form-control" name="livros">
                                    <option value="">--SELECIONE--</option>
                                    <% for (Genero c : catg) {%>
                                    <option value="<%=c.getIdGenero()%>">
                                        <%=c.getNomeGenero()%> </option>
                                        <% }%>
                                </select>
                            </div>
                            <div class="form-group">
                                <label>Editora</label>
                                <select class="form-control" name="livros">
                                    <option value="">--SELECIONE--</option>
                                    <% for (Editora c : cate) {%>
                                    <option value="<%=c.getIdEditora()%>">
                                        <%=c.getNomeEditora()%> </option>
                                        <% }%>
                                </select>
                            </div>
                            <div class="form-group">
                                <label>Autor</label>
                                <select class="form-control" name="livros">
                                    <option value="">--SELECIONE--</option>
                                    <% for (Autor c : cata) {%>
                                    <option value="<%=c.getIdAutor()%>">
                                        <%=c.getNomeAutor()%> </option>
                                        <% }%>
                                </select>
                            </div>
                            <div class="form-group">
                                <label>Status</label>
                                <select class="form-control" name="livros">
                                    <option value="">--SELECIONE--</option>
                                    <% for (Status c : cats) {%>
                                    <option value="<%=c.getIdStatus()%>">
                                        <%=c.getNomeStatus()%> </option>
                                        <% }%>
                                </select>
                            </div>
                        </div>                        
                    </div>


                    <div class="row">
                        <div class="col-lg-12">        
                            <input type="submit" value="Cadastrar">
                            <input type="reset" value="limpar">
                        </div>
                        <!-- /.col-lg-6 (nested) -->
                    </div>
                </form>
        </div>    
    </body>
</html>
