<%-- 
    Document   : cadVen4_PD
    Created on : 24/05/2018, 16:15:07
    Author     : Dennis
--%>

<%@page import="Model.Categoria"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="shortcut icon" href="src/img/icones/logo-ico.ico" type="image/x-icon" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="src/css/form.css" rel="stylesheet" type="text/css"/>
        <link href="src/css/tabela.css" rel="stylesheet" type="text/css"/>
        <script src="src/scripts/jquery.js" type="text/javascript"></script>
        <script src="src/scripts/placeholder.js" type="text/javascript"></script>

        <title>Finalizar Pedido</title>
    </head>
    <body>
        <%@ include file="menu.jsp" %> 
    <session id="formulario">
        <a href=""><div id="voltar">voltar</div></a>
        <div id="container-h1"> <h1>Total: R$320,00</h1> </div>

        <form>
            <p>Sinal R$ </p>
            <input type="text" name="dinheiro"> 
            <input type="submit" value="Finalizar Pedido">  
        </form>    


    </session>   
    <%@ include file="footer.jsp" %>
</body>
</html>