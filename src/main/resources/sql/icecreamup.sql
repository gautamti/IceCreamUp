-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Nov 19, 2019 at 07:33 PM
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

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(3);

-- --------------------------------------------------------

--
-- Table structure for table `ingredients`
--

DROP TABLE IF EXISTS `ingredients`;
CREATE TABLE IF NOT EXISTS `ingredients` (
  `ingredient_id` int(11) NOT NULL AUTO_INCREMENT,
  `ingredient_name` varchar(255) NOT NULL,
  `available` tinyint(1) NOT NULL,
  `price` double(10,2) NOT NULL,
  PRIMARY KEY (`ingredient_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `ingredients`
--

INSERT INTO `ingredients` (`ingredient_id`, `ingredient_name`, `available`, `price`) VALUES
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
  `order_id` int(11) NOT NULL,
  `product_id` int(11) NOT NULL,
  `quantity` int(11) NOT NULL,
  PRIMARY KEY (`order_id`,`product_id`),
  KEY `FKEY_PRODUCT_ID` (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
CREATE TABLE IF NOT EXISTS `orders` (
  `order_id` int(11) NOT NULL AUTO_INCREMENT,
  `order_by` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL,
  `phone_number` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `timestamp` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `comments` varchar(512) DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `productitems`
--

DROP TABLE IF EXISTS `productitems`;
CREATE TABLE IF NOT EXISTS `productitems` (
  `product_id` int(11) NOT NULL,
  `ingredient_id` int(11) NOT NULL,
  `quantity` int(11) NOT NULL,
  PRIMARY KEY (`product_id`,`ingredient_id`),
  KEY `FKEY_INGREDIENT_ID` (`ingredient_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
CREATE TABLE IF NOT EXISTS `products` (
  `product_id` int(11) NOT NULL AUTO_INCREMENT,
  `container` varchar(255) NOT NULL DEFAULT 'Bowl',
  `creation_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `product_name` varchar(255) NOT NULL,
  `created_by` varchar(255) NOT NULL DEFAULT 'anonymous',
  `order_count` int(11) DEFAULT '0',
  PRIMARY KEY (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `orderitems`
--
ALTER TABLE `orderitems`
  ADD CONSTRAINT `FKEY_ORDER_ID` FOREIGN KEY (`order_id`) REFERENCES `orders` (`order_id`),
  ADD CONSTRAINT `FKEY_PRODUCT_ID` FOREIGN KEY (`product_id`) REFERENCES `products` (`product_id`);

--
-- Constraints for table `productitems`
--
ALTER TABLE `productitems`
  ADD CONSTRAINT `FKEY_INGREDIENT_ID` FOREIGN KEY (`ingredient_id`) REFERENCES `ingredients` (`ingredient_id`),
  ADD CONSTRAINT `FKEY_PRODUCT_ID_PRODUCTITEMS` FOREIGN KEY (`product_id`) REFERENCES `products` (`product_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
