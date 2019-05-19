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
-- Table structure for table `dichvu`
--

DROP TABLE IF EXISTS `dichvu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `dichvu` (
  `MADV` varchar(11) NOT NULL,
  `TENDV` varchar(50) NOT NULL,
  `GIADV` double NOT NULL,
  PRIMARY KEY (`MADV`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dichvu`
--

LOCK TABLES `dichvu` WRITE;
/*!40000 ALTER TABLE `dichvu` DISABLE KEYS */;
INSERT INTO `dichvu` (`MADV`, `TENDV`, `GIADV`) VALUES ('DV000000001','Cơm',10000),('DV000000002','Coffee Milk',20000),('DV000000003','TEA',5000),('DV000000004','Bánh',5000),('DV000000005','Nước suối',3000),('DV000000006','Bia',20000),('DV000000007','Coca cola',30000),('DV000000008','pepsi',35000),('DV000000009','Sinh tố',35000);
/*!40000 ALTER TABLE `dichvu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hoadon`
--

DROP TABLE IF EXISTS `hoadon`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `hoadon` (
  `MAHD` varchar(11) NOT NULL,
  `MANV` varchar(11) DEFAULT NULL,
  `MAPHONG` varchar(11) DEFAULT NULL,
  `NGAY` date DEFAULT NULL,
  `GIAHD` double DEFAULT NULL,
  PRIMARY KEY (`MAHD`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hoadon`
--

LOCK TABLES `hoadon` WRITE;
/*!40000 ALTER TABLE `hoadon` DISABLE KEYS */;
INSERT INTO `hoadon` (`MAHD`, `MANV`, `MAPHONG`, `NGAY`, `GIAHD`) VALUES ('HD000000001','NV000000001','PHONG000001','2019-02-14',300000),('HD000000003','NV000000001','PHONG000001','2019-04-23',23355),('HD000000005','NV000000001','PHONG000001','2019-04-25',200000),('HD000000004','NV000000001','PHONG000001','2019-02-14',300000);
/*!40000 ALTER TABLE `hoadon` ENABLE KEYS */;
UNLOCK TABLES;

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
INSERT INTO `khachhang` (`MAKH`, `TENKH`, `CMND`, `QUOCTICH`, `GIOITINH`, `TUOI`, `SDT`, `MAPHONG`) VALUES ('KH000000001','Trần Văn Bốn','987564231','VIET NAM','NAM',25,'3356527890','PHONG000001'),('KH000000002','Nguyen Van A','125648955','VIETNAM','NAM',18,'3325614586','PHONG000001'),('KH000000003','Lê Thị Hoài','345464650','VIETNAM','NỮ',18,'9362527172','PHONG000007'),('KH000000004','Lê Văn Hoài','572849255','VIETNAM','NAM',19,'7937268152','PHONG000005'),('KH000000005','Lê Văn Khang','572849255','VIETNAM','NAM',20,'7937665463','PHONG000008'),('KH000000006','Lê Thị Thu','125648953','VIETNAM','NỮ',20,'0332569856','PHONG000006'),('KH000000007','Lê Trung Kiên','125645478','VIETNAM','NAM',25,'0332586521','PHONG000002'),('KH000000008','Trần Tấn Tài','253645452','VIETNAM','NAM',35,'3569856127','PHONG000004'),('KH000000009','Trần Tấn Lộc','253645268','VIETNAM','NAM',35,'0356985632','PHONG000004');
/*!40000 ALTER TABLE `khachhang` ENABLE KEYS */;
UNLOCK TABLES;

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
INSERT INTO `nhanvien` (`MANV`, `TENNV`, `CHUCVU`, `LUONGNV`, `NGAYSINH`, `GIOITINH`, `CHUTHICH`) VALUES ('NV000000001','Nguyễn Thị Lan','QUAN LI',9000000,'1983-02-16','NỮ',''),('NV000000002','Nguyễn Thị B','NHANVIEN',5000000,'1995-06-15','NỮ',''),('NV000000004','Lê Văn Tài','NHANVIEN',4000000,'1996-07-25','NAM',''),('NV000000003','Nguyễn Văn A','NHANVIEN',5000000,'1995-02-13','NAM',''),('NV000000005','Lê Việt Hoàng','NHANVIEN',4000000,'1996-07-12','NAM',''),('NV000000006','La Văn Ba','NHANVIEN',6000000,'1994-04-08','NAM',''),('NV000000007','Hồ Thị Sáng','NHANVIEN',3000000,'1998-04-05','NỮ',''),('NV000000008','Hồ Thị Lành','NHANVIEN',3000000,'1995-04-07','NỮ',''),('NV000000009','Nguyễn Hạnh Nhi','NHANVIEN',6000000,'1995-09-07','NỮ',''),('NV000000010','Nguyễn Văn C','NHANVIEN',6000000,'1995-09-15','NAM','');
/*!40000 ALTER TABLE `nhanvien` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `phong`
--

DROP TABLE IF EXISTS `phong`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `phong` (
  `MAPHONG` varchar(11) NOT NULL,
  `TENPHONG` varchar(50) DEFAULT NULL,
  `LOAIPHONG` varchar(20) DEFAULT NULL,
  `GIAPHONG` double DEFAULT NULL,
  `CHUTHICH` varchar(50) DEFAULT NULL,
  `TINHTRANG` varchar(50) DEFAULT NULL,
  `MANV` varchar(11) DEFAULT NULL,
  `MADV` varchar(11) DEFAULT NULL,
  PRIMARY KEY (`MAPHONG`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `phong`
--

LOCK TABLES `phong` WRITE;
/*!40000 ALTER TABLE `phong` DISABLE KEYS */;
INSERT INTO `phong` (`MAPHONG`, `TENPHONG`, `LOAIPHONG`, `GIAPHONG`, `CHUTHICH`, `TINHTRANG`, `MANV`, `MADV`) VALUES ('PHONG000001','PHONG A','VIP',2000000,'','Trống','NV000000001','DV000000001'),('PHONG000002','PHONG B','THƯỜNG',300000,'','Trống','NV000000002','DV000000002'),('PHONG000003','PHONG C','THƯỜNG',300000,'','Đã Thuê','NV000000004','DV000000001'),('PHONG000004','PHONG D','THƯỜNG',300000,'','Trống','NV000000003','DV000000004'),('PHONG000005','PHONG E','THƯỜNG',300000,'','Trống','NV000000002','DV000000002'),('PHONG000006','PHONG F','THƯỜNG',500000,'Dịch vụ đầy đủ','Trống','NV000000009','DV000000003'),('PHONG000007','PHONG G','THƯỜNG',500000,'Dịch vụ đầy đủ','Trống','NV000000007','DV000000002'),('PHONG000008','PHONG H','VIP',4000000,'Dịch vụ đầy đủ','Trống','NV000000001','DV000000003'),('PHONG000009','PHONG I','VIP',4000000,'Dịch vụ đầy đủ','Đã Thuê','NV000000003','DV000000005'),('PHONG000010','PHONG K','THƯỜNG',500000,'Dịch vụ đầy đủ','Đã Thuê','NV000000005','DV000000003'),('PHONG000011','PHONG K','THƯỜNG',500000,'Dịch vụ đầy đủ','Đã Thuê','NV000000005','DV000000003');
/*!40000 ALTER TABLE `phong` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `users` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `USERNAME` varchar(45) DEFAULT NULL,
  `PASSWORD` varchar(45) DEFAULT NULL,
  `ROLE_ID` varchar(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `id_UNIQUE` (`ID`),
  UNIQUE KEY `USERNAME_UNIQUE` (`USERNAME`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` (`ID`, `USERNAME`, `PASSWORD`, `ROLE_ID`) VALUES (1,'admin','e10adc3949ba59abbe56e057f20f883e','0'),(2,'normal','e10adc3949ba59abbe56e057f20f883e','1'),(3,'normal1','14e1b600b1fd579f47433b88e8d85291','1'),(5,'normal3','14e1b600b1fd579f47433b88e8d85291','1'),(6,'normal2','d9b1d7db4cd6e70935368a1efb10e377','1');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-05-07  9:13:44
