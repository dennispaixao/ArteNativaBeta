<%-- 
    Document   : cadVend
    Created on : 24/05/2018, 16:15:07
    Author     : Dennis
--%>

<%@page import="Model.Categoria"%>
<%@page import="Model.Fornecedor"%>
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

        <title>Fornecedores</title>
    </head>
    <body>

        
        <%@ include file="menu.jsp" %> 
        <div id="container-h1"><h1> Fornecedores </h1></div>
         <div id="box-pesquisa">   
                <input type="search" name="Fornecedor" title="Fornecedor" class="J_place">  
                <div id="lupa"></div>
              
          </div> 
             <%
                ArrayList<Fornecedor> fornecedores = (ArrayList<Fornecedor>) request.getAttribute("listaFornecedores");
        %>  
        <div id="table">
            <table border="1px" >     
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Nome</th>
                        <th>Categoria</th>
                        <th>Grupo</th>
                        <th>Ferramentas</th>
                    </tr>
                </thead>
                <tbody>
                     <% 
                        if (fornecedores != null){
                    %>
                    <% for (Fornecedor forne : fornecedores) { %>
                    <tr>
                        <td><%= forne.getIdFornecedor() %></td>
                        <td><%= forne.getNome() %></td>  
                        <td>Estofado</td>
                        <td>Sala</td>
                        <td>
                            <a href="GerenciaFornecedor?ac=VerFornecedor&id=<%= forne.getIdFornecedor() %>">
                                <img src="src/img/icones/lupa.png" alt="vizualizar" title="vizualizar"/>
                            </a>
                            <a href="GerenciaFornecedor?ac=ExcluirFornecedor&id=<%= forne.getIdFornecedor() %>">
                                <img src="src/img/excluir.png" alt="excluir" title="excluir"/>
                            </a>
                            <a href="GerenciaFornecedor?ac=AlterarFornecedor&id=<%= forne.getIdFornecedor() %>">
                                <img src="src/img/editar.png" alt="alterar" title="alterar"/>
                            </a>
                        </td>
                    </tr>
                    <%}%> 
                  <%}%>  
                </tbody>
            </table>
        </div>        
        <%@ include file="footer.jsp" %>
    </body>
</html>