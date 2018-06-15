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
        <div id="container-h1"> <h1> Pedidos </h1></div>
         <div id="box-pesquisa">   
                <input type="search" name="Venda" title="Pesquisa de pedido" class="J_place">  
                <div id="lupa"></div>
              
          </div>
            
        <div id="table">
            <table border="1px" >     
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Cliente</th>
                        <th>Data do pedido</th>
                        <th>Prazo finalização</th>
                        <th>Ultima atualização</th>
                        <th>Itens pendentes</th>
                        <th>Situação</th>
                        <th>Ferramentas</th>
                    </tr>
                </thead>
                <tbody>
                    <% for (int i = 9; i > 0 ; i--) { %>
                    <tr>
                        <td><%=81+ i %></td>
                        <td>José </td>
                        <td>01/06/2018</td>  
                        <td>30/06/2018</td>  
                        <td>01/06/2018</td>
                        <td>6</td>
                        <td>Finalizado</td>
                        <td>
                            <a href="GerenciaPedido?ac=VerPedido&id=<%=0 %>">
                                <img src="src/img/icones/lupa.png" alt="vizualizar" title="vizualizar"/>
                            </a>
                            <a href="ControlePedido?ac=ExcluirPedido&id=<%=0 %>">
                                <img src="src/img/excluir.png" alt="excluir" title="excluir"/>
                            </a>
                            <a href="GerenciaPedido?ac=AlterarPedido&id=<%=0%>">
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