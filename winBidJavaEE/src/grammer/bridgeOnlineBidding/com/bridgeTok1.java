package grammer.bridgeOnlineBidding.com;

public class bridgeTok1 {
	private grammer.bridgeOnlineBidding.com.bridgeTokens1 tok;
	private String data;
	public bridgeTok1(grammer.bridgeOnlineBidding.com.bridgeTokens1 tok, String data)
	{
		this.setTok(tok);
		this.setData(data);
		
	}
	public static grammer.bridgeOnlineBidding.com.bridgeTokens1 exclame()
	{
		return grammer.bridgeOnlineBidding.com.bridgeTokens1.EXCLAMATION;
	}
	public static grammer.bridgeOnlineBidding.com.bridgeTokens1[] nodeTypes()
	{
		grammer.bridgeOnlineBidding.com.bridgeTokens1[] tokA={grammer.bridgeOnlineBidding.com.bridgeTokens1.TOTAL_POINTS
				,grammer.bridgeOnlineBidding.com.bridgeTokens1.POINT
				,grammer.bridgeOnlineBidding.com.bridgeTokens1.COUNT
				,grammer.bridgeOnlineBidding.com.bridgeTokens1.SUIT
				};
		return tokA;
	}
	
	public static bridgeTokens1[] mainTypes() {
		// TODO Auto-generated method stub
		grammer.bridgeOnlineBidding.com.bridgeTokens1[] tokA={grammer.bridgeOnlineBidding.com.bridgeTokens1.LEFT_PAR
				,grammer.bridgeOnlineBidding.com.bridgeTokens1.EXCLAMATION
				,grammer.bridgeOnlineBidding.com.bridgeTokens1.END
				,grammer.bridgeOnlineBidding.com.bridgeTokens1.OR
				};
		return tokA;
	}
	 public static grammer.bridgeOnlineBidding.com.bridgeTokens1  returnToken(String argTokS)
	    {
	    	char ch;
	    	
	    	ch=argTokS.charAt(0);
	  
	    	switch(ch)
	    	{
	    	
			          case 'a': return grammer.bridgeOnlineBidding.com.bridgeTokens1.CLUB;
			          case 'b': return grammer.bridgeOnlineBidding.com.bridgeTokens1.DIAMOND;
			          case 'c': return grammer.bridgeOnlineBidding.com.bridgeTokens1.HEART;
			          case 'd': return grammer.bridgeOnlineBidding.com.bridgeTokens1.SPADE;
			          case 'e': return grammer.bridgeOnlineBidding.com.bridgeTokens1.NT;
			          case 'f': return grammer.bridgeOnlineBidding.com.bridgeTokens1.POINT;
			          case 'g': return grammer.bridgeOnlineBidding.com.bridgeTokens1.TOTAL_POINTS;
			          case 'h': return grammer.bridgeOnlineBidding.com.bridgeTokens1.CARD;
			          case 'i': return grammer.bridgeOnlineBidding.com.bridgeTokens1.SUIT;
			          case 'j': return grammer.bridgeOnlineBidding.com.bridgeTokens1.COUNT;
			          case '&': return grammer.bridgeOnlineBidding.com.bridgeTokens1.AND;
			          case '|': return grammer.bridgeOnlineBidding.com.bridgeTokens1.OR;
			          case 'm': return grammer.bridgeOnlineBidding.com.bridgeTokens1.NAME;
			          case 'n': return grammer.bridgeOnlineBidding.com.bridgeTokens1.NUMBER;
			          case 'o': return grammer.bridgeOnlineBidding.com.bridgeTokens1.ONE;
			          case 'p': return grammer.bridgeOnlineBidding.com.bridgeTokens1.TWO;
			          case 'q': return grammer.bridgeOnlineBidding.com.bridgeTokens1.THREE;
			          case 'r': return grammer.bridgeOnlineBidding.com.bridgeTokens1.FOUR;
			          case 's': return grammer.bridgeOnlineBidding.com.bridgeTokens1.FIVE;
			          case 't': return grammer.bridgeOnlineBidding.com.bridgeTokens1.SIX;
			          case 'u': return grammer.bridgeOnlineBidding.com.bridgeTokens1.SEVEN;
			          case 'v': return grammer.bridgeOnlineBidding.com.bridgeTokens1.EIGHT;
			          case 'w': return grammer.bridgeOnlineBidding.com.bridgeTokens1.NINE;
			          case 'x': return grammer.bridgeOnlineBidding.com.bridgeTokens1.TEN;
			          case 'y': return grammer.bridgeOnlineBidding.com.bridgeTokens1.JACK;
			          case 'z': return grammer.bridgeOnlineBidding.com.bridgeTokens1.QUEEN;
			          case 'A': return grammer.bridgeOnlineBidding.com.bridgeTokens1.KING;
			          case 'B': return grammer.bridgeOnlineBidding.com.bridgeTokens1.ACE;
			          case 'C': return grammer.bridgeOnlineBidding.com.bridgeTokens1.ANY;
			          case '(': return grammer.bridgeOnlineBidding.com.bridgeTokens1.LEFT_PAR;
			          case ')': return grammer.bridgeOnlineBidding.com.bridgeTokens1.RIGHT_PAR;
			          case ' ': return grammer.bridgeOnlineBidding.com.bridgeTokens1.SPACE;
			          case '\n': return grammer.bridgeOnlineBidding.com.bridgeTokens1.CR_LF;
			          case '\t': return grammer.bridgeOnlineBidding.com.bridgeTokens1.TAB;
			          case '-': return grammer.bridgeOnlineBidding.com.bridgeTokens1.HYPHEN;

			          case '!': return grammer.bridgeOnlineBidding.com.bridgeTokens1.EXCLAMATION;
			          

	    	
	    	}
	    	return grammer.bridgeOnlineBidding.com.bridgeTokens1.ERROR;
	    }
	
	public grammer.bridgeOnlineBidding.com.bridgeTokens1 getTok() {
		return tok;
	}
	public void setTok(grammer.bridgeOnlineBidding.com.bridgeTokens1 tok) {
		this.tok = tok;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public static void throwTokens(String argMsg, bridgeTokens1 tk, bridgeTokens1[] argTokenA) throws bridgeParseException {
		// TODO Auto-generated method stub
		String msg;
    	String tokS;
    	String pre;
    	tokS=retTokValue(tk);
    	msg=argMsg;
    	msg+=" RECIEVED ("+tokS+")  EXPECTED (";
    	pre="";
    	for(grammer.bridgeOnlineBidding.com.bridgeTokens1 tkI:argTokenA)
    	{
    		msg+=pre+retTokValue(tkI);
    		pre=",";
    	}
    	grammer.bridgeOnlineBidding.com.bridgeParseException ps;
    	ps=new grammer.bridgeOnlineBidding.com.bridgeParseException(msg);
    	throw(ps);
		
	}
	private static String retTokValue(grammer.bridgeOnlineBidding.com.bridgeTokens1 tk) {
		// TODO Auto-generated method stub
		switch(tk)
		{
			case CLUB: return "CLUB";
			case DIAMOND: return "DIAMOND";
			case HEART: return "HEART";
			case SPADE: return "SPADE";
			case NT: return "NT";
			case POINT: return "POINT";
			case TOTAL_POINTS: return "TOTAL_POINTS";
			case CARD: return "CARD";
			case SUIT: return "SUIT";
			case COUNT: return "COUNT";
			case AND: return "AND";
			case OR: return "OR";
			case NAME: return "NAME";
			case NUMBER: return "NUMBER";
			case ONE: return "ONE";
			case TWO: return "TWO";
			case THREE: return "THREE";
			case FOUR: return "FOUR";
			case FIVE: return "FIVE";
			case SIX: return "SIX";
			case SEVEN: return "SEVEN";
			case EIGHT: return "EIGHT";
			case NINE: return "NINE";
			case TEN: return "TEN";
			case JACK: return "JACK";
			case QUEEN: return "QUEEN";
			case KING: return "KING";
			case SPACE: return "ACE";
			case ANY: return "ANY";
			case LEFT_PAR: return "LEFT_PAR";
			case RIGHT_PAR: return "RIGHT_PAR";
		}
		return null;
	}
	public boolean isTok(bridgeTokens1 argTok) {
		// TODO Auto-generated method stub
		if(this.getTok() == argTok)
		{
			return true;
		}
		return false;
	}
	
	
	

}
