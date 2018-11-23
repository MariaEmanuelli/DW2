<%-- 
    Document   : cadastroEditora
    Created on : 04/10/2018, 23:01:11
    Author     : Maria Emanuelli
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html> 
    <head>
        <title> Cadastro Editora</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/> 
        <link rel="stylesheet" type="text/css" href="CSS.css"/>
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
    <body>
        <h3> Cadastrar Editora </h3>
        <form method="post" action="${pageContext.request.contextPath}/EditoraServlet">
            ID da Editora             
            <input type="text" name="idEditora"/> <br>
            Nome da Editora
            <input type="text" name="nomeEditora"/> <br>
            CNPJ 
            <input type ="text" name="cnpj"/> <br>
            Endereco 
            <input type ="text" name="endereco"/> <br>
            <input type="submit" name="ok"/>
            
        </form>
    </body>
</html>

