<%-- 
    Document   : cadVen4_PD
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
        <link href="src/css/form.css" rel="stylesheet" type="text/css"/>
        <link href="src/css/tabela.css" rel="stylesheet" type="text/css"/>
        <script src="src/scripts/jquery.js" type="text/javascript"></script>
        <script src="src/scripts/placeholder.js" type="text/javascript"></script>

        <title>Finalizar Pedido</title>
    </head>
    <body>
        <%@ include file="menu.jsp" %> 
    <session id="formulario">
        <a href=""><div id="voltar">voltar</div></a>
        <div id="container-h1"> <h1>Finalizar Pedido</h1> </div>
        
        <div id="table" style="border-radius: 0">  
            <table>
                    <tr>
                            <th>ID</th>
                            <th>Nome</th>
                            <th>Preço</th>  
                            <th title="Quantidade">Qt</th>
                            <th>Parcial</th>
                            <th>Opções</th>
                    </tr>
                    </thead>
                    <tbody>
                        <% for(int i=0; i<5;i++){ %>
                        <tr>
                            <td>2</td>
                            <td>Prod1 </td>                     
                            <td>12,50</td>
                            <td title="Quantidade">4</td>
                            <td>50,00</td>
                            <td><a href="ControleProduto?acao=excluir&id=<% %>"><img src="src/img/excluir.png" alt="excluir" title="excluir"/></a><a href="ControleProduto?acao=alterar&id=<%%>"><img src="src/img/editar.png" alt="alterar" title="alterar"/></a></td>
                        </tr>
                       <%} %> 
                    </tbody>
                </table>  
                    <table border="1px" style="margin-top: 10px; width:200px; float:right;">     
                    <thead>
                        <tr>
                            <th>Total</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr> 
                            <td>50,00</td>
                        </tr>
                    </tbody>
                </table> 
                     
            </div>  
            <form action="GerenciaPedido" method="post">   
              <input class="btn" type="submit" name="ac" value="Dar Sinal" style="display:inline-block; color:#aaa">
              <input class="btn" type="submit" name="ac" value="Pagar" style="display:inline-block">
             </form>                                     
        
          
    </session>   

    <%@ include file="footer.jsp" %>
</body>
</html>