package db.bridgeOnline.com;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;

public class dbField {
	private String data;
	public dbField()
	{
		
	}
	public String getData() {
		return data;
	}
	public String sqlData()
	{
		String s;
		s=this.getData().replaceAll("'","''");
		return "'"+s+"'";
	}
	public void setData(String data) throws ParseException {
		this.data = data;
	}
    public void setData(ResultSet rs,int colIndex) throws SQLException, ParseException
    {
    	this.setData(rs.getString(colIndex));
    }
    public static dbField newInstance(String argDataType)
    {
    /*	data_Type
    	varchar
    	bigint
    	longtext
    	datetime
    	int
    	tinyint
    	decimal
    	double
    	char
    	timestamp
    	set
    	enum
    	float
    	longblob
    	mediumtext
    	mediumblob
    	smallint
    	text
    	blob
    	time*/
    	dbField fld;
    	fld=null;
    	if(argDataType.equalsIgnoreCase("VARCHAR")) fld=new dbField();
    	if(argDataType.equalsIgnoreCase("BIGINT")) fld=new dbInt();
    	if(argDataType.equalsIgnoreCase("INT")) fld=new dbInt();
    	if(argDataType.equalsIgnoreCase("TINYINT")) fld=new dbInt();
    	if(argDataType.equalsIgnoreCase("SMALLINT")) fld=new dbInt();
    	if(argDataType.equalsIgnoreCase("DATETIME")) fld=new dbDate();
    	if(argDataType.equalsIgnoreCase("TIMESTAMP")) fld=new dbDate();
    	if(argDataType.equalsIgnoreCase("TIME")) fld=new dbDate();
    	if(argDataType.equalsIgnoreCase("DECIMAL")) fld=new dbDouble();
    	if(argDataType.equalsIgnoreCase("DOUBLE")) fld=new dbDouble();
    	if(argDataType.equalsIgnoreCase("FLOAT")) fld=new dbDouble();
    	if(argDataType.equalsIgnoreCase("LONGTEXT")) fld=new dbField();
    	if(argDataType.equalsIgnoreCase("CHAR")) fld=new dbField();
    	if(argDataType.equalsIgnoreCase("SET")) fld=new dbField();
    	if(argDataType.equalsIgnoreCase("ENUM")) fld=new dbField();
    	if(argDataType.equalsIgnoreCase("LONGBLOB")) fld=new dbField();
    	if(argDataType.equalsIgnoreCase("MEDIUMTEXT")) fld=new dbField();
    	if(argDataType.equalsIgnoreCase("MEDIUMBLOB")) fld=new dbField();
    	if(argDataType.equalsIgnoreCase("TEXT")) fld=new dbField();
    	if(argDataType.equalsIgnoreCase("BLOB")) fld=new dbField();
    	return fld;
    }
}
