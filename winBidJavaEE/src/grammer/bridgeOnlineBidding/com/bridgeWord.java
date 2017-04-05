package grammer.bridgeOnlineBidding.com;

public class bridgeWord {
	private String wd;
	private  grammer.bridgeOnlineBidding.com.bridgeTokens1 tok;
	public bridgeWord(String argWd,grammer.bridgeOnlineBidding.com.bridgeTokens1 argTok)
	{
		this.setWd(argWd);
		this.setTok(argTok);
	}

	public boolean equal(String argWOrd)
	{
		return this.getWd().equalsIgnoreCase(argWOrd);
	}
	 public boolean  equal(grammer.bridgeOnlineBidding.com.bridgeTokens1 tok)
	    {
	    	if(this.getTok() == tok) return true;
	    	return false;
	    }
	public String getWd() {
		return wd;
	}
	public void setWd(String wd) {
		this.wd = wd;
	}
	public grammer.bridgeOnlineBidding.com.bridgeTokens1 getTok() {
		return tok;
	}
	public void setTok(grammer.bridgeOnlineBidding.com.bridgeTokens1 tok) {
		this.tok = tok;
	}

}
