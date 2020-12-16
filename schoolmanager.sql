CREATE DATABASE  IF NOT EXISTS `student`;
USE `student`;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `age` int(11) NOT NULL,
  `year` int(11) NOT NULL,
  `math` double DEFAULT NULL,
  `physical` double DEFAULT NULL,
  `chemistry` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

