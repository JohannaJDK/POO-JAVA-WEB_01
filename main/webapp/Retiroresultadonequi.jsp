<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>BOLSILLO DIGITAL</title>
    <link rel="stylesheet" href="Retiroresultadonequi.css">
</head>
<body>
    <header class="Botónes">
        <div>
            <img src="Retiro nequi.png" alt="">
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
<html lang="en">
</head>
<body>
    <form class="form-login">
        <center><p>Tu saldo anterior era: <%= request.getAttribute("SaldoAnterior")%></p></center>
        <center><p>Tu saldo ahora es: <%= request.getAttribute("Saldo")%></p></center>
        <Center><img src="Recargar nequi.png" title="" width="200" height="100" class="logo"></Center>
    </form>
</body>
</html>
</body>
</html>