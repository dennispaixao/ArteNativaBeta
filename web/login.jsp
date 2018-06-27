<%-- 
    Document   : login
    Created on : 15/05/2018, 13:15:36
    Author     : Dennis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
 <meta name="viewport" content="width=device-width, initial-scale=1.0">
<!DOCTYPE html>
<html>
    <head>
         <link rel="shortcut icon" href="src/img/icones/logo-ico.ico" type="image/x-icon" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arte Nativa</title>
        <link href="src/css/login.css" rel="stylesheet" type="text/css"/>
        <script src="src/scripts/jquery.js" type="text/javascript"></script>
        <script src="src/scripts/placeholder.js" type="text/javascript"></script>
        <script src="src/scripts/ctrl_login.js" type="text/javascript"></script>
    </head>
    <body>
        <section id="container-geral">
            
            <%
                String login = (String) request.getAttribute("login");
                String senha = (String) request.getAttribute("senha");
             %>  
            
            <section id="container-login">
                <div id="box-login">
                    <form action="/ArteNativaBeta-master/login" method="post">
                        <div id="logo">
                        
                        </div> 
                        <div id="nome-usuario"></div>
                        <span id="msg"></span>
                      
                        
                        <input  type="text" name="login" id="user" placeholder="Insira aqui o usuário" class="J_place"> 
                        <input type="password" name="senha" id="senha" placeholder="*****" class="J_place"> <br>    
                        <% 
                        if (login != null || senha != null){ %>
                            <p><%= login %></>
                        
                            <p><%= senha %></>
                        <%}%>                                
                        <div  id="links">
                        <a href="#"> cadastre-se </a> <br>
                        <a id="voltar" href="login.jsp"> voltar </a>
                        </div>
                        <!--<input type="button" id="btn-proximo" value="proximo" >-->
                        <input type="submit" id="btn-logar"  value="logar" >
                    </form>    
                </div>    
            </section>
            <section id="container-slogan">
            
            
            </section>
        </section>
        
        
    </body>
</html>
