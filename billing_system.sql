-- MySQL dump 10.13  Distrib 5.5.50, for Win32 (x86)
--
-- Host: localhost    Database: billing_system
-- ------------------------------------------------------
-- Server version	5.5.50

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
-- Table structure for table `billing`
--

DROP TABLE IF EXISTS `billing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `billing` (
  `Bill_no` int(11) NOT NULL DEFAULT '0',
  `Cust_no` int(11) DEFAULT '0',
  `Customer_name` varchar(255) DEFAULT NULL,
  `Address` varchar(255) DEFAULT NULL,
  `bill_from` date DEFAULT NULL,
  `bill_to` date DEFAULT NULL,
  `bill_amt` varchar(100) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `billing`
--

LOCK TABLES `billing` WRITE;
/*!40000 ALTER TABLE `billing` DISABLE KEYS */;
INSERT INTO `billing` VALUES (1,3,'uttpal','kota','2019-10-11','2019-10-11',''),(2,3,'uttpal','kota','2019-10-11','2019-10-11',''),(3,3,'uttpal','kota','2019-10-11','2019-10-11',''),(4,3,'uttpal','kota','2019-10-11','2019-10-11',''),(5,3,'uttpal','kota','2019-10-11','2019-10-11',''),(6,5,'ARUN','KOTA','2019-10-01','2019-10-31',''),(7,2,'Bhaskar','kota','2019-10-01','2019-10-31',''),(8,2,'Bhaskar','kota','2019-10-01','2019-10-31',''),(9,2,'Bhaskar','kota','2019-10-01','2019-10-31',''),(10,2,'Bhaskar','kota','2019-10-11','2019-10-11','');
/*!40000 ALTER TABLE `billing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer_master`
--

DROP TABLE IF EXISTS `customer_master`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer_master` (
  `customer_no` varchar(100) NOT NULL,
  `customer_name` varchar(100) NOT NULL,
  `Customer_add1` varchar(255) DEFAULT NULL,
  `customer_add2` varchar(100) DEFAULT NULL,
  `Customer_add3` varchar(255) DEFAULT NULL,
  `Customer_cstno` varchar(255) DEFAULT NULL,
  `Customer_tinno` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`customer_name`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer_master`
--

LOCK TABLES `customer_master` WRITE;
/*!40000 ALTER TABLE `customer_master` DISABLE KEYS */;
INSERT INTO `customer_master` VALUES ('1','Aditya','raipur','ad123@rediffmail.com','9823214432','chhattisgarh','raipur'),('2','Bhaskar','kota','bha12@yahoo.com','9874442100','chhattisgarh','raipur'),('3','uttpal','kota','ut123@rediffmail.com','9874321000','chhattisgarh','raipur'),('4','VIGNESH','CUDDALORE','VG12@GMAIL.COM','9874321212','TAMIL NADU','CHENNAI'),('5','ARUN','KOTA','KK','789','HUKN','NKUN'),('6','MLSMF','NKU','NKU','4778','HUIH','NKUKN'),('7','BUYJB','NUKUNLM','BYIKN','BHJ,','NUKKU','VYYT'),('8','B HJ J HJBK JV','V JJ J LKN','BJLNKUKN','74789','VGJBJH','BKNK'),('9','B JNJKLN','VTIVB','BIUL','44789','BYJJ','BLKUN'),('10','VIKBUIN','VYUB,KUN','CRYVTUY','78','FYGU','YVK'),('11','XECRVTHY','XECRHVJTHY','4787','4789','GYUK','BJ,NU'),('12','','RFGDGDGDBDB,THRTHRTHH77,U744','GIY8G87G77G@TFYMV.COM','','','');
/*!40000 ALTER TABLE `customer_master` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `delievery`
--

DROP TABLE IF EXISTS `delievery`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `delievery` (
  `cust_no` int(11) NOT NULL DEFAULT '0',
  `cust_name` varchar(255) DEFAULT NULL,
  `contact` varchar(255) DEFAULT NULL,
  `curr_date` date DEFAULT NULL,
  `item` varchar(255) DEFAULT NULL,
  `quantity` float DEFAULT NULL,
  `total` float DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `delievery`
--

LOCK TABLES `delievery` WRITE;
/*!40000 ALTER TABLE `delievery` DISABLE KEYS */;
INSERT INTO `delievery` VALUES (3,'uttpal','9874321000','2019-10-11','buffalo milk',3,195),(3,'uttpal','9874321000','2019-10-11','cow milk',3,165),(3,'uttpal','9874321000','2019-10-11','paneer',3,960),(3,'uttpal','9874321000','2019-10-11','paneer',3,960),(2,'Bhaskar','9874442100','2019-10-11','paneer',2,640),(5,'ARUN','789','2019-10-11','cow milk',3,165),(2,'Bhaskar','9874442100','2019-10-11','cow milk',3.5,192.5),(2,'Bhaskar','9874442100','2019-10-11','buffalo milk',2,130),(5,'ARUN','789','2019-10-11','paneer',0.5,160),(5,'ARUN','789','2019-10-11','paneer',0.5,160);
/*!40000 ALTER TABLE `delievery` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `item_master`
--

DROP TABLE IF EXISTS `item_master`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `item_master` (
  `Item_no` int(11) NOT NULL,
  `Item_name` varchar(255) NOT NULL DEFAULT '',
  `Item_Make` varchar(255) DEFAULT NULL,
  `Item_Rate` int(11) NOT NULL,
  `Item_Unit` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Item_name`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item_master`
--

LOCK TABLES `item_master` WRITE;
/*!40000 ALTER TABLE `item_master` DISABLE KEYS */;
INSERT INTO `item_master` VALUES (1,'cow milk','cow',55,'liter'),(2,'buffalo milk','buffalo',65,'liter'),(3,'paneer','buffalo',320,'liter');
/*!40000 ALTER TABLE `item_master` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `login` (
  `Username` varchar(255) DEFAULT NULL,
  `Password` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES ('X','X');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `temp`
--

DROP TABLE IF EXISTS `temp`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `temp` (
  `cust_no` int(11) DEFAULT NULL,
  `curr_date` date DEFAULT NULL,
  `item` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `temp`
--

LOCK TABLES `temp` WRITE;
/*!40000 ALTER TABLE `temp` DISABLE KEYS */;
INSERT INTO `temp` VALUES (4,'2019-10-07','Paneer'),(4,'2019-10-02','sweets'),(4,'2019-10-02','Paneer'),(10,'2019-10-03','milk'),(3,'2019-10-01','milk'),(10,'2019-10-03','milk'),(3,'2019-10-11','cow milk'),(3,'2019-10-11','buffalo milk'),(3,'2019-10-11','paneer'),(3,'2019-10-11','paneer'),(3,'2019-10-11','paneer'),(3,'2019-10-11','paneer'),(5,'2019-10-11','paneer'),(5,'2019-10-11','paneer'),(2,'2019-10-11','buffalo milk'),(5,'2019-10-11','paneer'),(5,'2019-10-11','paneer');
/*!40000 ALTER TABLE `temp` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-10-11 16:59:38
