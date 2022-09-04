-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: envanter
-- ------------------------------------------------------
-- Server version	5.7.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `zimmet_history`
--

DROP TABLE IF EXISTS `zimmet_history`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `zimmet_history` (
  `zh_id` int(11) NOT NULL AUTO_INCREMENT,
  `z_id` int(11) DEFAULT NULL,
  `t_id` int(3) DEFAULT NULL,
  `sis_no` varchar(13) DEFAULT NULL,
  `p_id` varchar(255) DEFAULT NULL,
  `eposta` varchar(255) DEFAULT NULL,
  `p_id_zimmetleyen` varchar(255) DEFAULT NULL,
  `verilis_tarihi` date DEFAULT NULL,
  `teslim_tarihi` date DEFAULT NULL,
  `aciklama` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`zh_id`),
  KEY `sis_no` (`sis_no`,`t_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zimmet_history`
--

LOCK TABLES `zimmet_history` WRITE;
/*!40000 ALTER TABLE `zimmet_history` DISABLE KEYS */;
INSERT INTO `zimmet_history` VALUES (1,1,1,'PC-001','2','goksuz@envanter.com','1','2022-06-13','2022-06-14','');
/*!40000 ALTER TABLE `zimmet_history` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-09-04 11:11:53
