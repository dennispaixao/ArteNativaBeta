<%-- 
    Document   : gerCli_Alt
    Created on : 23/05/2018, 17:23:56
    Author     : Dennis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <link rel="shortcut icon" href="src/img/icones/logo-ico.ico" type="image/x-icon" />
         <link rel="shortcut icon" href="src/img/icones/logo-ico.ico" type="image/x-icon" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="src/css/form.css" rel="stylesheet" type="text/css"/>
        <script src="src/scripts/jquery.js" type="text/javascript"></script>
        <script src="src/scripts/placeholder.js" type="text/javascript"></script>
        <script src="src/scripts/preenche_endereco.js" type="text/javascript"></script>
        <title>Alterar dados de Cliente</title>
    </head>
    <body>
         <%@ include file="menu.jsp" %>
        
        <session id="formulario">
            <div id="voltar" >   <a href="Navigation?ac=Gerencia_Cliente"> Voltar </a></div>
                <div id="container-h1"> <h1> Alterar Cliente </h1> </div>
                <form> 
                        <input type="text" title="Nome" class="J_place">
                        <input type="text" title="Telefone Residêncial" class="J_place">
                         <input type="text" title="Telefone Celular" class="J_place">
                          <input type="text" title="Email" class="J_place">
                        <p>data de nascimento: </p>
                        <input id="date" type="date" title="Data de Nascimento" class="J_place">
                        <input type="text" title="Rg" class="J_place" >
                        <input type="text" title="CPF" class="J_place">
                        <input type="text" id="cep" title="CEP" class="J_place">
                        <input type="text" id="rua" title="Rua" class="J_place">
                        <input type="text" id="bairro" title="Bairro" class="J_place">
                        <input type="text" id="cidade" title="Cidade" class="J_place">
                        <input type="text" id="uf" title="Estado" class="J_place">
                        <p>Número da residência: </p>
                        <input type="number"   title="Insira o Numero da residência(ex:9)" class="J_place">
                        <input type="text" title="Complemento" class="J_place">
                        <input class="btn" type="submit" name="alterar_btn" value="Cancelar" style="display:inline-block">
                        <input class="btn" type="submit" name="alterar_btn" value="Alterar" style="display:inline-block">
                       
                </form>    
                      
        </session>   
    
     <%@ include file="footer.jsp" %>
    </body>
</html>
