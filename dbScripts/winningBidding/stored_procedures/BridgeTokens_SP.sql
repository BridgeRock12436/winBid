

DELIMITER //
use WinningBidding

//
drop procedure WinningBidding.BridgeTokens_SP

//



CREATE DEFINER=`BobAdmin`@`localhost` PROCEDURE `BridgeTokens_SP`(
	OUT returnId INT
	,IN argAttuid VARCHAR(10)
	,IN argAction char
	,IN argId INT
	,IN argTokenName VARCHAR(45)
	,IN argTokenChar VARCHAR(5)
	,IN argTokenValue VARCHAR(45))
	 MODIFIES SQL DATA 
BEGIN
	DECLARE attuid VARCHAR(20);
	DECLARE action char;
	DECLARE tokenName VARCHAR(45);
	DECLARE tokenChar VARCHAR(5);
	DECLARE tokenValue VARCHAR(45);
	
	set returnId=argId;
	set attuid=RTRIM(LTRIM(argAttuid));
	set action=argAction;
	set tokenName=RTRIM(LTRIM(argTokenName));
	set tokenChar=RTRIM(LTRIM(argTokenChar));
	set tokenValue=RTRIM(LTRIM(argTokenValue));
	
	
	case action
		when 'I' then
			BEGIN
				
					INSERT INTO bridgeTokens(tokenName,tokenChar,tokenValue,addedBy,addedDate)
					values(tokenName,tokenCHar,tokenValue,attuid,CURRENT_TIMESTAMP);
					set returnId=Last_Identity_Id();
			END;
		when 'U' then
			BEGIN
				
				UPDATE bridgeTokens
					set tokenName=tokenName
					,tokenChar=tokenChar
					,tokenValue=tokenValue
					,modifiedBy=attuid
					,modifiedDate=CURRENT_TIMESTAMP
					where id=argId;
			END;
		when 'D' then
			BEGIN
					
				DELETE FROM bridgeTokens	where id=argId;
					
			END;
				
	END CASE;
END
//







