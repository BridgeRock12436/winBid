package db.bridgeOnline.com;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;

public class dbMeta extends meta{
	private String tableType;
	private String tableSchema;
	private dbAllTable allTableObj;
	private String tableName;
	private db dbObj;
	private dbColumn [] colA;
	private int columnCount;
	private boolean valid;
	public dbMeta(db argDbObj,String argTableName) throws SQLException, ClassNotFoundException, ParseException
	{
		dbColumn [] retArr;
		this.setTableName(argTableName);
		this.setDbObj(argDbObj);
		this.setAllTableObj(new dbAllTable(this.getDbObj(),"ALL_TABLE_VIEW"));
		this.getAllTableObj().setWhereClause(this.getTableName());
		this.getAllTableObj().query();
		this.setColumnCount(this.getAllTableObj().getRowCount());
		retArr=this.makeColumns();
		this.setColA(retArr);
		this.setValid(true);
	}
	public dbMeta(db argDbObj)
	{
		this.setDbObj(argDbObj);
	}
	protected dbColumn[] makeColumns() throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		dbColumn alloc;
		dbColumn []ar;
		ar=new dbColumn[this.getColumnCount()];
		int i,ct;
		dbRow rs;
		
		ct=this.getColumnCount();
		for(i=0;i<ct;i++)
		{
			rs=this.getAllTableObj().curr();
			this.setTableType(rs.getField(0).getData());
			this.setTableSchema(rs.getField(1).getData());
			alloc=new dbColumn(rs);
			ar[i]=alloc;
			rs=this.getAllTableObj().next();
		}
		return ar;
		
	}
	private int makeColumnCount() throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		int colCount;
		ResultSet retRs;
		String ctQry;
		ctQry="select count(*) from ALL_TABLE_VIEW WHERE TABLE_NAME ='" +this.getTableName()+"'";
		
		
		retRs=this.getDbObj().runSql(ctQry);
		retRs.next();
		
		colCount=retRs.getInt(1);
		return colCount;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public dbColumn[] getColA() {
		return colA;
	}
	public void setColA(dbColumn[] colA) {
		this.colA = colA;
	}
	public int getColumnCount() {
		return columnCount;
	}
	public void setColumnCount(int columnCount) {
		this.columnCount = columnCount;
	}
	public boolean isValid() {
		return valid;
	}
	public void setValid(boolean valid) {
		this.valid = valid;
	}
	public db getDbObj() {
		return dbObj;
	}
	public void setDbObj(db dbObj) {
		this.dbObj = dbObj;
	}
	public String getTableType() {
		return tableType;
	}
	public void setTableType(String tableType) {
		this.tableType = tableType;
	}
	public String getTableSchema() {
		return tableSchema;
	}
	public void setTableSchema(String tableSchema) {
		this.tableSchema = tableSchema;
	}
	
	public dbAllTable getAllTableObj() {
		return allTableObj;
	}
	public void setAllTableObj(dbAllTable allTableObj) {
		this.allTableObj = allTableObj;
	}
	
}
