<%-- 
    Document   : cadastro
    Created on : 07/12/2017, 15:55:49
    Author     : Maria Emanuelli
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title> Cadastros</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/> 
        <link rel="stylesheet" type="text/css" href="estilo.css"/>
    </head>
    <body>
        <%@include file='cabecalho.jsp' %>
        <div id="cadastros">
            <fieldset>
                <legend> Cadastro</legend>
                <ul>
                    <li><a href="cadastroEditora.jsp"> Editora </a></li>
                    </br>
                    <li><a href="cadastroCliente.jsp">Cliente </a></li>
                    </br>
                    <li><a href="genero3.jsp">Gêneros</a></li>
                                        </br>

                    <li><a href="cadastroLivro.jsp">Livros</a></li>
                                        </br>

                    <li><a href="cadastroAutor.jsp">Autores</a></li>
                    </br>
                    <li><a href="">Livro</a></li>
                </ul>
                <%@include file='rodape.jsp' %>
        </div>    
    </body>
</html>