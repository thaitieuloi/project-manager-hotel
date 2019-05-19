-- MySQL dump 10.13  Distrib 8.0.16, for Win64 (x86_64)
--
-- Host: localhost    Database: ql_khachsan
-- ------------------------------------------------------
-- Server version	5.7.21

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `khachhang`
--

DROP TABLE IF EXISTS `khachhang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `khachhang` (
  `MAKH` varchar(11) NOT NULL,
  `TENKH` varchar(50) DEFAULT NULL,
  `CMND` varchar(20) DEFAULT NULL,
  `QUOCTICH` varchar(50) DEFAULT NULL,
  `GIOITINH` char(3) DEFAULT NULL,
  `TUOI` int(3) DEFAULT NULL,
  `SDT` varchar(20) DEFAULT NULL,
  `MAPHONG` varchar(11) NOT NULL,
  PRIMARY KEY (`MAKH`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `khachhang`
--

LOCK TABLES `khachhang` WRITE;
/*!40000 ALTER TABLE `khachhang` DISABLE KEYS */;
INSERT INTO `khachhang` VALUES ('KH000000001','Trần Văn Bốn','987564231','VIET NAM','NAM',25,'3356527890','PHONG000001'),('KH000000002','Nguyen Van A','125648955','VIETNAM','NAM',18,'3325614586','PHONG000001'),('KH000000003','Lê Thị Hoài','345464650','VIETNAM','NỮ',18,'9362527172','PHONG000007'),('KH000000004','Lê Văn Hoài','572849255','VIETNAM','NAM',19,'7937268152','PHONG000005'),('KH000000005','Lê Văn Khang','572849255','VIETNAM','NAM',20,'7937665463','PHONG000008'),('KH000000006','Lê Thị Thu','125648953','VIETNAM','NỮ',20,'0332569856','PHONG000006'),('KH000000007','Lê Trung Kiên','125645478','VIETNAM','NAM',25,'0332586521','PHONG000002'),('KH000000008','Trần Tấn Tài','253645452','VIETNAM','NAM',35,'3569856127','PHONG000004'),('KH000000009','Trần Tấn Lộc','253645268','VIETNAM','NAM',35,'0356985632','PHONG000004');
/*!40000 ALTER TABLE `khachhang` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-05-01 18:08:35