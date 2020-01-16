CREATE DATABASE `package` /*!40100 DEFAULT CHARACTER SET latin1 */;

CREATE TABLE `shipping` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `address_line` varchar(100) NOT NULL,
  `zip` varchar(45) NOT NULL,
  `country` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

CREATE TABLE `product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `product_name` varchar(45) NOT NULL,
  `product_price` int(11) NOT NULL,
  `product_category` varchar(45) NOT NULL,
  `shipping_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `ProductToShipping_idx` (`shipping_id`),
  CONSTRAINT `ProductToShipping` FOREIGN KEY (`shipping_id`) REFERENCES `shipping` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
