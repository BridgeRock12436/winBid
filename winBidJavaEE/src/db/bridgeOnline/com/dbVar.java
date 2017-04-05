package db.bridgeOnline.com;

public class dbVar {
	private String jClassName;
	private String url;
	private String db;
	private String user;
	private String passwd;
	public dbVar()
	{
		this.setDb(null);
		this.setjClassName(null);
		this.setPasswd(null);
		this.setUrl(null);
		this.setUser(null);
	}
	public String getjClassName() {
		return jClassName;
	}
	public void setjClassName(String jClassName) {
		this.jClassName = jClassName;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDb() {
		return db;
	}
	public void setDb(String db) {
		this.db = db;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
}
