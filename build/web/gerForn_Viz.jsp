<%-- 
    Document   : cadCli
    Created on : 23/05/2018, 17:23:56
    Author     : Dennis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="src/css/form.css" rel="stylesheet" type="text/css"/>
        <script src="src/scripts/jquery.js" type="text/javascript"></script>
        <script src="src/scripts/placeholder.js" type="text/javascript"></script>
        <script src="src/scripts/preenche_endereco.js" type="text/javascript"></script>
        <title>Cadastro de Cliente</title>
    </head>
    <body>
        <%@ include file="menu.jsp" %>
        <session id="formulario">
                <div id="voltar" >   <a href="Navigation?ac=Gerencia_Fornecedor"> Voltar </a></div>
                <div id="container-h1"> <h1> Sobre Fornecedor </h1> </div>
                <form> 
                        <p>Nome:</p>
                        <input type="text" title="Nome" readonly value="" >
                        <p>Categoria:</p>
                        <input type="text" title="Categoria" readonly value="" >
                        <p>Telefone Fixo:</p>
                        <input type="text" title="Telefone Fixo" readonly value="">
                        <p>Telefone Celular:</p>
                        <input type="text" title="Telefone Celular" readonly value="">
                        <p>CNPJ:</p>
                        <input type="text" title="CNPJ" readonly value="" >
                        <p>CPF:</p>
                        <input type="text" title="CPF" readonly value="">
                        <p>CEP:</p>
                        <input type="text" id="cep" title="CEP" readonly value="">
                        <p>Rua:</p>
                        <input type="text" id="rua" title="Rua" readonly value="" >
                        <p>Bairro:</p>
                        <input type="text" id="bairro" title="Bairro"  readonly value="">
                        <p>Cidade:</p>
                        <input type="text" id="cidade" title="Cidade" readonly value="" >
                        <p>Estado:</p>
                        <input type="text" id="uf" title="Estado" readonly value="">
                        <p>Número do endereco: </p>
                        <input type="number"   title="Numero do endereço" readonly value="">
                        <p>Complemento:</p>
                        <input type="text" title="Complemento" readonly value="">
                        <br> <hr>
                       <input class="btn" type="submit" value="Alterar">
                </form>              
        </session>   
     <%@ include file="footer.jsp" %>
     </body>
</html>
