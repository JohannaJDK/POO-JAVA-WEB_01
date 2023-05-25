<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>BOLSILLO DIGITAL</title>
    <link rel="stylesheet" href="Nrecarga.css">
</head>
<body>
    <header class="Botónes">
        <div>
            <img src="RecargaN.png" alt="">
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
</head>
    <form class="form-login" method="POST" action="bolsillo">
        <Center><img src="Recargar nequi.png" title="" width="200" height="100" class="logo"></Center>
        <input class="controls" type="text" name="RecargarN" value="" placeholder="Dinero A Recargar">
        <center><button type="submit" name="accion" value="RecargaN"></button>></center>
    </form>
</body>
</html>