DELIMITER //
use WinningBidding

//

DROP VIEW `table_name_view`
//

CREATE 
    ALGORITHM = UNDEFINED 
   
    SQL SECURITY DEFINER
VIEW `table_name_view` AS
    SELECT DISTINCT
        `information_schema`.`tables`.`TABLE_TYPE` AS `TABLE_TYPE`,
        `information_schema`.`tables`.`TABLE_NAME` AS `TABLE_NAME`
    FROM
        `information_schema`.`tables`
//
