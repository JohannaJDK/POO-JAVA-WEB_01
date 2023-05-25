<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>BOLSILLO DIGITAL</title>
    <link rel="stylesheet" href="Consultarresultadonequi.css">
</head>
<body>
    <header class="Botónes">
        <div>
            <img src="Group 6 (2).svg" alt="">
        </div>
            <!-- Contenedor del botón de inicio -->
            <div>
                <a href="bolsillo?accion=index" class="botoninicio">
                    <target="_blank">
                    <button>
                        INICIO
                    </button>
                </a>
            </div>
        </header>
</head>
    <form class="form-login">
    <center><p>Tu Saldo ahora es de: <%= request.getAttribute("Saldo")%></p></center>
    <Center><img src="consultanequi.png" title="" width="250" height="180" class="logo"></Center>
</form>
</body>
</html>