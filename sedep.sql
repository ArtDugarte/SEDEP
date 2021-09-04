-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 04-09-2021 a las 16:58:49
-- Versión del servidor: 5.5.24-log
-- Versión de PHP: 5.4.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `sedep`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historial`
--

CREATE TABLE IF NOT EXISTS `historial` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fecha` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `id_paciente` int(11) NOT NULL,
  `id_resultado` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_usuario` (`id_paciente`),
  KEY `id_resultado` (`id_resultado`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=2 ;

--
-- Volcado de datos para la tabla `historial`
--

INSERT INTO `historial` (`id`, `fecha`, `id_paciente`, `id_resultado`) VALUES
(1, '24/08/2021', 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paciente`
--

CREATE TABLE IF NOT EXISTS `paciente` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `cedula` varchar(10) COLLATE utf8_spanish_ci NOT NULL,
  `id_usuario` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_usuario` (`id_usuario`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=3 ;

--
-- Volcado de datos para la tabla `paciente`
--

INSERT INTO `paciente` (`id`, `nombre`, `cedula`, `id_usuario`) VALUES
(1, 'LAURA ORTEGA', '26976713', 2),
(2, 'HELENA RODRIGUEZ', '24946016', 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pregunta`
--

CREATE TABLE IF NOT EXISTS `pregunta` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pregunta` varchar(200) COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=9 ;

--
-- Volcado de datos para la tabla `pregunta`
--

INSERT INTO `pregunta` (`id`, `pregunta`) VALUES
(1, '¿TIENE VIDA SEXUAL ACTIVA?'),
(2, '¿ATRASO MENSTRUAL?'),
(3, '¿DOLOR PÉLVICO?'),
(4, '¿TIENE FIEBRE?'),
(5, '¿TIENE ARDOR PARA ORINAR?'),
(6, '¿TIENE CICLOS MENSTRUALES IRREGULARES?'),
(7, '¿TIENE FLUJO VAGINAL?'),
(8, '¿UTILIZA ALGÚN MÉTODO ANTICONCEPTIVO?');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pregunta_resultado`
--

CREATE TABLE IF NOT EXISTS `pregunta_resultado` (
  `id_pregunta` int(11) NOT NULL,
  `id_resultado` int(11) NOT NULL,
  KEY `id_pregunta` (`id_pregunta`),
  KEY `id_resultado` (`id_resultado`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `pregunta_resultado`
--

INSERT INTO `pregunta_resultado` (`id_pregunta`, `id_resultado`) VALUES
(1, 1),
(2, 1),
(6, 1),
(3, 2),
(4, 2),
(5, 2),
(2, 3),
(3, 3),
(6, 3),
(1, 4),
(3, 4),
(7, 4),
(8, 4),
(1, 5),
(3, 5),
(7, 5),
(8, 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `resultado`
--

CREATE TABLE IF NOT EXISTS `resultado` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `diagnostico` varchar(200) COLLATE utf8_spanish_ci NOT NULL,
  `recomendacion` varchar(200) COLLATE utf8_spanish_ci NOT NULL,
  `borrado` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=6 ;

--
-- Volcado de datos para la tabla `resultado`
--

INSERT INTO `resultado` (`id`, `diagnostico`, `recomendacion`, `borrado`) VALUES
(1, 'EMBARAZO', 'PRUEBA DE EMBARAZO HCG FRACCIÓN BETA', 0),
(2, 'INFECCIÓN URINARIA', 'REALIZAR EXAMEN DE ORINA', 0),
(3, 'OVARIOS POLIQUÍSTICOS', 'REALIZARCE ECOGRAFÍA PÉLVICA', 0),
(4, 'ENFERMEDAD INFLAMATORIA PÉLVICA', 'SE RECOMIENDA CONSULTA GINECOLÓGICA', 1),
(5, 'ENFERMEDAD INFLAMATORIA PÉLVICA', 'SE RECOMIENDA CONSULTA GINECOLÓGICA', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE IF NOT EXISTS `usuario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(15) COLLATE utf8_spanish_ci NOT NULL,
  `Clave` varchar(8) COLLATE utf8_spanish_ci NOT NULL,
  `Tipo` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=4 ;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id`, `Nombre`, `Clave`, `Tipo`) VALUES
(1, 'Admin', '12345', 1),
(2, '26976713', '123', 0),
(3, '24946016', '24946016', 0);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `historial`
--
ALTER TABLE `historial`
  ADD CONSTRAINT `historial_ibfk_1` FOREIGN KEY (`id_paciente`) REFERENCES `paciente` (`id`),
  ADD CONSTRAINT `historial_ibfk_2` FOREIGN KEY (`id_resultado`) REFERENCES `resultado` (`id`);

--
-- Filtros para la tabla `paciente`
--
ALTER TABLE `paciente`
  ADD CONSTRAINT `paciente_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id`);

--
-- Filtros para la tabla `pregunta_resultado`
--
ALTER TABLE `pregunta_resultado`
  ADD CONSTRAINT `pregunta_resultado_ibfk_1` FOREIGN KEY (`id_pregunta`) REFERENCES `pregunta` (`id`),
  ADD CONSTRAINT `pregunta_resultado_ibfk_2` FOREIGN KEY (`id_resultado`) REFERENCES `resultado` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
