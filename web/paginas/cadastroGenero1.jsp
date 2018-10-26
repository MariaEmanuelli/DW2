<%-- 
    Document   : cadastroGenero
    Created on : 07/12/2017, 15:57:20
    Author     : Maria Emanuelli
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title> Cadastro Genero</title>
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
        <%@include file='cabecalho.jsp' %>
        <div id="cinco">
            <form action="CadastroGeneroServlet.jsp" method="post" id="formforn">	
                <fieldset>
                    <legend> Cadastro de Genero</legend>
                    <p>ID: <input type= "number" name="idGenero" id="idGenero"  pattern="[0-9]+$"  min="1" tittle="Preencha esse campo com um número inteiro" required x-moz-errormessage="Ops. Não esqueça de preencher este campo."/>
                        </br> </br> Nome: <input type="text" name="nome" id="nome" required x-moz-errormessage="Ops. Não esqueça de preencher este campo."/>
                    </p>
                    <input type="submit" href="cadastroGenero.jsp">
                    <script>
                    //<input type="reset" value="Limpar"> 
                    </script> 
                </fieldset>


            </form>
            <%@include file='rodape.jsp' %>
        </div>	
    </body>
</html>	