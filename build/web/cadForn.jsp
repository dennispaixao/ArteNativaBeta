<%-- 
    Document   : cadForn
    Created on : 23/05/2018, 17:23:56
    Author     : Dennis
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="Model.Categoria"%>
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
        <title>Cadastro de Fornecedor</title>
    </head>
    <body>
        <%@ include file="menu.jsp" %>
       <% ArrayList<Categoria> listaCategoria = (ArrayList<Categoria>) request.getAttribute("listaCategoria"); %>
        <session id="formulario">
            
            
                <div id="container-h1"> <h1> Cadastro de Fornecedor </h1> </div>
                <form> 
                        <input type="text" title="Nome" class="J_place">
                        <p>categoria:</p>
                        <select name="Categoria">
                           <%
                               for (Categoria c: listaCategoria) {
                           %>
                           <option value="<%= c.getId() %>"><%= c.getDescricao() %></option>
                           <%
                               }
                           %> 
                       </select>
                        <input type="text" title="Telefone Fixo" class="J_place">
                         <input type="text" title="Telefone Celular" class="J_place">
                        <input type="text" title="CNPJ" class="J_place" >
                        <input type="text" title="CPF" class="J_place">
                        <input type="text" id="cep" title="CEP" class="J_place">
                        <input type="text" id="rua" title="Rua" class="J_place">
                        <input type="text" id="bairro" title="Bairro" class="J_place">
                        <input type="text" id="cidade" title="Cidade" class="J_place">
                        <input type="text" id="uf" title="Estado" class="J_place">
                        <p>Número do endereço: </p>
                        <input type="number"   title="Insira o Numero do endereço(ex: 33)">
                        <input type="text" title="Complemento" class="J_place">
                       <input class="btn" type="submit" value="Cadastrar">
                </form>    
                      
        </session>   
    
     <%@ include file="footer.jsp" %>
    </body>
</html>
