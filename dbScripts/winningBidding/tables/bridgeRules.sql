CREATE TABLE `bridgeRules` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `team` varchar(50) NOT NULL,
  `rule` varchar(100) NOT NULL,
  `ruleName` varchar(20) NOT NULL,
  `ruleDesc` varchar(100) NOT NULL,
  `addedBy` varchar(20) NOT NULL,
  `addedDate` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `modifiedBy` varchar(20) DEFAULT NULL,
  `modifiedDate` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=ascii;
