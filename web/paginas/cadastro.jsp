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
        <link rel="stylesheet" type="text/css" href="CSS.css"/>
    </head>
    <body bgcolor="#D8B889">
        <%@include file='cabecalho.jsp' %>
        <div id="cadastros">
            <fieldset>
                <legend> Cadastro </legend>
                <dl>
                    
                    <dd><a href="cadastroEditora.jsp"> Editora </a></dd>
                    </br>
                    <dd><a href="cadastroCliente.jsp">Cliente </a></dd>
                    </br>
                    <dd><a href="cadastroGenero.jsp">Gêneros</a></dd>
                                        </br>

                    <dd><a href="cadastroLivro.jsp">Livros</a></dd>
                                        </br>

                    <dd><a href="cadastroAutor.jsp">Autores</a></dd>
                    </br>
                    <dd><a href="">Livro</a></dd>
                </dl>
                <%@include file='rodape.jsp' %>
        </div>    
    </body>
</html>