package db.bridgeOnline.com;

import java.sql.SQLException;
import java.text.ParseException;

public class dbAllTable extends dbTable {

	public dbAllTable(db argDbObj, String argTableName) throws SQLException, ClassNotFoundException, ParseException {
		super(argDbObj, argTableName);
		// TODO Auto-generated constructor stub
	}
	protected void makeMetaObj() throws SQLException
	{
		this.setMetaObj(new dbAllMeta(this.getDbObj()));
		
	}
	public void setWhereClause(String tableName)
	{
		String w;
		w="Table_name ='"+tableName+"'";
		if(this.getIgnoreColumns().length() > 0)
		{
			w+=" AND COLUMN_NAME not in ("+this.ignoreSqlColumns()+")";
		}
		super.setWhereClause(w);
	}

}
