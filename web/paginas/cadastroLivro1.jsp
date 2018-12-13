
<%@page import="Entidades.Editora"%>
<%@page import="DAOs.DAOEditora"%>
<%@page import="Entidades.Autor"%>
<%@page import="DAOs.DAOAutor"%>
<%@page import="Entidades.Status"%>
<%@page import="DAOs.DAOStatus"%>
<%@page import="DAOs.DAOGenero"%>
<%@page import="Entidades.Genero"%>
<%@page import="DAOs.DAOLivro"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <!-- Bootstrap Core CSS -->
        <link href="../vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <!-- MetisMenu CSS -->
        <link href="../vendor/metisMenu/metisMenu.min.css" rel="stylesheet">

        <!-- Custom CSS -->
        <link href="../dist/css/sb-admin-2.css" rel="stylesheet">

        <!-- Custom Fonts -->
        <link href="../vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->        
    </head>
    <body>
        <div id="wrapper">


            <div id="page-wrapper">
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">Cadastro de Livro</h1>
                    </div>
                    <!-- /.col-lg-12 -->
                </div>
                <!-- /.row -->
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
                            <button type="submit" class="btn btn-default" value="1" name="ok">Gravar</button>
                        </div>
                        <!-- /.col-lg-6 (nested) -->
                    </div>
                </form>

                <!-- /.row (nested) -->
            </div>
            <!-- /.panel-body -->
        </div>
        <!-- /.panel -->
    </div>
    <!-- /.col-lg-12 -->
</div>
<!-- /.row -->
</div>
<!-- /#page-wrapper -->

</div>
<!-- /#wrapper -->                

<!-- jQuery -->
<script src="../vendor/jquery/jquery.min.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="../vendor/bootstrap/js/bootstrap.min.js"></script>

<!-- Metis Menu Plugin JavaScript -->
<script src="../vendor/metisMenu/metisMenu.min.js"></script>

<!-- Custom Theme JavaScript -->
<script src="../dist/js/sb-admin-2.js"></script>

</body>    
</html>
