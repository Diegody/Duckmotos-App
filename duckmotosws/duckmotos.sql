-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 14-05-2022 a las 14:30:46
-- Versión del servidor: 5.5.24-log
-- Versión de PHP: 5.4.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

DROP DATABASE IF EXISTS duckmotos;
CREATE DATABASE IF NOT EXISTS duckmotos;
USE duckmotos;


CREATE TABLE IF NOT EXISTS `comentarios` (
  `idcomentario` int(10) NOT NULL AUTO_INCREMENT,
  `texto` varchar(150) NOT NULL,
  `idpublicacion` int(10) NOT NULL,
  `idusuario` int(10) NOT NULL,
  PRIMARY KEY (`idcomentario`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

INSERT INTO `comentarios` (`idcomentario`, `texto`, `idpublicacion`, `idusuario`) VALUES
(1, 'xtx01', 1, 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `imagenes`
--

CREATE TABLE IF NOT EXISTS `imagenes` (
  `idimagen` int(10) NOT NULL AUTO_INCREMENT,
  `imagen` text NOT NULL,
  `descripcion` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`idimagen`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Volcado de datos para la tabla `imagenes`
--

INSERT INTO `imagenes` (`idimagen`, `imagen`, `descripcion`) VALUES (1, "https://www.mundomotero.com/wp-content/uploads/2014/11/Yamaha-R1M_5.jpg","La Yamaha YZF-R1M es una edición especial y limitada, destinada para equipos profesionales y pilotos experimentados que busquen el máximo rendimiento en circuito y competición de esta moto deportiva de Yamaha."),
(2,"https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.moto1pro.com%2Fmarca-de-motos%2FYamaha%2FYamaha-MT-09-2019&psig=AOvVaw1A65b90bJoT5jQceqL_TnG&ust=1665767941591000&source=images&cd=vfe&ved=0CAwQjRxqFwoTCJCk0KXb3foCFQAAAAAdAAAAABAJ","La Yamaha MT-09 es la naked de la marca japonesa con motor de tres cilindros con configuración crossplane renovada por completo en 2021, año en el que estrena motor y chasis, así como una electrónica más avanzada."),
(3,"https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.motofichas.com%2Fmarcas%2Fducati%2Fpanigale-v4&psig=AOvVaw2cmTjMxgbvYSvWT96R_iwe&ust=1665768074666000&source=images&cd=vfe&ved=0CAwQjRxqFwoTCNCt9eTb3foCFQAAAAAdAAAAABAI","La Ducati Panigale V4 es una deportiva que deriva directamente de la Desmosedici de MotoGP, una moto muy avanzada tecnológicamente con un explosivo motor capaz de rendir más de 215 CV. Lanzada en 2018, la Panigale V4 se ha ido renovando estos años."),
(4,"https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.elcarrocolombiano.com%2Fdos-ruedas%2Ftvs-apache-rr-310-caracteristicas-y-precio-en-colombia%2F&psig=AOvVaw3zcxCpW5ksKHjb4WdJ2hvV&ust=1665768142425000&source=images&cd=vfe&ved=0CAwQjRxqFwoTCKCul4Xc3foCFQAAAAAdAAAAABAE","La marca de motocicletas TVS sigue marcando su senda de crecimiento en el mercado colombiano con el estreno en el país de la TVS Apache RR 310, modelo con el cual llega por primera vez al segmento de motos Premium de mediano cilindraje, uno de los que más aumentó sus ventas durante el año anterior."),
(5,"https://media.revistagq.com/photos/5d91d8ab261a8f0008786d32/4:3/w_3600,h_2700,c_limit/20190917-Bike-01.png","la Ducati Hypermotard 950 SP se trata de una moto preciosa. Luego está su estructura: es alta y erguida, pero perfecta para desplazar peso de un lado a otro. Alcanza una potencia inimaginable en un abrir y cerrar de ojos y los frenos te pararán igual de rápido."),
(6,"data:image/jpeg;base64,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","Kawasaki Z1000/R 2020 frente a KTM 1290 Super Duke R 2017-2019. Comparamos estas dos motos, lo mejor de cada una y sus ventajas: Precios, prestaciones, consumos, dimensiones…"),
(7,"https://img.remediosdigitales.com/f6069a/1000_1000_kawasaki_h2r_02_1000/450_1000.jpg","Su máxima ha sido crear una moto que ofreciera, según sus propias palabras, una aceleración nunca vista antes sobre una moto. Para ello han usado un motor sobrealimentado que no ofrecerá menos de 300 cv, manteniendo en todo momento un tamaño compacto.");

CREATE TABLE IF NOT EXISTS `perfiles` (
  `idperfil` int(10) NOT NULL AUTO_INCREMENT,
  `tipo` varchar(45) NOT NULL DEFAULT 'usuario',
  `codigo` int(2) NOT NULL DEFAULT '1',
  `idusuario` int(10) NOT NULL,
  PRIMARY KEY (`idperfil`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=14 ;

INSERT INTO `perfiles` (`idperfil`, `tipo`, `codigo`, `idusuario`) VALUES
(1, 'admin', 2, 1),
(2, 'usuario', 1, 2),
(3, 'usuario', 1, 3),
(4, 'usuario', 1, 1),
(5, 'usuario', 1, 1),
(6, 'usuario', 1, 1),
(7, 'usuario', 1, 1),
(8, 'usuario', 1, 3),
(9, 'usuario', 1, 2),
(10, 'usuario', 1, 2),
(11, 'usuario', 1, 2),
(12, 'usuario', 1, 2),
(13, 'usuario', 1, 3);



CREATE TABLE IF NOT EXISTS `publicaciones` (
  `idpublicacion` int(10) NOT NULL AUTO_INCREMENT,
  `idusuario` int(10) NOT NULL,
  `idimagen` int(10) NOT NULL,
  PRIMARY KEY (`idpublicacion`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

INSERT INTO `publicaciones` (`idpublicacion`, `idusuario`, `idimagen`) VALUES
(1, 3, 3);

CREATE TABLE IF NOT EXISTS `usuario` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `apellido` varchar(45) DEFAULT NULL,
  `correo` varchar(90) DEFAULT NULL,
  `username` varchar(45) NOT NULL DEFAULT 'usuario',
  `password` varchar(45) NOT NULL DEFAULT 'clave',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

INSERT INTO `usuario` (`id`, `nombre`, `apellido`, `correo`, `username`, `password`) VALUES
(1, 'Diego', 'Cardenas', 'dmcardenash@usbbog.edu.co', 'Diegody', '1234'),
(2, 'David', 'Gonzalez', 'davidg@hotmail.com', 'Dav', '4321');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
