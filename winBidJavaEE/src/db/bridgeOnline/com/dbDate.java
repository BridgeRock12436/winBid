package db.bridgeOnline.com;

import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class dbDate extends dbField {
     private Calendar cal;
     private String inputFormat;
     private String outputFormat;
     public dbDate()
     {
    	 this.setCal(Calendar.getInstance());
    	 this.setInputFormat("YYYY-MM-dd H:mm:ss");
    	 this.setOutputFormat("mm/dd/YYYY");
     }
     public String sqlData()
 	{
 		return this.getData();
 	}
	public Calendar getCal() {
		return cal;
	}
	public void setCal(Calendar cal) {
		this.cal = cal;
	}
	public String getInputFormat() {
		return inputFormat;
	}
	public void setInputFormat(String inputFormat) {
		this.inputFormat = inputFormat;
	}
	public String getOutputFormat() {
		return outputFormat;
	}
	public void setOutputFormat(String outputFormat) {
		this.outputFormat = outputFormat;
	}
	public void setData(String argData) throws ParseException
	{
		 SimpleDateFormat dateFormatter = new SimpleDateFormat(this.getInputFormat());
		 Date aDate;
		 aDate=dateFormatter.parse(argData);
		 this.getCal().setTime(aDate);
		 
	}
	public void setData(ResultSet rs,int colIndex) throws SQLException, ParseException
	{
		String dS;
		dS=rs.getString(colIndex);
		this.setData(dS);
	}
	public String getData()
	{
		SimpleDateFormat dateFormatter = new SimpleDateFormat(this.getOutputFormat());
		Date dt;
		dt=this.getCal().getTime();
		String ret;
		ret=dateFormatter.format(dt);
		return ret;
	}
}
