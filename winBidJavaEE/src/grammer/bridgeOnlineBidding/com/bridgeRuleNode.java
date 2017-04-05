package grammer.bridgeOnlineBidding.com;

public class bridgeRuleNode {
	private boolean trueFlag;
	private int beginValue;
	private int endValue;
	private grammer.bridgeOnlineBidding.com.bridgeTok1 type;
	private grammer.bridgeOnlineBidding.com.bridgeTok1 suit;
	private grammer.bridgeOnlineBidding.com.bridgeTok1 card;
	private static grammer.bridgeOnlineBidding.com.bridgeTokens1[] nextTokens ={grammer.bridgeOnlineBidding.com.bridgeTokens1.END
								,grammer.bridgeOnlineBidding.com.bridgeTokens1.LEFT_PAR
								,grammer.bridgeOnlineBidding.com.bridgeTokens1.OR
								,grammer.bridgeOnlineBidding.com.bridgeTokens1.AND
								};
			
	
	
	public bridgeRuleNode(grammer.bridgeOnlineBidding.com.bridgeTokenHold tokens) throws bridgeParseException
	{
		this.setTrueFlag(true);
		this.setBeginValue(-1);
		this.setEndValue(this.getBeginValue());
		this.setType(null);
		this.setCard(null);
		this.setSuit(null);
		this.parse(tokens);
	}
	private void parse(bridgeTokenHold tokens) throws bridgeParseException {
		// TODO Auto-generated method stub
		grammer.bridgeOnlineBidding.com.bridgeTok1 tok;
		tok=tokens.getCurrTok();
		if(tok.isTok(grammer.bridgeOnlineBidding.com.bridgeTok1.exclame()))
		{
			this.setTrueFlag(false);
			tokens.next();
			tokens.ignoreTokens();
			tok=tokens.getCurrTok();
			
			
		}
		switch(tok.getTok())
		{
		case TOTAL_POINTS: this.parseTotalPoints();
				break;
		case CARD: this.parseCards();
		          break;
		case SUIT: this.parseSuit();
		       break;
		case COUNT:this.parseCount();
		      break;
		default:grammer.bridgeOnlineBidding.com.bridgeTok1.throwTokens("PARSE NODE parse", tok.getTok(), grammer.bridgeOnlineBidding.com.bridgeTok1.nodeTypes());
			break;
		}
		
		
	}
	private void parseCount() {
		// TODO Auto-generated method stub
		
	}
	private void parseSuit() {
		// TODO Auto-generated method stub
		
	}
	private void parseCards() {
		// TODO Auto-generated method stub
		
	}
	private void parseTotalPoints() {
		// TODO Auto-generated method stub
		
	}
	public boolean isTrueFlag() {
		return trueFlag;
	}
	public void setTrueFlag(boolean trueFlag) {
		this.trueFlag = trueFlag;
	}
	public int getBeginValue() {
		return beginValue;
	}
	public void setBeginValue(int beginValue) {
		this.beginValue = beginValue;
	}
	public int getEndValue() {
		return endValue;
	}
	public void setEndValue(int endValue) {
		this.endValue = endValue;
	}
	public grammer.bridgeOnlineBidding.com.bridgeTok1 getType() {
		return type;
	}
	public void setType(grammer.bridgeOnlineBidding.com.bridgeTok1 type) {
		this.type = type;
	}
	public grammer.bridgeOnlineBidding.com.bridgeTok1 getSuit() {
		return suit;
	}
	public void setSuit(grammer.bridgeOnlineBidding.com.bridgeTok1 suit) {
		this.suit = suit;
	}
	public grammer.bridgeOnlineBidding.com.bridgeTok1 getCard() {
		return card;
	}
	public void setCard(grammer.bridgeOnlineBidding.com.bridgeTok1 card) {
		this.card = card;
	}
	public static grammer.bridgeOnlineBidding.com.bridgeTokens1[] getNextTokens() {
		return nextTokens;
	}
	public static void setNextTokens(grammer.bridgeOnlineBidding.com.bridgeTokens1[] nextTokens) {
		bridgeRuleNode.nextTokens = nextTokens;
	}

	
	

}
