<%-- 
    Document   : cadCli
    Created on : 23/05/2018, 17:23:56
    Author     : Dennis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <link rel="shortcut icon" href="src/img/icones/logo-ico.ico" type="image/x-icon" />
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
            
            
                <div id="container-h1"> <h1> Cadastro de Clientes </h1> </div>
                <form action="/ArteNativaBeta-master/GerenciaCliente" method="post"> 
                    
                        <input type="text" required="required" title="Nome" name="nome" class="J_place">
                        <input type="text" required="required" title="Telefone Residêncial" name="tel" class="J_place">
                        <input type="text" required="required" title="Telefone Celular" name="cel" class="J_place">
                        <input type="text" title="Email" required="required" name="email" class="J_place">
                        <p>data de nascimento: </p>
                        <input id="date" type="date" required="required" title="Data de Nascimento" name="dataNasc" class="J_place">
                        <input type="text" title="Rg" required="required" name="rg" class="J_place" >
                        <input type="text" title="CPF" required="required" name="cpf" class="J_place">
                        <input type="text" id="cep" required="required" title="CEP" name="cep" class="J_place">
                        <input type="text" id="rua" required="required" title="Rua" name="rua" class="J_place">
                        <input type="text" id="bairro" required="required" title="Bairro" name="bairro" class="J_place">
                        <input type="text" id="cidade" required="required" title="Cidade" name="cidade" class="J_place">
                        <input type="text" id="uf" required="required" title="Estado" name="estado" class="J_place">
                        <p>Número da residência: </p>
                        <input type="number" name="numero" required="required" title="Insira o Numero da residência(ex:9)" class="J_place">
                        <input type="text" name="complemento" required="required" title="Complemento" class="J_place">
                       <input class="btn" type="submit" value="Cadastrar">
                       
                </form>    
                      
        </session>   
    
     <%@ include file="footer.jsp" %>
    </body>
</html>
