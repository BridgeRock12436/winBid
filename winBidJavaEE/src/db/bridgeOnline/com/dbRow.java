package db.bridgeOnline.com;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;

public class dbRow extends row{
	
	
	public dbRow(dbMeta metaObj,ResultSet argRs) throws SQLException, ParseException
	{
		super(metaObj,argRs);
		
	}
	public dbRow(dbMeta metaObj,String [] argData) throws SQLException, ParseException
	{
		super(metaObj,argData);
	
	}
	
		
	public void setRow(dbMeta metaObj,String [] argData) throws SQLException, ParseException
	{
		super.setRow((meta) metaObj,argData);
		
	}




}
