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
-- Table structure for table `envanter`
--

DROP TABLE IF EXISTS `envanter`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `envanter` (
  `e_id` int(11) NOT NULL AUTO_INCREMENT,
  `kayit_tar` date DEFAULT '2009-05-07',
  `t_id` int(3) NOT NULL,
  `sis_no` varchar(42) DEFAULT NULL,
  `seri_no` varchar(255) DEFAULT NULL,
  `aciklama` text,
  `durum` varchar(45) DEFAULT NULL,
  `m_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`e_id`),
  UNIQUE KEY `sis_no` (`sis_no`),
  KEY `tip_no` (`t_id`),
  KEY `tip_no_2` (`t_id`),
  CONSTRAINT `envanter_fk` FOREIGN KEY (`t_id`) REFERENCES `tip` (`t_id`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `envanter`
--

LOCK TABLES `envanter` WRITE;
/*!40000 ALTER TABLE `envanter` DISABLE KEYS */;
INSERT INTO `envanter` VALUES (1,'2022-06-13',1,'PC-001','0002D101751D','',NULL,1),(2,'2022-06-13',2,'LT-001','0002D104B665','',NULL,2),(3,'2022-06-13',3,'PRT-001','0002D1027FC9','4 NOLU SALON',NULL,3),(13,'2022-09-03',3,'PR','0808a02b02ab43aa',NULL,'Uygun',2),(20,'2022-09-03',1,'PC2a310b841a9','9bb2819193a04838','okan test test','Uygun',1),(21,'2022-09-04',2,'Bilgisayarb9333a941b3','bb30110310a04012','Volkan Test','Uygun',3);
/*!40000 ALTER TABLE `envanter` ENABLE KEYS */;
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
