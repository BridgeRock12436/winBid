package db.bridgeOnline.com;

import java.sql.ResultSet;
import java.sql.SQLException;

public class dbInt extends dbField {
	
	
	private int data;
	public dbInt()
	{
		
	}
	public String getData()
	{
		String ret;
		ret=String.valueOf(this.data);
		return ret;
	}
	public String sqlData()
	{
		return this.getData();
	}
	public int getIdata()
	{
		return this.data;
	}
	public void setData(String argData)
	{
		int i;
		i=Integer.valueOf(argData);
		this.setData(i);
	}
	public void setData(int argData)
	{
		this.data=argData;
	}
	public void setData(ResultSet rs,int colIndex) throws SQLException
	{
		this.setData(rs.getInt(colIndex));
	}

}
