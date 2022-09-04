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
-- Table structure for table `zimmet`
--

DROP TABLE IF EXISTS `zimmet`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `zimmet` (
  `e_id` int(11) DEFAULT NULL,
  `k_id` int(11) DEFAULT NULL,
  `eposta` varchar(255) DEFAULT NULL,
  `p_id_zimmetleyen` int(11) DEFAULT NULL,
  `verilis_tarihi` date DEFAULT NULL,
  `aciklama` varchar(255) DEFAULT NULL,
  `z_id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`z_id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zimmet`
--

LOCK TABLES `zimmet` WRITE;
/*!40000 ALTER TABLE `zimmet` DISABLE KEYS */;
INSERT INTO `zimmet` VALUES (1,6,NULL,NULL,'2022-09-03','ajshdja ',1),(1,1,NULL,NULL,'2022-09-03','',9),(1,1,NULL,NULL,'2022-09-03','',10),(1,1,NULL,NULL,'2022-09-03','',11),(1,1,NULL,NULL,'2022-09-03','sdasd',17),(13,3,NULL,NULL,'2022-09-03','okan test',20),(13,3,NULL,NULL,'2022-09-03','okan test',21),(2,5,NULL,NULL,'2022-09-04','Kulakl?k giri?i ar?zal?',22),(2,5,NULL,NULL,'2022-09-04','Kulakl?k giri?i ar?zal?',23),(21,2,NULL,NULL,'2022-09-04','?yi günlerde kullan',24);
/*!40000 ALTER TABLE `zimmet` ENABLE KEYS */;
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
