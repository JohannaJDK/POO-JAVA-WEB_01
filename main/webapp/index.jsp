<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>BOLSILLO DIGITAL</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <!-- Nombre de la clase -->
    <header class="contenedor">
        <div>
            <img src="header2.svg" alt="">
        </div>
        <!-- Contenedor del botón de inicio -->
        <div>
            <a href="bolsillo?accion=index" class="botoninicio">
                <button>
                    INICIO
                </button>
            </a>
            <!-- botón de registro -->
            <a href="bolsillo?accion=Registrarse" class="botonregistro">
                <button>
                    REGISTRESE
                </button>
            </a>
        </div>
    </header>

    <!-- Botón de ingreso a nequi -->
    <!--target define los enlances a que direccion van -->
    
    <div class="ingresonequi">
        <center><img src="nequiicon.svg" alt=></center>
    </div>
    <div>
        <a href="bolsillo?accion=Nequi" class="botonnequi">
             <target="_blank">
            <button>
                INGRESAR
            </button>
        </a>
    </div>

    <!-- Botón de ingresar a daviplata -->
    <!--target define los enlances a que direccion van -->

    <div class="ingresodavi">
        <center><img src="daviicon.svg" alt=""></center>
    </div>
    <div>
        <a href="bolsillo?accion=Daviplata" class="botondaviiplata">
            <target="_blank">
            <button>
                INGRESAR
            </button>
        </a>
    </div>
    <!-- Footer o pie de página -->
    <footer class="piedepag">
        <div>
            <img src="footer2.svg" alt="">
        </div>
    </footer>
</body>
</html>