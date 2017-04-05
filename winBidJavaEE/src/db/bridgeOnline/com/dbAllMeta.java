package db.bridgeOnline.com;

import java.sql.SQLException;
import java.text.ParseException;

public class dbAllMeta extends dbMeta {

	public dbAllMeta(db argDbObj, String argTableName) throws SQLException, ClassNotFoundException, ParseException {
		super(argDbObj, argTableName);
		// TODO Auto-generated constructor stub
	}
	public dbAllMeta(db argDbObj) throws SQLException
	{
		super(argDbObj);
		this.setTableName("All_Table_View");
		this.setColumnCount(9);
		this.setColA(this.makeColumns());
		
	}
	protected dbColumn[] makeColumns() throws SQLException {
		// TODO Auto-generated method stub
		dbColumn alloc;
		dbColumn []ar;
		ar=new dbColumn[this.getColumnCount()];
		alloc=new dbColumn("TABLE_TYPE"
							,"VARCHAR"
							,1
							,"VIEW"
							,"NO"
							,64);
		ar[0]=alloc;
		alloc=new dbColumn("TABLE_SCHEMA"
							,"VARCHAR"
							,2
							,""
							,"NO"
							,64);
		ar[1]=alloc;
		alloc=new dbColumn("TABLE_NAME"
							,"VARCHAR"
							,3
							,""
							,"NO"
							,64);
		ar[2]=alloc;
		alloc=new dbColumn("COLUMN_NAME"
							,"VARCHAR"
							,4
							,""
							,"NO"
							,64);
		ar[3]=alloc;
		alloc=new dbColumn("DATA_TYPE"
				,"VARCHAR"
				,5
				,""
				,"NO"
				,64);
		ar[4]=alloc;
		alloc=new dbColumn("ORDINAL_POSITION"
				,"INT"
				,6
				,""
				,"NO"
				,0);
		ar[5]=alloc;

		alloc=new dbColumn("COLUMN_DEFAULT"
				,"VARCHAR"
				,7
				,""
				,"NO"
				,1000);
		ar[6]=alloc;
		alloc=new dbColumn("IS_NULLABLE"
				,"VARCHAR"
				,8
				,""
				,"NO"
				,64);
		ar[7]=alloc;
		alloc=new dbColumn("CHARACTER_MAXIMUM_LENGTH"
				,"INT"
				,9
				,""
				,"NO"
				,64);
		ar[8]=alloc;
				
		
		return ar;
	}

}
