package grammer.bridgeOnlineBidding.com;




public class bridgeTok{
private grammer.bridgeOnlineBidding.com.bridgeTokens tok;
private String data;
public bridgeTok(grammer.bridgeOnlineBidding.com.bridgeTokens tok, String data)
{
this.setTok(tok);
this.setData(data);
}
public static grammer.bridgeOnlineBidding.com.bridgeTokens exclame()
{
return grammer.bridgeOnlineBidding.com.bridgeTokens.EXCLAME;
}
public static grammer.bridgeOnlineBidding.com.bridgeTokens[] nodeTypes()
{
		grammer.bridgeOnlineBidding.com.bridgeTokens[] tokA={grammer.bridgeOnlineBidding.com.bridgeTokens.TOTAL_POINTS
			,grammer.bridgeOnlineBidding.com.bridgeTokens.POINT
			,grammer.bridgeOnlineBidding.com.bridgeTokens.COUNT
			,grammer.bridgeOnlineBidding.com.bridgeTokens.SUIT
			};
	return tokA;
}

public static bridgeTokens[] mainTypes() {
	// TODO Auto-generated method stub
	grammer.bridgeOnlineBidding.com.bridgeTokens[] tokA={grammer.bridgeOnlineBidding.com.bridgeTokens.LEFT_PAR
			,grammer.bridgeOnlineBidding.com.bridgeTokens.EXCLAME
			,grammer.bridgeOnlineBidding.com.bridgeTokens.END
			,grammer.bridgeOnlineBidding.com.bridgeTokens.OR
			};
	return tokA;
}
 public static grammer.bridgeOnlineBidding.com.bridgeTokens  returnToken(String argTokS)
    {
    	char ch;
    	int chi;
   
    	ch=argTokS.charAt(0);
    	chi=(int)ch
 
	switch(chi)
	{
			case 66: return grammer.bridgeOnlineBidding.com.bridgeTokens.ACE;
			case 38: return grammer.bridgeOnlineBidding.com.bridgeTokens.AND;
			case 42: return grammer.bridgeOnlineBidding.com.bridgeTokens.ANY;
			case 64: return grammer.bridgeOnlineBidding.com.bridgeTokens.ATSYMB;
			case 92: return grammer.bridgeOnlineBidding.com.bridgeTokens.BACK_SLASH;
			case 104: return grammer.bridgeOnlineBidding.com.bridgeTokens.CARD;
			case 97: return grammer.bridgeOnlineBidding.com.bridgeTokens.CLUB;
			case 58: return grammer.bridgeOnlineBidding.com.bridgeTokens.COLON;
			case 34: return grammer.bridgeOnlineBidding.com.bridgeTokens.COMMA;
			case 106: return grammer.bridgeOnlineBidding.com.bridgeTokens.COUNT;
			case 10: return grammer.bridgeOnlineBidding.com.bridgeTokens.CR_LF;
			case 98: return grammer.bridgeOnlineBidding.com.bridgeTokens.DIAMOND;
			case 36: return grammer.bridgeOnlineBidding.com.bridgeTokens.DOLLAR;
			case 34: return grammer.bridgeOnlineBidding.com.bridgeTokens.DOUBLE_QUOTE;
			case 118: return grammer.bridgeOnlineBidding.com.bridgeTokens.EIGHT;
			case 61: return grammer.bridgeOnlineBidding.com.bridgeTokens.EQUAL;
			case 33: return grammer.bridgeOnlineBidding.com.bridgeTokens.EXCLAME;
			case 115: return grammer.bridgeOnlineBidding.com.bridgeTokens.FIVE;
			case 47: return grammer.bridgeOnlineBidding.com.bridgeTokens.FORW_SLASH;
			case 114: return grammer.bridgeOnlineBidding.com.bridgeTokens.FOUR;
			case 62: return grammer.bridgeOnlineBidding.com.bridgeTokens.GREATER;
			case 94: return grammer.bridgeOnlineBidding.com.bridgeTokens.HAT;
			case 99: return grammer.bridgeOnlineBidding.com.bridgeTokens.HEART;
			case 45: return grammer.bridgeOnlineBidding.com.bridgeTokens.HYPHEN;
			case 121: return grammer.bridgeOnlineBidding.com.bridgeTokens.JACK;
			case 65: return grammer.bridgeOnlineBidding.com.bridgeTokens.KING;
			case 91: return grammer.bridgeOnlineBidding.com.bridgeTokens.LEFT_BRACKET;
			case 123: return grammer.bridgeOnlineBidding.com.bridgeTokens.LEFT_CURLY;
			case 40: return grammer.bridgeOnlineBidding.com.bridgeTokens.LEFT_PAR;
			case 60: return grammer.bridgeOnlineBidding.com.bridgeTokens.LESS;
			case 109: return grammer.bridgeOnlineBidding.com.bridgeTokens.NAME;
			case 119: return grammer.bridgeOnlineBidding.com.bridgeTokens.NINE;
			case 101: return grammer.bridgeOnlineBidding.com.bridgeTokens.NT;
			case 110: return grammer.bridgeOnlineBidding.com.bridgeTokens.NUMBER;
			case 111: return grammer.bridgeOnlineBidding.com.bridgeTokens.ONE;
			case 124: return grammer.bridgeOnlineBidding.com.bridgeTokens.OR;
			case 37: return grammer.bridgeOnlineBidding.com.bridgeTokens.PERC;
			case 46: return grammer.bridgeOnlineBidding.com.bridgeTokens.PERIOD;
			case 43: return grammer.bridgeOnlineBidding.com.bridgeTokens.PLUS;
			case 102: return grammer.bridgeOnlineBidding.com.bridgeTokens.POINT;
			case 35: return grammer.bridgeOnlineBidding.com.bridgeTokens.POUND;
			case 122: return grammer.bridgeOnlineBidding.com.bridgeTokens.QUEEN;
			case 63: return grammer.bridgeOnlineBidding.com.bridgeTokens.QUESTION;
			case 93: return grammer.bridgeOnlineBidding.com.bridgeTokens.RIGHT_BRACKET;
			case 125: return grammer.bridgeOnlineBidding.com.bridgeTokens.RIGHT_CURLY;
			case 41: return grammer.bridgeOnlineBidding.com.bridgeTokens.RIGHT_PAR;
			case 59: return grammer.bridgeOnlineBidding.com.bridgeTokens.SEMI_COLON;
			case 117: return grammer.bridgeOnlineBidding.com.bridgeTokens.SEVEN;
			case 39: return grammer.bridgeOnlineBidding.com.bridgeTokens.SINGLE_QUOTE;
			case 116: return grammer.bridgeOnlineBidding.com.bridgeTokens.SIX;
			case 32: return grammer.bridgeOnlineBidding.com.bridgeTokens.SPACE;
			case 100: return grammer.bridgeOnlineBidding.com.bridgeTokens.SPADE;
			case 105: return grammer.bridgeOnlineBidding.com.bridgeTokens.SUIT;
			case 9: return grammer.bridgeOnlineBidding.com.bridgeTokens.TAB;
			case 120: return grammer.bridgeOnlineBidding.com.bridgeTokens.TEN;
			case 113: return grammer.bridgeOnlineBidding.com.bridgeTokens.THREE;
			case 103: return grammer.bridgeOnlineBidding.com.bridgeTokens.TOTAL_POINTS;
			case 112: return grammer.bridgeOnlineBidding.com.bridgeTokens.TWO;
			case 95: return grammer.bridgeOnlineBidding.com.bridgeTokens.UNDER;
    	}
   	return grammer.bridgeOnlineBidding.com.bridgeTokens.ERROR;
    }

public grammer.bridgeOnlineBidding.com.bridgeTokens getTok() {
	return tok;
}
public void setTok(grammer.bridgeOnlineBidding.com.bridgeTokens tok) {
	this.tok = tok;
}
public String getData() {
	return data;
}
public void setData(String data) {
	this.data = data;
}
public static void throwTokens(String argMsg, bridgeTokens tk, bridgeTokens[] argTokenA) throws bridgeParseException {
               // TODO Auto-generated method stub
               String msg;
       String tokS;
       String pre;
       tokS=retTokValue(tk);
       msg=argMsg;
       msg+="RECIEVED ("+tokS+")  EXPECTED (";
       pre="";
       for(grammer.bridgeOnlineBidding.com.bridgeTokens tkI:argTokenA)
       {
               msg+=pre+retTokValue(tkI);
               pre=",";
       }
       grammer.bridgeOnlineBidding.com.bridgeParseException ps;
       ps=new grammer.bridgeOnlineBidding.com.bridgeParseException(msg);
       throw(ps);
               
       }
       private static String retTokValue(grammer.bridgeOnlineBidding.com.bridgeTokens tk) {
               // TODO Auto-generated method stub
               switch(tk)
               {
			case ACE: return "ACE";
			case AND: return "AND";
			case ANY: return "ANY";
			case ATSYMB: return "AT SYMBOL";
			case BACK_SLASH: return "BACK SLASH";
			case CARD: return "CARD";
			case CLUB: return "CLUB";
			case COLON: return "COLON";
			case COMMA: return "COMMA";
			case COUNT: return "COUNT";
			case CR_LF: return "NEW LINE";
			case DIAMOND: return "DIAMOND";
			case DOLLAR: return "DOLLAR SIGN";
			case DOUBLE_QUOTE: return "DOUBLE QUOTE"";
			case EIGHT: return "EIGHT";
			case EQUAL: return "EQUAL";
			case EXCLAME: return "EXCLAMATION POINT";
			case FIVE: return "FIVE";
			case FORW_SLASH: return "FORWARD SLASH";
			case FOUR: return "FOUR";
			case GREATER: return "GREATER";
			case HAT: return "HAT";
			case HEART: return "HEART";
			case HYPHEN: return "HYPHEN/MINUS";
			case JACK: return "JACK";
			case KING: return "KING";
			case LEFT_BRACKET: return "LEFT BRACKET";
			case LEFT_CURLY: return "LEFT CURLY";
			case LEFT_PAR: return "LEFT PAR";
			case LESS: return "LESS";
			case NAME: return "NAME";
			case NINE: return "NINE";
			case NT: return "NT";
			case NUMBER: return "NUMBER";
			case ONE: return "ONE";
			case OR: return "OR";
			case PERC: return "PERC";
			case PERIOD: return "PERIOD";
			case PLUS: return "PLUS";
			case POINT: return "POINT";
			case POUND: return "POUND";
			case QUEEN: return "QUEEN";
			case QUESTION: return "QUESTION";
			case RIGHT_BRACKET: return "RIGHT BRACKET";
			case RIGHT_CURLY: return "RIGHT CURLY";
			case RIGHT_PAR: return "RIGHT PAR";
			case SEMI_COLON: return "SEMI COLON";
			case SEVEN: return "SEVEN";
			case SINGLE_QUOTE: return "SINGLE QUOTE";
			case SIX: return "SIX";
			case SPACE: return "SPACE";
			case SPADE: return "SPADE";
			case SUIT: return "SUIT";
			case TAB: return "TAB";
			case TEN: return "TEN";
			case THREE: return "THREE";
			case TOTAL_POINTS: return "TOTAL POINTS";
			case TWO: return "TWO";
			case UNDER: return "UNDER SCORE";
		}
	return "";
	}
       private static char retTokChar(grammer.bridgeOnlineBidding.com.bridgeTokens tk) {
               // TODO Auto-generated method stub
               switch(tk)
               {
			case ACE: return (char) 66;
			case AND: return (char) 38;
			case ANY: return (char) 42;
			case ATSYMB: return (char) 64;
			case BACK_SLASH: return (char) 92;
			case CARD: return (char) 104;
			case CLUB: return (char) 97;
			case COLON: return (char) 58;
			case COMMA: return (char) 34;
			case COUNT: return (char) 106;
			case CR_LF: return (char) 10;
			case DIAMOND: return (char) 98;
			case DOLLAR: return (char) 36;
			case DOUBLE_QUOTE: return (char) 34;
			case EIGHT: return (char) 118;
			case EQUAL: return (char) 61;
			case EXCLAME: return (char) 33;
			case FIVE: return (char) 115;
			case FORW_SLASH: return (char) 47;
			case FOUR: return (char) 114;
			case GREATER: return (char) 62;
			case HAT: return (char) 94;
			case HEART: return (char) 99;
			case HYPHEN: return (char) 45;
			case JACK: return (char) 121;
			case KING: return (char) 65;
			case LEFT_BRACKET: return (char) 91;
			case LEFT_CURLY: return (char) 123;
			case LEFT_PAR: return (char) 40;
			case LESS: return (char) 60;
			case NAME: return (char) 109;
			case NINE: return (char) 119;
			case NT: return (char) 101;
			case NUMBER: return (char) 110;
			case ONE: return (char) 111;
			case OR: return (char) 124;
			case PERC: return (char) 37;
			case PERIOD: return (char) 46;
			case PLUS: return (char) 43;
			case POINT: return (char) 102;
			case POUND: return (char) 35;
			case QUEEN: return (char) 122;
			case QUESTION: return (char) 63;
			case RIGHT_BRACKET: return (char) 93;
			case RIGHT_CURLY: return (char) 125;
			case RIGHT_PAR: return (char) 41;
			case SEMI_COLON: return (char) 59;
			case SEVEN: return (char) 117;
			case SINGLE_QUOTE: return (char) 39;
			case SIX: return (char) 116;
			case SPACE: return (char) 32;
			case SPADE: return (char) 100;
			case SUIT: return (char) 105;
			case TAB: return (char) 9;
			case TEN: return (char) 120;
			case THREE: return (char) 113;
			case TOTAL_POINTS: return (char) 103;
			case TWO: return (char) 112;
			case UNDER: return (char) 95;
		}
	return '';
	}
public boolean isTok(bridgeTokens argTok) {
   	// TODO Auto-generated method stub
	if(this.getTok() == argTok)
	{
		return true;
	}
	return false;
}
}
