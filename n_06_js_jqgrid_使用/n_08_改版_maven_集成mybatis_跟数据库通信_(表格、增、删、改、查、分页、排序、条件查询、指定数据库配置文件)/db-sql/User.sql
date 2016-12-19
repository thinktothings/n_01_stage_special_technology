/*
SQLyog Ultimate v8.32 
MySQL - 5.5.53 : Database - tht
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`tht` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_bin */;

USE `tht`;

/*Table structure for table `User` */

DROP TABLE IF EXISTS `User`;

CREATE TABLE `User` (
  `userid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(100) COLLATE utf8_bin NOT NULL,
  `password` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `createDate` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `email` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `User` */

insert  into `User`(`userid`,`username`,`password`,`createDate`,`email`) values (12,'1','1','2016-11-03 22:34:39','1'),(13,'2','2','2016-11-03 22:34:45','2'),(14,'3','3','2016-11-03 22:34:51','3'),(15,'4','4','2016-11-03 22:34:57','4'),(16,'5','5','2016-11-03 22:35:04','5'),(17,'6','6','2016-11-03 22:35:18','6'),(18,'7','7','2016-11-03 22:35:24','7'),(19,'8','8','2016-11-03 22:35:29','8'),(20,'9','9','2016-11-03 22:35:34','9'),(21,'10','10','2016-11-03 22:35:40','10');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
