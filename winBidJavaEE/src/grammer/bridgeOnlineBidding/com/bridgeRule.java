package grammer.bridgeOnlineBidding.com;

import java.io.IOException;

public class bridgeRule {
	private grammer.bridgeOnlineBidding.com.bridgeTokenHold tokenHold;
	private grammer.bridgeOnlineBidding.com.bridgeRule leftPar;
	private grammer.bridgeOnlineBidding.com.bridgeRule namePar;
	private grammer.bridgeOnlineBidding.com.bridgeRule orPar;
	private grammer.bridgeOnlineBidding.com.bridgeRule andPar;
	private grammer.bridgeOnlineBidding.com.bridgeRuleNode ruleNode;
	public bridgeRule(grammer.bridgeOnlineBidding.com.bridgeCom comObj,String argTokenString) throws bridgeParseException, IOException
	{
		grammer.bridgeOnlineBidding.com.bridgeTokenHold alloc;
		alloc=new grammer.bridgeOnlineBidding.com.bridgeTokenHold(comObj, argTokenString);
		alloc.next();
		this.setTokenHold(alloc);
		this.init();
		this.parse();
		
	}
	private void init()
	{
		
		this.setAndPar(null);
		this.setLeftPar(null);
		this.setOrPar(null);
		this.setNamePar(null);
		this.setRuleNode(null);
	}
		
		private int parse() throws bridgeParseException {
		// TODO Auto-generated method stub
			grammer.bridgeOnlineBidding.com.bridgeTok1 tk;
			tk=this.getTokenHold().getCurrTok();
			switch(tk.getTok())
			{
				case END: return 0;
				case LEFT_PAR: return 0;
				case EXCLAMATION:
						this.parseExclame();
						break;
				default:grammer.bridgeOnlineBidding.com.bridgeTok1.throwTokens("Bridge Rule parse", tk.getTok(), grammer.bridgeOnlineBidding.com.bridgeTok1.mainTypes());
				break;
			}
			if(tk.isTok(grammer.bridgeOnlineBidding.com.bridgeTokens1.END))
			{
				return 0;
				
			}
			
			return 0;
		
		
	}
	private void parseExclame() throws bridgeParseException {
			// TODO Auto-generated method stub
			grammer.bridgeOnlineBidding.com.bridgeRuleNode alloc;
			alloc=new grammer.bridgeOnlineBidding.com.bridgeRuleNode(this.getTokenHold());
			this.setRuleNode(alloc);
			
			
		}
	public grammer.bridgeOnlineBidding.com.bridgeTokenHold getTokenHold() {
		return tokenHold;
	}
	public void setTokenHold(grammer.bridgeOnlineBidding.com.bridgeTokenHold tokenHold) {
		this.tokenHold = tokenHold;
	}
	public grammer.bridgeOnlineBidding.com.bridgeRule getLeftPar() {
		return leftPar;
	}
	public void setLeftPar(grammer.bridgeOnlineBidding.com.bridgeRule leftPar) {
		this.leftPar = leftPar;
	}
	public grammer.bridgeOnlineBidding.com.bridgeRule getNamePar() {
		return namePar;
	}
	public void setNamePar(grammer.bridgeOnlineBidding.com.bridgeRule namePar) {
		this.namePar = namePar;
	}
	public grammer.bridgeOnlineBidding.com.bridgeRule getOrPar() {
		return orPar;
	}
	public void setOrPar(grammer.bridgeOnlineBidding.com.bridgeRule orPar) {
		this.orPar = orPar;
	}
	public grammer.bridgeOnlineBidding.com.bridgeRule getAndPar() {
		return andPar;
	}
	public void setAndPar(grammer.bridgeOnlineBidding.com.bridgeRule andPar) {
		this.andPar = andPar;
	}
	public grammer.bridgeOnlineBidding.com.bridgeRuleNode getRuleNode() {
		return ruleNode;
	}
	public void setRuleNode(grammer.bridgeOnlineBidding.com.bridgeRuleNode ruleNode) {
		this.ruleNode = ruleNode;
	}

}

	