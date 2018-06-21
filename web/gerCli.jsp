<%-- 
    Document   : cadVend
    Created on : 24/05/2018, 16:15:07
    Author     : Dennis
--%>

<%@page import="Model.Categoria"%>
<%@page import="Model.Cliente"%>
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
        <div id="container-h1"> <h1> Nossos Clientes </h1>
        </div>
         <div id="box-pesquisa">   
                <input type="search" name="Cliente" title="Cliente" class="J_place">  
                <div id="lupa"></div>
          </div>
        <%
                ArrayList<Cliente> clientes = (ArrayList<Cliente>) request.getAttribute("listaCliente");
        %>    
        <div id="table">
            <table border="1px" >     
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Nome</th>
                        <th>Data de Inclusão</th>
                        <th>Situação</th>
                        <th>Ferramentas</th>
                    </tr>
                </thead>
                <tbody>
                    <% 
                        if (clientes != null){ %>
                    <% for (Cliente cliente : clientes) { %>
                    <tr>
                        <td><%= cliente.getIdCliente() %></td>
                        <td><%= cliente.getNome() %></td>  
                        <td><%= cliente.getDataCadastro() %></td>
                        <td>Aguardando Pedido</td>
                        <td>
                            <a href="GerenciaCliente?ac=VerCliente&id=<%=0 %>">
                                <img src="src/img/icones/lupa.png" alt="vizualizar" title="vizualizar"/>
                            </a>
                            <a href="ControleCliente?ac=ExcluirProduto&id=<%=0 %>">
                                <img src="src/img/excluir.png" alt="excluir" title="excluir"/>
                            </a>
                            <a href="GerenciaCliente?ac=AlterarCliente&id=<%=0%>">
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