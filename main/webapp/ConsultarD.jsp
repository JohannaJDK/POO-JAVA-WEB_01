<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>BOLSILLO DIGITAL</title>
    <link rel="stylesheet" href="Dconsulta.css">
</head> 
<body>
    <header class="Botónes">
        <div>
            <img src="Consuldavi.png" alt="">
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
    <Center><img src="consultadavi.png" title="" width="250" height="180" class="logo">
    <center><button type="submit" name="accion" value="ConsultarD">Consultar saldo</button>></center>
</form>
</body>
</html>
