<%-- 
    Document   : cadVend
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

        <link href="src/css/tabela.css" rel="stylesheet" type="text/css"/>
        <link href="src/css/form.css" rel="stylesheet" type="text/css"/>
        <script src="src/scripts/jquery.js" type="text/javascript"></script>
        <script src="src/scripts/placeholder.js" type="text/javascript"></script>


        <title>Clientes</title>
    </head>
    <body>


        <%@ include file="menu.jsp" %> 


    <session id="formulario">
            <div id="voltar" >   <a href="Navigation?ac=Gerencia_Cliente"> Voltar </a></div>
        
        <div id="container-h1"> <h1>Cliente</h1>
        </div>

        <form> 
          
            <p>Nome: </p>
            <input type="text" title="Nome" readonly value="João da Silva">
            <p>Telefone Residêncial: </p>
            <input type="text" title="Telefone Residêncial"  readonly value="João da Silva" >
            <p>Telefone Celular: </p>
            <input type="text" title="Telefone Celular"  readonly value="João da Silva" >
            <p>Email: </p>
            <input type="text" title="Email"  readonly value="João da Silva">
            <p>Data de nascimento: </p>
            <input id="date" type="text" title="Data de Nascimento"  readonly value="João da Silva">
            <p>Rg: </p>
            <input type="text" title="Rg"  readonly value="João da Silva" >
            <p>CPF: </p>
            <input type="text" title="CPF"  readonly value="João da Silva" >
            <p>CEP: </p>
            <input type="text" id="cep" title="CEP"  readonly value="João da Silva">
            <p>Rua: </p>
            <input type="text" id="rua" title="Rua"  readonly value="João da Silva">
            <p>Bairro: </p>
            <input type="text" id="bairro" title="Bairro"  readonly value="João da Silva">
            <p>Cidade: </p>
            <input type="text" id="cidade" title="Cidade"  readonly value="João da Silva">
            <p>Estado: </p>
            <input type="text" id="uf" title="Estado"  readonly value="João da Silva" >
            <p>Número da residência: </p>
            <input type="number"   title=" Numero da residência"  readonly value="João da Silva">
            <p>Complemento: </p>
            <input type="text" title="Complemento"  readonly value="João da Silva"><br>
            <hr>
            <input class="btn" type="submit" value="Alterar">

        </form>    

    </session>   







    <%@ include file="footer.jsp" %>
</body>
</html>