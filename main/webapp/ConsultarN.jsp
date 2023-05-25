<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>BOLSILLO DIGITAL</title>
    <link rel="stylesheet" href="Nconsultar.css">
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
                <!-- botón de registro -->
                <a href="bolsillo?accion=Registrarse" class="botonregistro">
                    <target="_blank">
                    <button>
                        REGISTRESE
                    </button>
                </a>
            </div>
        </header>
<html lang="en">
</head>
<body>
    <form class="form-login" method="POST" action="bolsillo">
        <Center><img src="consultanequi.png" title="" width="250" height="180" class="logo"></Center>
        <center><button type="submit" name="accion" value="ConsultarN">Consultar saldo</button></center>
    </form>
</body>
</html>