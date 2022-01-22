<%-- 
    Document   : index
    Created on : 14/12/2021, 08:07:20
    Author     : lucquifer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta http-equiv="content-type" content="text/html; charset=UTF-8">
        <meta charset="UTF-8">
        <title>Agencia de Viajes</title>

        <!-- Aqui van los links------------------------------------------------------------------------->
        <link rel="stylesheet" href="css/normalize.css">
        <link rel="stylesheet" href="css/swiper-bundle.css">
        <link rel="stylesheet" href="css/style.css">
        <!-- Aqui van los links------------------------------------------------------------------------->   

    </head>
    <body>
        <!-- partial:index.partial.html -->
        <div class="container">
            <div class="header">
                <a class="menu-icon" href="#">
                </a>
                <img class="logo" src="index_archivos/Silicome.webp">
                <div class="header-menu">

                    <a href="AltaEmpleado.jsp">Alta<br>Empleado</a>
                    <a href="AdminEmpleados.jsp">Administrar<br>Empleados</a>

                    <a href="AltaCliente.jsp">Alta<br>cliente</a>
                    <a href="AdminClientes.jsp">Administar<br>Clientes</a>

                    <a href="AltaServicio.jsp">Alta<br>Servicio</a>
                    <a href="AdminServicios.jsp">Administar<br>Servicios</a>

                    <a href="AltaPaquete.jsp">Alta<br>Paquete</a>
                    <a href="AdminPaquetes.jsp">Administar<br>Paquetes</a>

                    <a href="AltaVenta.jsp">Alta<br>Venta</a>
                    <a href="AdminVentas.jsp">Administar<br>Ventas</a>
                    
                    <div class="header-icons">
                    </div>
                </div>
                <div class="mySwiper swiper-fade swiper-initialized swiper-horizontal swiper-pointer-events">
                    <div class="main-wrapper swiper-wrapper" style="transition-duration: 0ms;" id="swiper-wrapper-1fab63c6dbff25a0" aria-live="polite">
                        <div class="main swiper-slide swiper-slide-duplicate swiper-slide-prev" id="coral" data-swiper-slide-index="3" style="width: 1023px; transition-duration: 0ms; opacity: 1; transform: translate3d(0px, 0px, 0px);" role="group" aria-label="4 / 4">
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
                                    <h3 class="main-header">Bienvenidos Empleado</h3>
                                    <h1 class="main-title">Elige una opcion</h1>
                                </div>
                                <div class="main-content">
                                    <div class="main-content__title">
                                    </div>
                                    <div class="main-content__subtitle"></div>
                                </div>
                            </div>
                            <div class="center">
                                <div class="right-side__img">
                                    <p>Hola</p>
                                </div>
                            </div>
                        </div>
                        <span class="swiper-notification" aria-live="assertive" aria-atomic="true">

                        </span>
                    </div>
                </div>

                <!-- Aqui da el movimiento -->
                <script src="js/swiper-bundle.js">
                </script>
                <script src="js/script.js">
                </script>
            </div>