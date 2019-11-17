-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Nov 17, 2019 at 08:24 PM
-- Server version: 5.7.26
-- PHP Version: 7.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `icecreamup`
--

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE IF NOT EXISTS `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `ingredients`
--

DROP TABLE IF EXISTS `ingredients`;
CREATE TABLE IF NOT EXISTS `ingredients` (
  `INGREDIENT_ID` int(11) NOT NULL AUTO_INCREMENT,
  `INGREDIENT_NAME` varchar(255) NOT NULL,
  `AVAILABLE` tinyint(1) NOT NULL,
  `PRICE` double(10,2) NOT NULL,
  PRIMARY KEY (`INGREDIENT_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `ingredients`
--

INSERT INTO `ingredients` (`INGREDIENT_ID`, `INGREDIENT_NAME`, `AVAILABLE`, `PRICE`) VALUES
(4, 'Chocolate', 1, 2.50),
(5, 'Vanilla', 1, 2.50),
(6, 'Mint', 1, 2.75),
(7, 'Cookie Dough', 1, 2.75),
(8, 'Rainbow Sprinkles', 1, 0.25),
(9, 'Chocolate Chips', 1, 0.30);

-- --------------------------------------------------------

--
-- Table structure for table `orderdto`
--

DROP TABLE IF EXISTS `orderdto`;
CREATE TABLE IF NOT EXISTS `orderdto` (
  `order_id` int(11) NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `comments` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `ordered_by` varchar(255) DEFAULT NULL,
  `phone_number` varchar(255) DEFAULT NULL,
  `time_stamp` datetime DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `orderitems`
--

DROP TABLE IF EXISTS `orderitems`;
CREATE TABLE IF NOT EXISTS `orderitems` (
  `ORDER_ID` int(11) NOT NULL,
  `PRODUCT_ID` int(11) NOT NULL,
  `QUANTITY` int(11) NOT NULL,
  PRIMARY KEY (`ORDER_ID`,`PRODUCT_ID`),
  KEY `FKEY_PRODUCT_ID` (`PRODUCT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
CREATE TABLE IF NOT EXISTS `orders` (
  `ORDER_ID` int(11) NOT NULL AUTO_INCREMENT,
  `ORDER_BY` varchar(255) NOT NULL,
  `ADDRESS` varchar(255) NOT NULL,
  `PHONE_NUMBER` varchar(255) NOT NULL,
  `EMAIL` varchar(255) NOT NULL,
  `TIMESTAMP` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `COMMENTS` varchar(512) DEFAULT NULL,
  PRIMARY KEY (`ORDER_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `productitems`
--

DROP TABLE IF EXISTS `productitems`;
CREATE TABLE IF NOT EXISTS `productitems` (
  `PRODUCT_ID` int(11) NOT NULL,
  `INGREDIENT_ID` int(11) NOT NULL,
  `QUANTITY` int(11) NOT NULL,
  PRIMARY KEY (`PRODUCT_ID`,`INGREDIENT_ID`),
  KEY `FKEY_INGREDIENT_ID` (`INGREDIENT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
CREATE TABLE IF NOT EXISTS `products` (
  `PRODUCT_ID` int(11) NOT NULL AUTO_INCREMENT,
  `CONTAINER` varchar(255) NOT NULL DEFAULT 'Bowl',
  `CREATION_DATE` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `PRODUCT_NAME` varchar(255) NOT NULL,
  `CREATED_BY` varchar(255) NOT NULL DEFAULT 'anonymous',
  PRIMARY KEY (`PRODUCT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `orderitems`
--
ALTER TABLE `orderitems`
  ADD CONSTRAINT `FKEY_ORDER_ID` FOREIGN KEY (`ORDER_ID`) REFERENCES `orders` (`ORDER_ID`),
  ADD CONSTRAINT `FKEY_PRODUCT_ID` FOREIGN KEY (`PRODUCT_ID`) REFERENCES `products` (`PRODUCT_ID`);

--
-- Constraints for table `productitems`
--
ALTER TABLE `productitems`
  ADD CONSTRAINT `FKEY_INGREDIENT_ID` FOREIGN KEY (`INGREDIENT_ID`) REFERENCES `ingredients` (`INGREDIENT_ID`),
  ADD CONSTRAINT `FKEY_PRODUCT_ID_PRODUCTITEMS` FOREIGN KEY (`PRODUCT_ID`) REFERENCES `products` (`PRODUCT_ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
