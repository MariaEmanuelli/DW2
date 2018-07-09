<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastrar Genero</title>
    </head>
    <body>
        <h3> Cadastrar Genero </h3>
        <form method="post" action="${pageContext.request.contextPath}/CadastroGeneroServlet">
            ID do Genero              
            <input type="text" name="idGenero"/> <br>
            Nome do Genero
            <input type="text" name="nomeGenero"/> <br>
            <input type="submit" name="ok"/>
        </form>
    </body>
</html>
