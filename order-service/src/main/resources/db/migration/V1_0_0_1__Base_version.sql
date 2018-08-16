SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

CREATE SCHEMA IF NOT EXISTS `orderdb` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;

USE `orderdb`;

CREATE TABLE `orders` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `order_id` varchar(20) NOT NULL,
  `order_status` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `order_sku` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `payment_id` bigint(20) NOT NULL,
  `order_id` bigint(20) NOT NULL,
  `amount` decimal(10,2) NOT NULL,
  `currency` varchar(64) NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY fk_order( `order_id`)
  REFERENCES `order`(`id`)
  ON UPDATE CASCADE
  ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `order_payment` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT  PRIMARY KEY,
  `order_id` bigint(20) NOT NULL,
  `product_id` bigint(20) NOT NULL,
  `price` decimal(10,2) NOT NULL,
  `currency` varchar(64) NOT NULL,
   FOREIGN KEY fk_order( `order_id`)
   REFERENCES `order`(`id`)
   ON UPDATE CASCADE
   ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;