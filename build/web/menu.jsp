

<link href="src/css/menu.css" rel="stylesheet" type="text/css"/>
<script src="src/scripts/jquery.js" type="text/javascript"></script>
<script src="src/scripts/btnMenu.js" type="text/javascript"></script>
<script src="src/scripts/oculos_bold.js" type="text/javascript"></script>
 <meta name="viewport" content="width=device-width, initial-scale=1.0">
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<meta charset="utf-8">

        <div id="topo">
              <div id="greetings">
                  <p> Bom dia Dennis
                  <a href=""> Sair </a></p>
              </div>    
              <div id="logo"> 
              </div>
              <div id="oculos" title="negrito" alt="negrito">
              </div>
              
        </div>
        <nav id="menu">
            
            

            <ul>
                <li id="teste">Cadastrar
                         <ul>
                            <li><a href="Navigation?ac=Cadastro_Cliente">Cliente </a></li>
                            <li><a href="Navigation?ac=Cadastro_Produto">Produto </a></li>
                            <li><a href="Navigation?ac=Cadastro_Fornecedor">Fornecedor </a></li>
                            <li><a href="Navigation?ac=Cadastro_Pedido">Venda </a></li>
                        </ul>
                </li>
                <li>Gerenciar
                         <ul>
                            <li><a href="Navigation?ac=Gerencia_Cliente">Cliente </a></li>
                            <li><a href="Navigation?ac=Gerencia_Produto">Produto </a></li>
                            <li><a href="Navigation?ac=Gerencia_Fornecedor">Fornecedor </a></li>
                            <li><a href="Navigation?ac=Gerencia_Pedidos">Vendas </a></li>
                            <li><a href="Navigation?ac=Gerencia_Estoque">Estoque </a></li>
                        </ul>
                </li>

                 <li>Relatórios
                         <ul>
                            <li><a href="Navigation?ac=Relatorios_MaisVendidos">Mais vendidos </a></li>
                            <li><a href="Navigation?ac=Relatorios_Estoque">Estoque</a></li>
                        </ul>
                </li>
            </ul>

        </nav>  

        <div id="btn-menu">
            <hr> <hr> <hr>
        </div>

