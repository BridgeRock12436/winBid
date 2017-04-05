package db.bridgeOnline.com;

public class dbException extends Exception {
	private int errorCode;
	private String userId;
	private static final long serialVersionUID = 1L;
	public dbException(int errorCode,String errorMessage)
	{
		super(errorMessage);
		this.setErrorCode(errorCode);
	}
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
