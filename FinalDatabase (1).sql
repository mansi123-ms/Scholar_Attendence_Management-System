/*
SQLyog Ultimate v11.33 (32 bit)
MySQL - 5.2.3-falcon-alpha-community-nt : Database - bunkercatcher
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`bunkercatcher` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `bunkercatcher`;

/*Table structure for table `account_disabled` */

DROP TABLE IF EXISTS `account_disabled`;

CREATE TABLE `account_disabled` (
  `Id` varchar(50) DEFAULT NULL,
  `Password` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `account_disabled` */

/*Table structure for table `admin` */

DROP TABLE IF EXISTS `admin`;

CREATE TABLE `admin` (
  `Id` varchar(50) NOT NULL DEFAULT '',
  `Name` varchar(100) DEFAULT '',
  `Email` varchar(50) DEFAULT NULL,
  `Contact` bigint(20) DEFAULT NULL,
  `Username` varchar(100) DEFAULT NULL,
  `Password` varchar(100) DEFAULT NULL,
  `Department` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `admin` */

insert  into `admin`(`Id`,`Name`,`Email`,`Contact`,`Username`,`Password`,`Department`) values ('FEC2020','Kinshuk Jain','kinshuk.jain14@gmail.com',9785039450,'kinshuk.jain','kinshu123','CS');

/*Table structure for table `attendence_status` */

DROP TABLE IF EXISTS `attendence_status`;

CREATE TABLE `attendence_status` (
  `StatusId` varchar(50) NOT NULL DEFAULT '',
  `EnrollmentNo` varchar(50) DEFAULT '',
  `Date` varchar(50) DEFAULT NULL,
  `FineStatus` varchar(50) DEFAULT 'N/A',
  PRIMARY KEY (`StatusId`),
  KEY `StudentAttendenceData` (`EnrollmentNo`),
  CONSTRAINT `StudentAttendenceData` FOREIGN KEY (`EnrollmentNo`) REFERENCES `student_login` (`EnrollmentNo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `attendence_status` */

insert  into `attendence_status`(`StatusId`,`EnrollmentNo`,`Date`,`FineStatus`) values ('STAT-20-20','EN17CS301135','18 / 10 / 2020','N/A'),('STAT-30-98','EN17CS301143','18 / 10 / 2020','N/A'),('STAT-HT78J6','EN17CS301135','11 / 11 / 2020','N/A'),('STAT-Z4BSAX','EN17CS301135','10 / 11 / 2020','N/A');

/*Table structure for table `bunkers_list` */

DROP TABLE IF EXISTS `bunkers_list`;

CREATE TABLE `bunkers_list` (
  `EnrollmentNo` varchar(50) DEFAULT '',
  `Program` varchar(100) DEFAULT NULL,
  `Department` varchar(100) DEFAULT NULL,
  `Section` varchar(50) DEFAULT NULL,
  `FineStatus` varchar(100) DEFAULT 'N/A',
  `StatusId` varchar(50) DEFAULT NULL,
  KEY `StudentData` (`EnrollmentNo`),
  KEY `bunkers_list_ibfk_1` (`StatusId`),
  CONSTRAINT `bunkers_list_ibfk_1` FOREIGN KEY (`StatusId`) REFERENCES `attendence_status` (`StatusId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `bunkers_list` */

insert  into `bunkers_list`(`EnrollmentNo`,`Program`,`Department`,`Section`,`FineStatus`,`StatusId`) values ('EN17CS301135','B. Tech','CS','C','N/A','STAT-20-20'),('EN17CS301143',NULL,'CS','D','N/A','STAT-30-98');

/*Table structure for table `courses` */

DROP TABLE IF EXISTS `courses`;

CREATE TABLE `courses` (
  `CourseCode` varchar(50) NOT NULL DEFAULT '',
  `CourseName` varchar(100) DEFAULT NULL,
  `Department` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`CourseCode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `courses` */

insert  into `courses`(`CourseCode`,`CourseName`,`Department`) values ('CS3CO13 (P)','Design & Analysis of Algorithm (P)','CS'),('CS3CO13 (T)','Design & Analysis of Algorithms (T)','CS'),('CS3CO15 (P)','Object Oriented Analysis & Design (P)','CS'),('CS3CO15 (T)','Object Oriented Analysis & Design (T)','CS'),('CS3EL08 (T)','Programming with XML (T)','CS'),('CS3EL10 (T)','Cloud Computing (T)','CS'),('CS3ES11 (P)','Computer Workshop (P)','CS'),('CS3ES11 (T)','Computer Workshop (T)','CS'),('EN3BS01 (T)','Engineering Mathematics -I (T)','M'),('EN3BS05 (P)','Engineering Physics (P)','PY'),('EN3BS05 (T)','Engineering Physics (T)','PY'),('EN3ES01 (P)','Basic Civil Engineering (P)','CE'),('EN3ES01 (T)','Basic Civil Engineering (T)','CE'),('EN3ES03 (P)','Basic Mechanical Engineering (P)','ME'),('EN3ES03 (T)','Basic Mechanical Engineering (T)','ME'),('EN3ES05 (T)','Basic Computer Engineering (T)','CS'),('EN3ES07 (P)','Documentation & Presentation (P)','CS'),('EN3HS01 (T)','History of Science & Technology (T)','HM'),('EN3HS03 (T)','Environmental Sciences (T)','C'),('EN3MC07 (Q)','Soft Skills -I (Q)','CS'),('OE00051 (T)','R Programming (T)','CS');

/*Table structure for table `faculty_junction` */

DROP TABLE IF EXISTS `faculty_junction`;

CREATE TABLE `faculty_junction` (
  `CourseCode` varchar(50) DEFAULT '',
  `FacultyId` varchar(50) DEFAULT '',
  KEY `faculty_junction_ibfk_2` (`CourseCode`),
  KEY `FacultyId` (`FacultyId`),
  CONSTRAINT `faculty_junction_ibfk_1` FOREIGN KEY (`CourseCode`) REFERENCES `courses` (`CourseCode`),
  CONSTRAINT `faculty_junction_ibfk_2` FOREIGN KEY (`FacultyId`) REFERENCES `faculty_login` (`FacultyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `faculty_junction` */

insert  into `faculty_junction`(`CourseCode`,`FacultyId`) values ('CS3CO15 (P)','FN187SE'),('CS3CO15 (P)','FN187SE'),('CS3CO15 (T)','FN187SE'),('CS3EL08 (T)','FN186PW'),('CS3ES11 (P)','FN186PW'),('CS3ES11 (T)','FN179CS'),('EN3BS01 (T)','FN197ZA');

/*Table structure for table `faculty_login` */

DROP TABLE IF EXISTS `faculty_login`;

CREATE TABLE `faculty_login` (
  `Name` varchar(100) DEFAULT '',
  `FacultyId` varchar(50) NOT NULL DEFAULT '',
  `Age` int(3) DEFAULT NULL,
  `Gender` varchar(20) DEFAULT NULL,
  `Contact` bigint(20) DEFAULT NULL,
  `Email` varchar(50) DEFAULT NULL,
  `Qualifications` varchar(500) DEFAULT NULL,
  `Position` varchar(200) DEFAULT NULL,
  `Department` varchar(100) DEFAULT NULL,
  `UserId` varchar(100) DEFAULT NULL,
  `Password` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`FacultyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `faculty_login` */

insert  into `faculty_login`(`Name`,`FacultyId`,`Age`,`Gender`,`Contact`,`Email`,`Qualifications`,`Position`,`Department`,`UserId`,`Password`) values ('Ramesh Meena','FE9875',21,'Male',987826456,'rameshmeena23@gmail.com','ME, BE		','Associate Professor','ME','ramesh.meena','ramesh123'),('Nitesh Tejra','FN179CS',25,'male',7897546654,'niteshtejra20@gmail.com','Btech,MTech','Assistant Professor','CS','nitesh.tejra','nitesh123'),('Chandra Shekhar Kothari','FN186PW',25,'male',9875649889,'chandrashekhar22@gmail.com','BE,ME','Assistant Professor','CS','chadrashekhar42','chandrashekhar123'),('Sushma Verma','FN187SE',25,'female',7854668879,'susmaverma@medicaps.ac.in','BTech,MTech','Assistant Professor','CS','verma.sushma','sushma123'),('Anusha Jain','FN197ZA',25,'female',8878565654,'anusha.jain@gmail.com','BE,MTECH','Assistant Professor','CS','anusha33','anusha123');

/*Table structure for table `hod_junction` */

DROP TABLE IF EXISTS `hod_junction`;

CREATE TABLE `hod_junction` (
  `CourseCode` varchar(50) DEFAULT '',
  `HodId` varchar(50) DEFAULT '',
  KEY `HodId` (`HodId`),
  KEY `hod_junction_ibfk_3` (`CourseCode`),
  CONSTRAINT `hod_junction_ibfk_3` FOREIGN KEY (`CourseCode`) REFERENCES `courses` (`CourseCode`),
  CONSTRAINT `hod_junction_ibfk_4` FOREIGN KEY (`HodId`) REFERENCES `hod_login` (`HodId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `hod_junction` */

insert  into `hod_junction`(`CourseCode`,`HodId`) values ('CS3EL10 (T)','FE789QW'),('EN3BS01 (T)','FE789QW'),('EN3ES05 (T)','FE789QW'),('CS3CO15 (P)','FE789QW'),('CS3ES11 (P)','FE987AS'),('EN3ES03 (P)','FE987AS'),('EN3ES03 (T)','FE987AS'),('EN3ES07 (P)','FE987AS');

/*Table structure for table `hod_login` */

DROP TABLE IF EXISTS `hod_login`;

CREATE TABLE `hod_login` (
  `Name` varchar(30) DEFAULT '',
  `HodId` varchar(15) NOT NULL DEFAULT '',
  `Age` int(3) DEFAULT NULL,
  `Gender` varchar(5) DEFAULT NULL,
  `Contact` bigint(13) DEFAULT NULL,
  `Email` varchar(25) DEFAULT NULL,
  `Qualifications` varchar(100) DEFAULT NULL,
  `Department` varchar(20) DEFAULT NULL,
  `UserId` varchar(25) DEFAULT NULL,
  `Password` varchar(16) DEFAULT NULL,
  PRIMARY KEY (`HodId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `hod_login` */

insert  into `hod_login`(`Name`,`HodId`,`Age`,`Gender`,`Contact`,`Email`,`Qualifications`,`Department`,`UserId`,`Password`) values ('Suresh Jain','FE789QW',0,'Male',8877987532,'sureshjain66@gmail.com','BE,ME,PHD','CS','suresh.jain','suresh123'),('Madhur Atre','FE987AS',42,'male',8875697569,'madsdwd','BTECH,MTECH,PHD','ME','madhur.atre','madhur123');

/*Table structure for table `leave_application` */

DROP TABLE IF EXISTS `leave_application`;

CREATE TABLE `leave_application` (
  `ApplicationId` varchar(50) NOT NULL DEFAULT '',
  `EnrollmentNo` varchar(50) DEFAULT '',
  `Name` varchar(100) DEFAULT NULL,
  `FromDate` varchar(50) DEFAULT NULL,
  `ToDate` varchar(50) DEFAULT NULL,
  `Days` int(3) DEFAULT NULL,
  `Reason` varchar(1000) DEFAULT NULL,
  `LeaveStatus` varchar(50) DEFAULT 'Pending',
  PRIMARY KEY (`ApplicationId`),
  KEY `EnrollmentNo` (`EnrollmentNo`),
  CONSTRAINT `leave_application_ibfk_1` FOREIGN KEY (`EnrollmentNo`) REFERENCES `student_login` (`EnrollmentNo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `leave_application` */

insert  into `leave_application`(`ApplicationId`,`EnrollmentNo`,`Name`,`FromDate`,`ToDate`,`Days`,`Reason`,`LeaveStatus`) values ('LEV1UHUYZ','EN17CS301135','Kinshuk Jain','21 / 10 / 2020','30 / 10 / 2020',9,'Medical Leave-Due to COVID-19','Approved'),('LEV7789','EN17CS301143','Madhur Atre','2 / 10 / 2020','3 / 10 / 2020',1,'not feeling well','Approved'),('LEV8979','EN17CS301135','Kinshuk Jain','1 / 10 / 2020','5 / 10 / 2020',5,'out of station','Approved'),('LEVYWT5VK','EN17CS301135','Kinshuk Jain','4 / 11 / 2020','14 / 11 / 2020',10,'Corrona +ve-Detected on 3rd of November\n','pending');

/*Table structure for table `status_table` */

DROP TABLE IF EXISTS `status_table`;

CREATE TABLE `status_table` (
  `StatusId` varchar(50) DEFAULT NULL,
  `CourseCode` varchar(50) DEFAULT NULL,
  `EnrollmentNo` varchar(50) DEFAULT NULL,
  `Time` varchar(50) DEFAULT NULL,
  `Status` varchar(50) DEFAULT 'Pending',
  KEY `StatusId` (`StatusId`),
  CONSTRAINT `status_table_ibfk_1` FOREIGN KEY (`StatusId`) REFERENCES `attendence_status` (`StatusId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `status_table` */

insert  into `status_table`(`StatusId`,`CourseCode`,`EnrollmentNo`,`Time`,`Status`) values ('STAT-20-20','CS3CO13 (P)','EN17CS301135','10:30 am','Pending'),('STAT-20-20','CS3EL08 (T)','EN17CS301135','10:30 am','Pending'),('STAT-20-20','CS3CO15 (P)','EN17CS301135','10:30 am','Pending'),('STAT-20-20','CS3EL10 (T)','EN17CS301135','10:30 am','Pending'),('STAT-30-98','CS3CO13 (T)','EN17CS301143','10:30 am','Pending'),('STAT-30-98','CS3CO15 (P)','EN17CS301143','10:30 am','Pending'),('STAT-30-98','CS3EL08 (T)','EN17CS301143','10:30 am','Pending'),('STAT-30-98','CS3ES11 (T)','EN17CS301143','13:35','Pending'),('STAT-Z4BSAX','CS3CO13 (P)','EN17CS301135','05:44 PM','Pending'),('STAT-Z4BSAX','CS3EL08 (T)','EN17CS301135','05:44 PM','Pending'),('STAT-Z4BSAX','CS3CO15 (P)','EN17CS301135','08:58 PM','Present'),('STAT-Z4BSAX','CS3EL10 (T)','EN17CS301135','05:44 PM','Pending'),('STAT-HT78J6','CS3CO13 (P)','EN17CS301135','01:47 PM','Pending'),('STAT-HT78J6','CS3EL08 (T)','EN17CS301135','01:47 PM','Pending'),('STAT-HT78J6','CS3CO15 (P)','EN17CS301135','01:47 PM','Pending'),('STAT-HT78J6','CS3EL10 (T)','EN17CS301135','01:47 PM','Pending');

/*Table structure for table `student_junction` */

DROP TABLE IF EXISTS `student_junction`;

CREATE TABLE `student_junction` (
  `CourseCode` varchar(50) DEFAULT '',
  `EnrollmentNo` varchar(50) DEFAULT '',
  KEY `CourseCode` (`CourseCode`),
  KEY `EnrollmentNo` (`EnrollmentNo`),
  CONSTRAINT `student_junction_ibfk_1` FOREIGN KEY (`CourseCode`) REFERENCES `courses` (`CourseCode`),
  CONSTRAINT `student_junction_ibfk_2` FOREIGN KEY (`EnrollmentNo`) REFERENCES `student_login` (`EnrollmentNo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `student_junction` */

insert  into `student_junction`(`CourseCode`,`EnrollmentNo`) values ('CS3CO13 (P)','EN17CS301135'),('CS3EL08 (T)','EN17CS301135'),('CS3CO15 (P)','EN17CS301135'),('CS3EL10 (T)','EN17CS301135'),('CS3CO13 (T)','EN17CS301143'),('CS3CO15 (P)','EN17CS301143'),('CS3EL08 (T)','EN17CS301143'),('CS3ES11 (T)','EN17CS301143'),('EN3BS01 (T)','EN17CS301147'),('EN3ES03 (T)','EN17CS302257');

/*Table structure for table `student_login` */

DROP TABLE IF EXISTS `student_login`;

CREATE TABLE `student_login` (
  `Name` varchar(50) DEFAULT '',
  `EnrollmentNo` varchar(50) NOT NULL DEFAULT '',
  `Program` varchar(100) DEFAULT NULL,
  `Branch` varchar(100) DEFAULT NULL,
  `Section` varchar(10) DEFAULT NULL,
  `Gender` varchar(10) DEFAULT NULL,
  `Dob` varchar(50) DEFAULT NULL,
  `ContactNo` bigint(20) DEFAULT NULL,
  `Email` varchar(100) DEFAULT NULL,
  `User_id` varchar(100) DEFAULT NULL,
  `Password` varchar(100) DEFAULT NULL,
  `ParentEmail` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`EnrollmentNo`),
  KEY `EnrollmentNo` (`EnrollmentNo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `student_login` */

insert  into `student_login`(`Name`,`EnrollmentNo`,`Program`,`Branch`,`Section`,`Gender`,`Dob`,`ContactNo`,`Email`,`User_id`,`Password`,`ParentEmail`) values ('Jayesh Kumar Pathak','EN17CS301127','B Tech','CS','C','Male','14 / 06 / 1999',9785039450,'jayesh.pathak@gmail.com','jayesh.pathak','jayesh1234','pathaksir@gmail.com'),('Kinshuk Jain','EN17CS301135','BTech','CS','C','Male','14 / 06 / 1999',9785039450,'kinshuk.jain14@gmail.com','kinshuk.jain14','kinshu123','praveenjaink'),('Madhur Atre','EN17CS301143','BTech','CS','D','Male','25 / 04 / 1999',7684534584,'madhur.atre25@gmail.com','madhur.atre25','madhur123','NA'),('Mansi Sarraf','EN17CS301147','BTech','CS','C','Female','3 / 10 / 1999',7812311899,'mansisaraf21@gmail.com','mansisarraf','mansi123','NA'),('Saurav Nair','EN17CS302257','BTech','CS','D','Male','1 / 11 / 1999',8305040719,'nairsaurav21@gmail.com','nairsaurav','saurav123','NA');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
