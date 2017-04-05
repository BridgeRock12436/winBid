CREATE 
    ALGORITHM = UNDEFINED 
    DEFINER = `bobAdmin`@`%` 
    SQL SECURITY DEFINER
VIEW `all_table_view` AS
    SELECT 
        `information_schema`.`tables`.`TABLE_TYPE` AS `TABLE_TYPE`,
        `information_schema`.`columns`.`TABLE_SCHEMA` AS `TABLE_SCHEMA`,
        `information_schema`.`columns`.`TABLE_NAME` AS `TABLE_NAME`,
        `information_schema`.`columns`.`COLUMN_NAME` AS `COLUMN_NAME`,
        `information_schema`.`columns`.`DATA_TYPE` AS `DATA_TYPE`,
        `information_schema`.`columns`.`ORDINAL_POSITION` AS `ORDINAL_POSITION`,
        `information_schema`.`columns`.`COLUMN_DEFAULT` AS `COLUMN_DEFAULT`,
        `information_schema`.`columns`.`IS_NULLABLE` AS `IS_NULLABLE`,
        IF(`information_schema`.`columns`.`CHARACTER_MAXIMUM_LENGTH` > 6500,6500,`information_schema`.`columns`.`CHARACTER_MAXIMUM_LENGTH`) AS `CHARACTER_MAXIMUM_LENGTH`
    FROM
        (`information_schema`.`columns`
        JOIN `information_schema`.`tables`)
    WHERE
        ((`information_schema`.`columns`.`TABLE_SCHEMA` = 'winningBidding')
            AND (`information_schema`.`columns`.`TABLE_SCHEMA` = `information_schema`.`tables`.`TABLE_SCHEMA`)
            AND (`information_schema`.`columns`.`TABLE_NAME` = `information_schema`.`tables`.`TABLE_NAME`))
