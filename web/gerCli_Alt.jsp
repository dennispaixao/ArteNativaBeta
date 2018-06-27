<%-- 
    Document   : gerCli_Alt
    Created on : 23/05/2018, 17:23:56
    Author     : Dennis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Model.Cliente"%>
<%@page import="Model.Documento"%>
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
        <%
                Cliente c = (Cliente) request.getAttribute("cliente");
        %>    
        <session id="formulario">
            <div id="voltar" >   <a href="Navigation?ac=Gerencia_Cliente"> Voltar </a></div>
                <div id="container-h1"> <h1> Alterar Cliente </h1> </div>
                <form action="/ArteNativaBeta-master/GerenciaCliente" method="post"> 
                        <input type="hidden" title="Nome" name="id" value="<%= c.getIdCliente()%>">
                        <input type="text" title="Nome" name="nome" value="<%= c.getNome()%>">
                        <input type="text" title="Telefone Residêncial" name="tel" value="<%= c.getTlfixo()%>">
                         <input type="text" title="Telefone Celular" name="cel" value="<%= c.getCelular()%>">
                          <input type="text" title="Email" name="email" value="<%= c.getEmail()%>">
                        <p>data de nascimento: </p>
                        <input id="date" type="date" title="Data de Nascimento" name="dataNasc" value="<%= c.getDataNasc()%>">
                        <% for(Documento doc : c.getDocumentos()){ %>    
                            <%if(doc.getDescricao().equals("rg")) { %>
                                <input type="text" title="Rg" name="rg" value="<%= doc.getNumero() %>" >
                            <%} %>
                            <%if(doc.getDescricao().equals("cpf")) { %>
                                <input type="text" title="CPF" name="cpf" value="<%= doc.getNumero()%>">
                            <%} %>    
                        <%} %>
                        <input type="text" id="cep" title="CEP" name="cep" value="<%= c.getEndereco().getCep()%>">
                        <input type="text" id="rua" title="Rua" name="rua" value="<%= c.getEndereco().getRua()%>">
                        <input type="text" id="bairro" title="Bairro" name="bairro" value="<%= c.getEndereco().getBairro()%>">
                        <input type="text" id="cidade" title="Cidade" name="cidade" value="<%= c.getEndereco().getCidade()%>">
                        <input type="text" id="uf" title="Estado" name="estado" value="<%= c.getEndereco().getEstado()%>">
                        <p>Número da residência: </p>
                        <input type="number"  name="numero" title="Insira o Numero da residência(ex:9)" value="<%= c.getEndereco().getNumero()%>">
                        <input type="text" name="complemento" title="Complemento" value="<%= c.getEndereco().getComplemento()%>">
                        <input class="btn" type="submit" name="alterar_btn" value="Cancelar" style="display:inline-block">
                        <input class="btn" type="submit" name="acao" value="Alterar" style="display:inline-block">
                       
                </form>    
                      
        </session>   
    
     <%@ include file="footer.jsp" %>
    </body>
</html>
