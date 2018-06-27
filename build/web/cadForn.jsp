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
       <% 
           ArrayList<Categoria> listaCategoria = (ArrayList<Categoria>) request.getAttribute("listaCategoria"); 
           ArrayList<Categoria> listaCategoria = (ArrayList<Categoria>) request.getAttribute("listaCategoria"); 
       %>
        <session id="formulario">
            
            
                <div id="container-h1"> <h1> Cadastro de Fornecedor </h1> </div>
                <form action="/ArteNativaBeta-master/GerenciaFornecedor" method="post"> 
                        <input type="text" title="Nome" name="nome" class="J_place">
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
                        <input type="text" title="Telefone Fixo" name="tel" class="J_place">
                         <input type="text" title="Telefone Celular" name="cel" class="J_place">
                         <input type="text" title="Email" required="required" name="email" class="J_place">
                         <p>data de Criacão: </p>
                         <input id="date" type="date" required="required" title="Data Empresa" name="dataNasc" class="J_place">
                        <input type="text" title="CNPJ" name="cnpj" class="J_place" >
                        <input type="text" title="CPF" name="cpf" class="J_place">
                        <input type="text" id="cep" title="CEP" name="cep" class="J_place">
                        <input type="text" id="rua" title="Rua" name="rua" class="J_place">
                        <input type="text" id="bairro" title="Bairro" name="bairro" class="J_place">
                        <input type="text" id="cidade" title="Cidade" name="cidade" class="J_place">
                        <input type="text" id="uf" title="Estado" name="estado" class="J_place">
                        <p>Número do endereço: </p>
                        <input type="number"  name="numero" title="Insira o Numero do endereço(ex: 33)">
                        <input type="text" name="complemento" title="Complemento" class="J_place">
                       <input class="btn" type="submit" name="acao" value="Cadastrar">
                </form>    
                      
        </session>   
    
     <%@ include file="footer.jsp" %>
    </body>
</html>
