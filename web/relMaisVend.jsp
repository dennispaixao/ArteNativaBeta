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
                <link href="src/css/grafico.css" rel="stylesheet" type="text/css"/>
        <link href="src/css/form.css" rel="stylesheet" type="text/css"/>

        <script src="src/scripts/jquery.js" type="text/javascript"></script>
        <script src="src/scripts/placeholder.js" type="text/javascript"></script>
        <script src="src/scripts/preenche_endereco.js" type="text/javascript"></script>
        <script src="src/scripts/chart.js" type="text/javascript"></script>

        <title>Mais Vendidos</title>


    </head>
    <body>
        <%@ include file="menu.jsp" %>

    <session id="formulario">

        <div id="container-h1"> <h1> Relatórios de desempenho nas vendas</h1> </div>

        <div id="container-graf"  >
            <canvas  id="graf_numero_VendasPorPeriodo"> </canvas>
        </div>
        <br>
        <div id="container-graf"  > 
            <canvas  id="graf_valor_VendasPorPeriodo"> </canvas>
        </div>
        <script>
            var ctx = document.getElementById('graf_numero_VendasPorPeriodo').getContext('2d');
            var chart = new Chart(ctx, {
                // tipo do gráfico
                type: 'bar',

                // The data for our dataset
                data: {
                    labels: ["Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"],
                    datasets: [{
                            label: "Número de vendas",
                            backgroundColor: 'rgb(50, 80, 120)',
                            borderColor: 'rgb(255, 100, 0)',
                            data: [0, 0, 0, 0, 0, 30, <%=35%>, 20, 10, 20, 30, 20]
                        }]
                },
                // Configuration options go here
                options: {}
            });

            var ctx = document.getElementById('graf_valor_VendasPorPeriodo').getContext('2d');
            var chart = new Chart(ctx, {
                // The type of chart we want to create
                type: 'bar',
                data: {
                    labels: ["Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"],
                    datasets: [{
                            label: "Valor em vendas",
                            backgroundColor: 'rgb(50, 220, 80)',
                            borderColor: 'rgb(255, 255, 0)',
                            data: [0, 0, 0, 0, 0, 150, 180, 200, 180, 180, 280, 300]
                        }]
                },
                // Configuration options go here
                options: {}
            });
            </script>
    </session>   
    <%@ include file="footer.jsp" %>
</body>
</html>
