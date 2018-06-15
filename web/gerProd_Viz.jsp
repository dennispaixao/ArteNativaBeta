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
        <script src="src/scripts/jquery.js" type="text/javascript"></script>
        <script src="src/scripts/placeholder.js" type="text/javascript"></script>
        <script src="src/scripts/preenche_endereco.js" type="text/javascript"></script>
        <title>Alterar dados do produto</title>
    </head>
    <body>
        <%@ include file="menu.jsp" %>

    <session id="formulario">
        <div id="voltar" >   <a href="Navigation?ac=Gerencia_Produto"> Voltar </a></div>
        <div id="container-h1"> <h1> VER PRODUTO </h1> </div>
        <form>  
            <session id="formulario">


                <form action="GerenciaProduto?ac=AlterarProduto" method="post"> 
                    <p>Categoria:</p>
                    <input type="text" name="categoria" title="categoria" readonly value="cat1" >
                   
                    <p>Grupo:</p>
                    <input type="text" name="grupo" title="grupo" readonly value="grupo1" >
                     <p>Nome:</p>
                    <input type="text" name="nome" title="Nome" readonly value="Produto 001">
              
                     <p>Descrição curta:</p>
                    <textarea style="height:50px" name="descCurta" title="Descrição curta" readonly value=""> </textarea>
                     <p>Descrição longa:</p>
                    <textarea name="descLonga" title="Descrição longa" readonly value=""> </textarea>
                     <p>Altura(mm):</p>
                    <input type="text" name="altura" title="Altura(mm)" readonly value="" >
                     <p>Largura(mm):</p>
                    <input type="text" name="largura" title="Largura(mm)" readonly value=""> 
                     <p>Profundidade(mm):</p>
                    <input type="text" name="profundidade" title="Profundidade(mm)" readonly value=""> 
                     <p>Preço de venda:</p>
                    <input type="text" name="precoVenda" title="Preço de venda" readonly value=""> 
                     <p>Peso:</p>
                    <input type="text" name="peso" title="peso" readonly value=""> 

                    <br> <hr>
                    <input class="btn" type="submit" value="Alterar">
                </form>    

            </session>   




            <%@ include file="footer.jsp" %>
            </body>
            </html>
