-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: localhost    Database: university_dormitory
-- ------------------------------------------------------
-- Server version	8.0.27

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
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admin` (
  `id` int NOT NULL,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES (1,'admin','admin'),(2,'pcodep','123');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `int_employees`
--

DROP TABLE IF EXISTS `int_employees`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `int_employees` (
  `id` int NOT NULL AUTO_INCREMENT,
  `employee_name` varchar(45) DEFAULT NULL,
  `father` varchar(45) DEFAULT NULL,
  `mother` varchar(45) DEFAULT NULL,
  `phone` varchar(15) NOT NULL,
  `date_of_birth` varchar(45) DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `designation` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `present_address` varchar(250) DEFAULT NULL,
  `permanent_address` varchar(250) DEFAULT NULL,
  `status` varchar(15) DEFAULT NULL,
  `passport` varchar(11) DEFAULT NULL,
  `country` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`phone`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `int_employees`
--

LOCK TABLES `int_employees` WRITE;
/*!40000 ALTER TABLE `int_employees` DISABLE KEYS */;
INSERT INTO `int_employees` VALUES (2,'rr','rr','rr','101010','2009-02-17','male','Accounting','e@gmail.com','ff','ff','Not Working','FG00000','CH'),(6,'Hasan','Karim','Mina','12345678988','1993-04-16','male','Accounting','hasan@gmail.com','BD','BD','Working','hh0000000','Bangladesh'),(3,'Emma','David','zoe','202020','1993-03-18','female','Maintenance','emma@gmail.com','ff lane','rr lane','Working','gg1000000','dd'),(5,'Molly','Robart','Helen','7474','1993-03-18','female','Chef','molly@gmail.com','home','home','Working','ZZ000000','US'),(4,'Alice','Robert','Victoria','965225552455','1996-02-15','female','Housekeeping','alice@gamil.com','home','home','Working','XX875522','London');
/*!40000 ALTER TABLE `int_employees` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `int_employees_salary`
--

DROP TABLE IF EXISTS `int_employees_salary`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `int_employees_salary` (
  `id` int NOT NULL AUTO_INCREMENT,
  `phone` varchar(15) DEFAULT NULL,
  `salary` varchar(20) DEFAULT NULL,
  `payment_month` varchar(45) DEFAULT NULL,
  `payment_date` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `phone` (`phone`),
  CONSTRAINT `int_employees_salary_ibfk_1` FOREIGN KEY (`phone`) REFERENCES `int_employees` (`phone`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `int_employees_salary`
--

LOCK TABLES `int_employees_salary` WRITE;
/*!40000 ALTER TABLE `int_employees_salary` DISABLE KEYS */;
INSERT INTO `int_employees_salary` VALUES (1,'101010','$650','January-2022','Friday, 07/01-2022'),(3,'101010','$650','February-2022','Wednesday, 09/02-2022'),(4,'12345678988','$650','March-2022','Friday, 01/04-2022'),(5,'202020','$700','March-2022','Friday, 01/04-2022'),(6,'965225552455','$500','March-2022','Friday, 01/04-2022'),(7,'7474','$600','February-2022','Thursday, 01/03-2022'),(8,'7474','$600','March-2022','Friday, 01/04-2022');
/*!40000 ALTER TABLE `int_employees_salary` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `int_students`
--

DROP TABLE IF EXISTS `int_students`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `int_students` (
  `id` int NOT NULL AUTO_INCREMENT,
  `student_name` varchar(45) DEFAULT NULL,
  `father_name` varchar(45) DEFAULT NULL,
  `mother_name` varchar(45) DEFAULT NULL,
  `date_of_birth` date DEFAULT NULL,
  `gender` varchar(7) DEFAULT NULL,
  `email` varchar(25) DEFAULT NULL,
  `phone` varchar(15) NOT NULL,
  `degree_programs` varchar(20) DEFAULT NULL,
  `university` varchar(100) DEFAULT NULL,
  `university_id` varchar(20) DEFAULT NULL,
  `room_number` varchar(10) DEFAULT NULL,
  `living_status` varchar(10) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  `passport` varchar(12) DEFAULT NULL,
  `country` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`phone`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  UNIQUE KEY `phone_UNIQUE` (`phone`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `int_students`
--

LOCK TABLES `int_students` WRITE;
/*!40000 ALTER TABLE `int_students` DISABLE KEYS */;
INSERT INTO `int_students` VALUES (9,'Polash','father','mother','1999-09-22','male','polash@gmail.com','1010101010100','Master Programs','PU','4545455454','1004','Living','1avb lane ','BB000000','Bangladesh'),(15,'tttttttt','ggg','gggggggg','2016-04-14','male','fdf@gmail.com','14544','Bachelor Programs','yu','4444444','1014','Living','fsf sfsfsd','gg4444','bb'),(6,'Julia','David','Zoe','1995-04-12','female','julia@gmail.com','25412563256','Bachelor Programs','YU','563256985','1021','Living','dd lane','YY010101','USA'),(7,'Oliver','Samuel','Molly','2000-12-12','male','oliver10@gmail.com','41414125365','Bachelor Programs','JU','325784515550','1017','Living','jj44 lane','kk2000000','USA'),(5,'Robert','Mark','Sarah','1987-05-29','male','robert@gmail.com','78569865982','Bachelor Programs','SUT','85698569856','1015','Living','f20 avenue','AA000000','England'),(4,'Caroline','John','Lillian','1995-02-17','female','caroline@gmail.com','7878','Master Programs','YU','12589548','','Leaved','Home','HG02152','Canada'),(8,'Wang Hong','Tian','Wang xinxin','1984-08-10','female','hong@gmail.com','865525525555','Bachelor Programs','UU','45455454545','1030','Living','Shandong, China','hh000000','China'),(2,'jack','ddd','ddd','1997-01-24','male','d@gmail.com','8888','Bachelor Programs','HU','44444488888','1002','Living','home','by2222200','yyy');
/*!40000 ALTER TABLE `int_students` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `int_students_fees`
--

DROP TABLE IF EXISTS `int_students_fees`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `int_students_fees` (
  `id` int NOT NULL AUTO_INCREMENT,
  `phone` varchar(15) DEFAULT NULL,
  `payment_month` varchar(45) DEFAULT NULL,
  `fees` varchar(10) DEFAULT NULL,
  `payment_date` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `phone` (`phone`),
  CONSTRAINT `int_students_fees_ibfk_1` FOREIGN KEY (`phone`) REFERENCES `int_students` (`phone`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `int_students_fees`
--

LOCK TABLES `int_students_fees` WRITE;
/*!40000 ALTER TABLE `int_students_fees` DISABLE KEYS */;
INSERT INTO `int_students_fees` VALUES (1,'8888','January-2022','$200','Monday, 31/01-2022'),(3,'8888','February-2022','$200','Wednesday, 09/02-2022'),(4,'41414125365','March-2022','$200','Friday, 01/04-2022'),(5,'865525525555','March-2022','$200','Friday, 01/04-2022');
/*!40000 ALTER TABLE `int_students_fees` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `local_employees`
--

DROP TABLE IF EXISTS `local_employees`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `local_employees` (
  `id` int NOT NULL AUTO_INCREMENT,
  `employee_name` varchar(45) DEFAULT NULL,
  `father` varchar(45) DEFAULT NULL,
  `mother` varchar(45) DEFAULT NULL,
  `phone` varchar(15) NOT NULL,
  `date_of_birth` varchar(45) DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `designation` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `present_address` varchar(250) DEFAULT NULL,
  `permanent_address` varchar(250) DEFAULT NULL,
  `status` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`phone`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `local_employees`
--

LOCK TABLES `local_employees` WRITE;
/*!40000 ALTER TABLE `local_employees` DISABLE KEYS */;
INSERT INTO `local_employees` VALUES (5,'Jack','ff','dd','101010','2010-02-08','male','Maintenance','f@gmail.com','home','home','Not Working'),(8,'Daniel','Simon','Ruby','1254632255','1992-09-16','male','Chef','daniel@gmail.com','abc lane','abc lane','Working'),(7,'David','Jhon','Merry','4141','1990-03-16','male','Housekeeping','david@gmail.com','home','London','Working'),(4,'Chirstopher','John','lucy','4545','1995-02-16','male','Accounting','ch@gmail.com','home','home','Not Working'),(11,'Julie','William','Emily','78787878','1994-04-22','female','Accounting','julie@gmail.com','bd lane','hh lane','Working'),(10,'Helen','Peter','Mary','85585555555','1992-04-03','female','Housekeeping','helen@gmail.com','b/12 house lane','b/12 house lane','Working'),(9,'Thomas','Nicholas','Scarlett','8569523555','1982-04-20','male','Maintenance','thomas@gmail.com','12 avenue','12 avenue','Working');
/*!40000 ALTER TABLE `local_employees` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `local_employees_salary`
--

DROP TABLE IF EXISTS `local_employees_salary`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `local_employees_salary` (
  `id` int NOT NULL AUTO_INCREMENT,
  `phone` varchar(15) DEFAULT NULL,
  `salary` varchar(20) DEFAULT NULL,
  `payment_month` varchar(45) DEFAULT NULL,
  `payment_date` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `phone` (`phone`),
  CONSTRAINT `local_employees_salary_ibfk_1` FOREIGN KEY (`phone`) REFERENCES `local_employees` (`phone`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `local_employees_salary`
--

LOCK TABLES `local_employees_salary` WRITE;
/*!40000 ALTER TABLE `local_employees_salary` DISABLE KEYS */;
INSERT INTO `local_employees_salary` VALUES (1,'4545','$650','January-2022','Friday, 07/01-2022'),(4,'4545','$650','February-2022','Wednesday, 09/02-2022'),(5,'4141','$500','March-2022','Friday, 01/04-2022'),(6,'1254632255','$600','March-2022','Friday, 01/04-2022'),(7,'85585555555','$500','March-2022','Friday, 01/04-2022'),(8,'8569523555','$700','February-2022','Wednesday, 09/02-2022'),(9,'78787878','$650','March-2022','Friday, 01/04-2022');
/*!40000 ALTER TABLE `local_employees_salary` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `local_students`
--

DROP TABLE IF EXISTS `local_students`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `local_students` (
  `id` int NOT NULL AUTO_INCREMENT,
  `student_name` varchar(45) DEFAULT NULL,
  `father_name` varchar(45) DEFAULT NULL,
  `mother_name` varchar(45) DEFAULT NULL,
  `date_of_birth` date DEFAULT NULL,
  `gender` varchar(7) DEFAULT NULL,
  `email` varchar(25) DEFAULT NULL,
  `phone` varchar(15) NOT NULL,
  `degree_programs` varchar(20) DEFAULT NULL,
  `university` varchar(100) DEFAULT NULL,
  `university_id` varchar(20) DEFAULT NULL,
  `room_number` varchar(10) DEFAULT NULL,
  `living_status` varchar(10) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`phone`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  UNIQUE KEY `phone_UNIQUE` (`phone`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `local_students`
--

LOCK TABLES `local_students` WRITE;
/*!40000 ALTER TABLE `local_students` DISABLE KEYS */;
INSERT INTO `local_students` VALUES (13,'William','Oscar','Madeline','1988-02-10','male','william@gmail.com','101033333','Doctoral Programs','EU','858583333','1006','Living','uu road'),(1,'Simon','Jack','Lucy','1998-01-09','male','s@gmail.com','111','Bachelor Programs','UU','22222','','Leaved','home l'),(2,'dd','dd','dd','1995-01-20','male','d@gmail.com','1111','Master Programs','DU','222','','Leaved','home'),(10,'Jonathon','Peter','Hannah','1986-09-11','male','jonathon@gmail.com','12546987532','Doctoral Programs','TU','885858566666','1020','Living','abcd lane'),(8,'mike','david','jesika','1995-03-16','male','mike@gmail.com','202020','Master Programs','TU','2565525566','1012','Living','maybe home '),(3,'ddd','ee','ee','2015-01-08','male','f@gmail.com','222','Bachelor Programs','dd','111','1010','Living','ss'),(7,'David','Kevin','Hannah ','1999-02-11','male','David@gmail.com','252525','Bachelor Programs','TU','25623145254','1003','Living','home'),(9,'Sophie','Charkles','jessica','1984-04-18','female','sophie@gmail.com','25469852458','Doctoral Programs','GU','565656565656','1015','Living','abcd avenue'),(24,'aaaaa','dddddddd','mmmmmm','2001-04-19','female','fdfdfdfdf00@gmail.com','3030','Bachelor Programs','gu','44444444','1009','Living','fghfghfg'),(25,'sssss','dddddddd','dddddddd','2022-04-05','female','sds@gmail.com','303030','Bachelor Programs','jh','444','1013','Living','hgghg'),(11,'Diana','Pual','Sarah','2000-04-13','female','diana@gmil.com','5252525555','Bachelor Programs','TTU','525255252','1008','Living','uu avenue'),(12,'Thomas','Timothy','Maggie','1996-04-17','male','tho@gmail.com','85858585858','Master Programs','OU','DD1023333','1005','Living','ss lane');
/*!40000 ALTER TABLE `local_students` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `local_students_fees`
--

DROP TABLE IF EXISTS `local_students_fees`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `local_students_fees` (
  `id` int NOT NULL AUTO_INCREMENT,
  `phone` varchar(15) DEFAULT NULL,
  `payment_month` varchar(45) DEFAULT NULL,
  `fees` varchar(10) DEFAULT NULL,
  `payment_date` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `phone` (`phone`),
  CONSTRAINT `local_students_fees_ibfk_1` FOREIGN KEY (`phone`) REFERENCES `local_students` (`phone`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `local_students_fees`
--

LOCK TABLES `local_students_fees` WRITE;
/*!40000 ALTER TABLE `local_students_fees` DISABLE KEYS */;
INSERT INTO `local_students_fees` VALUES (1,'12546987532','January-2022','$300','Monday, 31/01-2022'),(3,'5252525555','February-2022','$200','Friday, 04/02-2022'),(5,'12546987532','February-2022','$300','Friday, 11/03-2022'),(6,'5252525555','March-2022','$200','Friday, 01/04-2022'),(7,'85858585858','February-2022','$250','Friday, 11/03-2022'),(8,'12546987532','March-2022','$300','Friday, 01/04-2022');
/*!40000 ALTER TABLE `local_students_fees` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `room`
--

DROP TABLE IF EXISTS `room`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `room` (
  `room_id` int NOT NULL AUTO_INCREMENT,
  `room_number` varchar(10) DEFAULT NULL,
  `active` varchar(45) DEFAULT NULL,
  `room_status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`room_id`),
  UNIQUE KEY `room_number_UNIQUE` (`room_number`)
) ENGINE=InnoDB AUTO_INCREMENT=60 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `room`
--

LOCK TABLES `room` WRITE;
/*!40000 ALTER TABLE `room` DISABLE KEYS */;
INSERT INTO `room` VALUES (23,'1011','NO','Not Booked'),(25,'1012','YES','Booked'),(26,'1015','YES','Booked'),(27,'1020','YES','Booked'),(28,'1021','YES','Booked'),(29,'1010','YES','Booked'),(31,'1017','YES','Booked'),(32,'1030','YES','Booked'),(33,'1028','YES','Booked'),(35,'1001','NO','Not Booked'),(36,'1002','YES','Booked'),(37,'1003','YES','Booked'),(38,'1004','YES','Booked'),(39,'1005','YES','Booked'),(40,'1006','YES','Booked'),(41,'1016','NO','Not Booked'),(42,'1007','NO','Not Booked'),(43,'1008','YES','Booked'),(44,'1009','YES','Booked'),(45,'1013','YES','Booked'),(46,'1014','YES','Booked'),(47,'1018','NO','Not Booked'),(48,'1019','NO','Not Booked'),(50,'1032','NO','Not Booked');
/*!40000 ALTER TABLE `room` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-04-23  1:48:19
