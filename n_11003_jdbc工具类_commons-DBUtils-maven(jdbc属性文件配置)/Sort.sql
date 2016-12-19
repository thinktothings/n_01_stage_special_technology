DROP TABLE IF EXISTS `Sort`;

CREATE TABLE `Sort` (
  `sid` int(11) NOT NULL AUTO_INCREMENT,
  `sname` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `parent` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `sdesc` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`sid`)
)