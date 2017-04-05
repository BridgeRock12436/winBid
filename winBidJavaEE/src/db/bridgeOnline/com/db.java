package db.bridgeOnline.com;
import java.sql.*;


public class db {
	private dbVar varObj;
	private Connection conn;
	private String userName;
	
	
	
	public db(dbVar argVarObj)
	{
		this.setVarObj(argVarObj);
		this.setConn(null);
		this.setUserName(System.getenv("LOGNAME"));
	}


    public  void connectDb() throws ClassNotFoundException, SQLException
    {
    	String urlS;
    	Class.forName(this.getVarObj().getjClassName());
    	urlS=this.getVarObj().getUrl()+"/"+this.getVarObj().getDb();
    	Connection connL;
    	connL=DriverManager.getConnection(urlS,this.getVarObj().getUser(),this.getVarObj().getPasswd());
    	if(connL != null)
    	{
    		
    		this.setConn(connL);
    	}
    	
    }
    public ResultSet runSql(String argSql) throws SQLException, ClassNotFoundException
    {
    	Statement stmt;
    	ResultSet rs;
    	if(this.getConn() == null)
    	{
    		this.connectDb();
    	}
    	stmt=this.getConn().createStatement();
    	rs=stmt.executeQuery(argSql);
    	return rs;
    	
    }
	public dbVar getVarObj() {
		return varObj;
	}



	public void setVarObj(dbVar varObj) {
		this.varObj = varObj;
	}



	public Connection getConn() {
		return conn;
	}



	public void setConn(Connection conn) {
		this.conn = conn;
	}


	public int runUpdateSql(String argSql) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Statement stmt;
    	int rs;
    	if(this.getConn() == null)
    	{
    		this.connectDb();
    	}
    	stmt=this.getConn().createStatement();
    	rs=stmt.executeUpdate(argSql);
    	return rs;
		
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}

}
