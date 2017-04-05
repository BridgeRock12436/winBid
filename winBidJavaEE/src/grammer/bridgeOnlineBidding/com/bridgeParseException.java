package grammer.bridgeOnlineBidding.com;

public class bridgeParseException extends Exception {

	private int errorCode;
	private String userId;
	private static final long serialVersionUID = 1L;

	public bridgeParseException () {
		// TODO Auto-generated constructor stub
	}

	public bridgeParseException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public bridgeParseException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public bridgeParseException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}
	/*public String getMessage()
	{
		String ret;
		String supRet;
		supRet=super.getMessage();
		ret=supRet+"("+this.getErrorCode()+")";
		return ret;
		
	}*/

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
