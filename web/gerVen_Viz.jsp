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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="src/css/form.css" rel="stylesheet" type="text/css"/>
        <link href="src/css/tabela.css" rel="stylesheet" type="text/css"/>
        <script src="src/scripts/jquery.js" type="text/javascript"></script>
        <script src="src/scripts/placeholder.js" type="text/javascript"></script>
        <script src="src/scripts/preenche_endereco.js" type="text/javascript"></script>
        <title>Ver Pedido</title>
    </head>
    <body>
    <%@ include file="menu.jsp" %>
        <div id="container-h1" > <h1> Itens do Pedido </h1>
        </div>
            
        <div id="table" style="border-radius: 10px;margin-top: 20px;">
            <table border="1px" >     
                <thead>
                    <tr>
                        <th>ID do pedido</th>
                        <th>Produto</th>
                        <th>Prazo de entrega</th>
                        
                        <th>Situação</th>
                        <th>Ferramentas</th>
                    </tr>
                </thead>
                <tbody>
                    <% for (int i = 9; i > 0 ; i--) { %>
                    <tr>
                        <td><%=81+ i %></td>
                        <td>Nome do item do pedido</td>
                        <td>01/06/2018</td>
                        <td>Finalizado</td>
                        <td>
                            <a href="GerenciaPedido?ac=VerPedido&id=<%=0 %>">
                                <img src="src/img/icones/baixa.png" alt="Baixa" title="Baixa"/>
                            </a>
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
