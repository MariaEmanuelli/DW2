<%@page import="DAOs.DAOEditora"%>
<%@page import="Entidades.Editora"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@page import="java.util.*, 
        DAOs.DAOEditora ,
        Entidades.Editora" %>
<%
    DAOEditora dao = new DAOEditora();
    List<Editora> cat = dao.listInOrderNome();
    
%>
<!DOCTYPE html>
<html> 
    <head>
        <title> Cadastro Editora</title>
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
        <h3> Cadastrar Editora </h3>

        <div id="cadastros">
            <fieldset>
                <legend> Cadastro Editora </legend>


                <form method="post" action="${pageContext.request.contextPath}/CadastroEditoraServlet">
                    ID:
                    <input type="text" name="idEditora"> <br>
                    Nome:
                    <input type="text" name="nomeEditora"> <br>
                    CNPJ:
                    <input type="text" name="cnpjEditora"> <br>
                        <input type="submit" value="Cadastrar">
                        <input type="reset" value="limpar">
                </form>
        </div>    
    </body>
</html>
