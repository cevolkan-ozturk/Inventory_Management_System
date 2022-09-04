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
-- Table structure for table `kullanici`
--

DROP TABLE IF EXISTS `kullanici`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `kullanici` (
  `k_id` int(11) NOT NULL AUTO_INCREMENT,
  `login_name` varchar(255) DEFAULT NULL,
  `parola` varchar(255) DEFAULT NULL,
  `Tc_Kimlik_No` varchar(11) DEFAULT NULL,
  `Sicil_No` int(11) DEFAULT NULL,
  `adi` varchar(155) NOT NULL,
  `soyadi` varchar(255) NOT NULL,
  `eposta` varchar(255) NOT NULL,
  `unvan` varchar(255) DEFAULT NULL,
  `birim` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`k_id`),
  UNIQUE KEY `k_id` (`k_id`),
  KEY `adi` (`adi`,`soyadi`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kullanici`
--

LOCK TABLES `kullanici` WRITE;
/*!40000 ALTER TABLE `kullanici` DISABLE KEYS */;
INSERT INTO `kullanici` VALUES (1,'admin','1234','00000000000',250,'System','Administrator','admin@envanter.com','SA','IT'),(2,'goksuz','1234','11111111111',251,'Gonca','Öksüz','goksuz@envanter.com','Memur','Strateji Ve Planlama'),(3,'vozturk','1234','22222222222',252,'Volkan','Öztürk','vozturk@envanter.com','Memur','Bilgi İşlem'),(5,'Özgür61','12345','42691717514',287,'Özgür','Kaya','Ozgur.kaya@gmail.com','Hesap Uzman?','Lojistik Birimi');
/*!40000 ALTER TABLE `kullanici` ENABLE KEYS */;
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
