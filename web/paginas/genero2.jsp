

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Genero</title>
    </head>
    <body>
        <form method="post" action="${pageContext.request.contextPath}/genero">
            <div>    
            <label for="Id do Genero">Id do Genero:</label>
            <input type="text" name="IdGenero"/>
            </div>
            <div>
                <label for="nome do Genero">nome do Genero:</label>
            <input type="text" name="nomeGenero"/>
            <input type="submit" name="ok"/>
            </div>
        </form>
    </body>
</html>