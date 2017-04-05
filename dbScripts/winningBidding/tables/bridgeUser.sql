CREATE TABLE `BridgeUser` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userId` varchar(25) NOT NULL,
  `firstName` varchar(40) NOT NULL,
  `lastName` varchar(40) NOT NULL,
  `password` varchar(25) NOT NULL,
  `addedBy` varchar(25) NOT NULL,
  `addedByDate` datetime NOT NULL,
  `modifiedBy` varchar(25) DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `userId` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=ascii
