<%-- 
    Document   : gerCli_Alt
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
        <title>Alterar dados de Cliente</title>
    </head>
    <body>


        <%@ include file="menu.jsp" %>



    <session id="formulario">
       <div id="voltar" >   <a href="Navigation?ac=Gerencia_Produto"> Voltar </a></div>

        <div id="container-h1"> <h1> Alterar Produto </h1> </div>
        <form> 
          

            <p>categoria:</p>
            <select name="Categoria">
                <%
                    for (int i = 1; i < 4; i++) {
                %>
                <option value="categoria"> Categoria</option>
                <%
                    }
                %> 
            </select>
            <p>grupo:</p>
            <select name="Grupo">
                <%
                    for (int i = 1; i < 4; i++) {
                %>
                <option value="grupo">Grupo </option>
                <%
                    }
                %> 
            </select>

            <input type="text" name="nome" title="Nome" class="J_place">
            <p> Insira fotos </p>
            <input type="file" name="nome" title="Nome"   />
            <div id="prev_fotos"> </div>
            <textarea style="height:50px" name="descCurta" title="Descrição curta" class="J_place"> </textarea>
            <textarea name="descLonga" title="Descrição longa" class="J_place"> </textarea>
            <input type="text" name="altura" title="Altura(mm)" class="J_place">
            <input type="text" name="largura" title="Largura(mm)" class="J_place"> 
            <input type="text" name="profundidade" title="Profundidade(mm)" class="J_place"> 
            <input type="text" name="precoVenda" title="Preço de venda" class="J_place"> 
            <input type="text" name="peso" title="peso" class="J_place"> 
            <br><hr>
            <input class="btn" type="submit" value="Cancelar" style="display:inline-block">
            <input class="btn" type="submit" value="Alterar" style="display:inline-block; ">
        </form>    

    </session>   

    <%@ include file="footer.jsp" %>
</body>
</html>
