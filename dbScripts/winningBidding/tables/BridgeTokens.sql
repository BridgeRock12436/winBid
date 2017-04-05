CREATE TABLE `bridgeTokens` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tokenName` varchar(45) NOT NULL,
  `tokenChar` varchar(5) NOT NULL,
  `tokenValue` varchar(45) NOT NULL,
  `addedBy` varchar(20) NOT NULL,
  `addedDate` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `modifiedBy` varchar(20) DEFAULT NULL,
  `modifiedDate` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=60 DEFAULT CHARSET=ascii;
