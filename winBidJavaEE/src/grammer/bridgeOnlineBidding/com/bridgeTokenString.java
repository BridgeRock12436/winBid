package grammer.bridgeOnlineBidding.com;

public class bridgeTokenString {

	private String tokS;
	private int index;
	private int len;
	public bridgeTokenString(String argTokenString)
	{
		this.setTokS(argTokenString);
		this.setIndex(0);
		this.setLen(this.getTokS().length());
	}
	 public boolean hasNext()
	    {
	    	if(this.getIndex()+1 < this.getLen()) return true;
	    	return false;
	    }
	    public boolean hasCurr()
	    {
	    	if(this.getIndex() < this.getLen()) return true;
	    	return false;
	    }
	    public String next()
	    {
	    	if(this.hasNext())
	    	{
	    		this.setIndex(this.getIndex()+1);
	    		return this.getTokS().substring(this.getIndex(), this.getIndex()+1);
	    	}
	    	this.setIndex(this.getIndex()+1);
	    	return "";
	    }
	    public String curr()
	    {
	    	if(this.hasCurr())
	    	{
	    		this.setIndex(this.getIndex());
	    		return this.getTokS().substring(this.getIndex(), this.getIndex()+1);
	    	}
	    	return "";
	    }
	public String getTokS() {
		return tokS;
	}
	public void setTokS(String tokS) {
		this.tokS = tokS;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public int getLen() {
		return len;
	}
	public void setLen(int len) {
		this.len = len;
	}

}
