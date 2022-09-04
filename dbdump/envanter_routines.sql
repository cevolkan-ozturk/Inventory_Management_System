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
-- Temporary view structure for view `vw_zimmet`
--

DROP TABLE IF EXISTS `vw_zimmet`;
/*!50001 DROP VIEW IF EXISTS `vw_zimmet`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `vw_zimmet` AS SELECT 
 1 AS `z_id`,
 1 AS `e_id`,
 1 AS `k_id`,
 1 AS `verilisTarihi`,
 1 AS `aciklama`,
 1 AS `seriNo`,
 1 AS `marka`,
 1 AS `model`,
 1 AS `envanterAdi`,
 1 AS `genelTip`,
 1 AS `login_name`,
 1 AS `adi`,
 1 AS `soyadi`,
 1 AS `unvan`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `vw_envanter`
--

DROP TABLE IF EXISTS `vw_envanter`;
/*!50001 DROP VIEW IF EXISTS `vw_envanter`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `vw_envanter` AS SELECT 
 1 AS `inventoryId`,
 1 AS `kayitTarihi`,
 1 AS `sistemNo`,
 1 AS `tipId`,
 1 AS `seriNo`,
 1 AS `aciklama`,
 1 AS `marka`,
 1 AS `model`,
 1 AS `envanterAdi`,
 1 AS `genelTip`,
 1 AS `durum`*/;
SET character_set_client = @saved_cs_client;

--
-- Final view structure for view `vw_zimmet`
--

/*!50001 DROP VIEW IF EXISTS `vw_zimmet`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `vw_zimmet` AS select `z`.`z_id` AS `z_id`,`z`.`e_id` AS `e_id`,`z`.`k_id` AS `k_id`,date_format(`z`.`verilis_tarihi`,'%d-%m-%Y') AS `verilisTarihi`,`z`.`aciklama` AS `aciklama`,`e`.`seriNo` AS `seriNo`,`e`.`marka` AS `marka`,`e`.`model` AS `model`,`e`.`envanterAdi` AS `envanterAdi`,`e`.`genelTip` AS `genelTip`,`k`.`login_name` AS `login_name`,`k`.`adi` AS `adi`,`k`.`soyadi` AS `soyadi`,`k`.`unvan` AS `unvan` from ((`zimmet` `z` left join `vw_envanter` `e` on((`e`.`inventoryId` = `z`.`e_id`))) left join `kullanici` `k` on((`z`.`k_id` = `k`.`k_id`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `vw_envanter`
--

/*!50001 DROP VIEW IF EXISTS `vw_envanter`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `vw_envanter` AS select `e`.`e_id` AS `inventoryId`,date_format(`e`.`kayit_tar`,'%d-%m-%Y') AS `kayitTarihi`,`e`.`sis_no` AS `sistemNo`,`e`.`t_id` AS `tipId`,`e`.`seri_no` AS `seriNo`,`e`.`aciklama` AS `aciklama`,`m`.`marka` AS `marka`,`m`.`model` AS `model`,`t`.`envanter_adi` AS `envanterAdi`,`t`.`genel_tip` AS `genelTip`,`e`.`durum` AS `durum` from ((`envanter` `e` left join `markalar` `m` on((`m`.`m_id` = `e`.`m_id`))) left join `tip` `t` on((`t`.`t_id` = `e`.`t_id`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-09-04 11:11:54
