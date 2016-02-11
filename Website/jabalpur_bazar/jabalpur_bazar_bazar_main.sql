CREATE DATABASE  IF NOT EXISTS `jabalpur_bazar` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `jabalpur_bazar`;
-- MySQL dump 10.13  Distrib 5.5.16, for Win32 (x86)
--
-- Host: localhost    Database: jabalpur_bazar
-- ------------------------------------------------------
-- Server version	5.5.29-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `bazar_main`
--

DROP TABLE IF EXISTS `bazar_main`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bazar_main` (
  `u_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) NOT NULL,
  `user_password` varchar(255) NOT NULL,
  `business_name` varchar(255) NOT NULL,
  `owner_name` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL,
  `phone_no` bigint(20) DEFAULT NULL,
  `mobile_no` bigint(20) DEFAULT NULL,
  `email_id` varchar(255) NOT NULL,
  `offer_available` varchar(255) DEFAULT NULL,
  `define_offer` text,
  `about_business` text,
  `home_services` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`u_id`),
  UNIQUE KEY `user_name` (`user_name`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bazar_main`
--

LOCK TABLES `bazar_main` WRITE;
/*!40000 ALTER TABLE `bazar_main` DISABLE KEYS */;
INSERT INTO `bazar_main` VALUES (1,'jdfkln','kkljnknm','knknknkn','nknkn','knknkn',99999,9999,'nkjnjn','No','njnjn','jnjnjn','Yes'),(2,'nknfgkjn','jbjkbnj','jnjnjn','njnjn','njnjn',9999,0,'jjbjbjb','Yes','jbjb','bjbj','Yes'),(3,'shashank','abcd','ajajaj','jdcnjkn','ndjdn',9999,0,'chbhxb','Yes','bcjb','b jb vj','Yes'),(4,'sdfsd','fvf','sdfvsv','svdfv','sdv',999,0,'nsdjcn','Yes','njnjn','njnjun','Yes'),(5,'papu','abcd','study','anand','ranjhi',909090,989898,'njmncvjn','No','','bdhdbb','Yes');
/*!40000 ALTER TABLE `bazar_main` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2013-03-29 21:28:03
