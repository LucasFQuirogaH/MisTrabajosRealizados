<%-- 
    Document   : Alta Empleado
    Created on : 14/12/2021, 07:43:45
    Author     : lucquifer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en"><head>
        <meta http-equiv="content-type" content="text/html; charset=UTF-8">
        <meta charset="UTF-8">
        <title>Agencia de Viajes</title>
        <link rel="stylesheet" href="css/normalize.css">
        <link rel="stylesheet" href="css/swiper-bundle.css"><link rel="stylesheet" href="css/style.css">

    </head>
    <body>
        <!-- partial:index.partial.html -->
        <div class="container">
            <div class="header">
                <a class="menu-icon" href="#">
                </a>

                <img class="logo" src="index_archivos/Silicome.webp">
                <div class="header-menu">
                </div>
                <div class="header-icons">
                </div>
            </div>


            <div class="mySwiper swiper-fade swiper-initialized swiper-horizontal swiper-pointer-events">
                <div class="main-wrapper swiper-wrapper" style="transition-duration: 0ms;" id="swiper-wrapper-1fab63c6dbff25a0" aria-live="polite"><div class="main swiper-slide swiper-slide-duplicate swiper-slide-prev" id="coral" data-swiper-slide-index="3" style="width: 1023px; transition-duration: 0ms; opacity: 1; transform: translate3d(0px, 0px, 0px);" role="group" aria-label="4 / 4">
                        <div class="left-side">
                            <div class="main-wrapper">
                                <h3 class="main-header">Closca Bottle</h3>
                                <h1 class="main-title">Coral</h1>
                                <h2 class="main-subtitle">€ 39.90</h2>
                            </div>
                        </div>
                        <div class="center">
                            <div class="right-side__img">
                                <img class="bottle-bg" src="index_archivos/photo-1546500840-ae38253aba9b.avif" alt="">
                                <img class="bottle-img" src="index_archivos/Coral_OK.webp">
                            </div>
                        </div>
                    </div>






                    <div class="main swiper-slide swiper-slide-next" id="savanna" data-swiper-slide-index="1" style="width: 1023px; transition-duration: 0ms; opacity: 0; transform: translate3d(-2046px, 0px, 0px);" role="group" aria-label="2 / 4">
                        <div class="left-side">
                            <div class="main-wrapper">
                                <h3 class="main-header">Empleados</h3>
                                <h1 class="main-title">Alta de nuevos empleados</h1>
                                <h2 class="main-subtitle"></h2>
                            </div>
                            <div class="main-content">
                                <div class="main-content__title">
                                </div>
                                <div class="main-content__subtitle"></div>
                                <div class="more-menu">
                                </div>
                            </div>
                        </div>
                        <div class="center">
                            <form action="SvAltaEmpleado" method="POST">

                                <label>Nombre: </label><input type="text" name="nombre">
                                <label>Apellido: </label><input type="text" name="apellido">
                                <label>Direccion: </label><input type="text" name="direccion">
                                <label>DNI: </label><input type="text" name="dni"></p>

                                <label for="start">Fec. de Nac.:</label><br>
                                <input type="date" id="start" name="fecha_nac"
                                       value="07-22-2018"
                                       min="1900-01-01" max="2100-12-31">
                                
                                <label>Nacionalidad: </label><input type="text" name="nacionalidad">
                                <label>Celular: </label><input type="text" name="celular">
                                <label>Email: </label><input type="text" name="email">
                                <label>Cargo: </label><input type="text" name="cargo">
                                <label>Sueldo: </label><input type="text" name="sueldo">
                                <label>Usuario: </label><input type="text" name="nombreUsu">
                                <label>Contraseña: </label><input type="password" name="contrasenia">

                                <input type="submit" value="Crear Empleado"><br>
                            </form>

                        </div>
                    </div>
                    <span class="swiper-notification" aria-live="assertive" aria-atomic="true"></span></div>

                <script src="js/swiper-bundle.js"></script><script src="js/script.js"></script>
                </body></html>
