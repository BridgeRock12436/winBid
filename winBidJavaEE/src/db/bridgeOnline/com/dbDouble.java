package db.bridgeOnline.com;

import java.sql.ResultSet;
import java.sql.SQLException;

public class dbDouble extends dbField {
	private double data;
	public dbDouble()
	{
		
	}
	public String sqlData()
	{
		return this.getData();
	}
	public String getData()
	{
		String ret;
		ret=String.valueOf(this.data);
		return ret;
	}
	public double getDdata()
	{
		return this.data;
	}
	public void setData(String argData)
	{
		double i;
		i=Double.valueOf(argData);
		this.setData(i);
	}
	public void setData(double argData)
	{
		this.data=argData;
	}
	public void setData(ResultSet rs,int colIndex) throws SQLException
	{
		this.setData(rs.getDouble(colIndex));
	}


}
