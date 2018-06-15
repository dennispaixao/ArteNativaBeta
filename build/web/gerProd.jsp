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

        <title>Produtos</title>
    </head>
    <body>

  
        <%@ include file="menu.jsp" %> 
        <div id="container-h1"><h1> Produtos Cadastrados </h1></div>
          <div id="box-pesquisa">   
                <input type="search" name="Cliente" title="Produto" class="J_place">  
                <div id="lupa"></div>
              
          </div>
      
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
                    <% for (int i = 0; i <10; i++) { %>
                    <tr>
                        <td>386845</td>
                        <td>Produto <%= i %></td>  
                        <td>Categoria 1</td>
                        <td>Grupo1</td>
                        <td>
                            <a href="GerenciaProduto?ac=VerProduto&id=<%=0 %>">
                                <img src="src/img/icones/lupa.png" alt="vizualizar" title="vizualizar"/>
                            </a>
                            <a href="GerenciaProduto?ac=ExcluirProduto&id=<%=0 %>=<% %>">
                                <img src="src/img/excluir.png" alt="excluir" title="excluir"/>
                            </a>
                            <a href="GerenciaProduto?ac=AlterarProduto&id=<%=0 %>=<% %>">
                                <img src="src/img/editar.png" alt="alterar" title="alterar"/>
                            </a>
                        </td>
                    </tr>
                    <%}%> 
                </tbody>
            </table>
        </div>        
        <%@ include file="footer.jsp" %>
    </body>
</html>