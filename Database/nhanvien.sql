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
-- Table structure for table `nhanvien`
--

DROP TABLE IF EXISTS `nhanvien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `nhanvien` (
  `MANV` varchar(11) NOT NULL,
  `TENNV` varchar(50) DEFAULT NULL,
  `CHUCVU` varchar(50) DEFAULT NULL,
  `LUONGNV` double DEFAULT NULL,
  `NGAYSINH` date DEFAULT NULL,
  `GIOITINH` char(3) DEFAULT NULL,
  `CHUTHICH` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`MANV`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nhanvien`
--

LOCK TABLES `nhanvien` WRITE;
/*!40000 ALTER TABLE `nhanvien` DISABLE KEYS */;
INSERT INTO `nhanvien` VALUES ('NV000000001','Nguyễn Thị Lan','QUAN LI',10000000,'1983-02-16','NỮ',''),('NV000000002','Nguyễn Thị B','NHANVIEN',5000000,'1995-06-15','NỮ',''),('NV000000004','Lê Văn Tài','NHANVIEN',4000000,'1996-07-25','NAM',''),('NV000000003','Nguyễn Văn A','NHANVIEN',5000000,'1995-02-13','NAM',''),('NV000000005','Lê Việt Hoàng','NHANVIEN',4000000,'1996-07-12','NAM',''),('NV000000006','La Văn Ba','NHANVIEN',6000000,'1994-04-08','NAM',''),('NV000000007','Hồ Thị Sáng','NHANVIEN',3000000,'1998-04-05','NỮ',''),('NV000000008','Hồ Thị Lành','NHANVIEN',3000000,'1995-04-07','NỮ',''),('NV000000009','Nguyễn Hạnh Nhi','NHANVIEN',6000000,'1995-09-07','NỮ',''),('NV000000010','Nguyễn Văn C','NHANVIEN',6000000,'1995-09-15','NAM','');
/*!40000 ALTER TABLE `nhanvien` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-05-01 18:08:55
