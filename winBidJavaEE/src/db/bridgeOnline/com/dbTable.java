package db.bridgeOnline.com;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;

public class dbTable {
	private String tableName;
	private db dbObj;
	private dbMeta metaObj;
	private String ignoreColumns;
	private String selectClause;
	private String whereClause;
	private String orderClause;
	private int rowCount;
	private int rowIndex;
	private dbRow[] rows;
	
	public dbTable(db argDbObj,String argTableName) throws SQLException, ClassNotFoundException, ParseException
	{
		this.setDbObj(argDbObj);
		this.setTableName(argTableName);
		this.makeMetaObj();
		this.init();
	}
	private void init() throws SQLException
	{
		
		
		this.setIgnoreColumns("rowid,addedBy,addedDate,modifiedBy,modifiedDate");
		this.setWhereClause("");
		this.setOrderClause("");
		this.buildSelectString();
		
		
	}
	protected void makeMetaObj() throws SQLException, ClassNotFoundException, ParseException
	{
		this.setMetaObj(new dbMeta(this.getDbObj(),this.getTableName()));
	}
	
	private void buildSelectString() {
		// TODO Auto-generated method stub
		String selS;
		String pre;
		int i,ct,dataPos;
		dbColumn colFld;
		ct=this.getMetaObj().getColumnCount();
		selS="";
		pre="";
		dataPos=0;
		for(i=0;i<ct;i++)
		{
			colFld=this.getMetaObj().retColumnObj(i);
			if(this.ignoreColumn(colFld.getCOLUMN_NAME()))
			{
				continue;
			}
			colFld.setDataPos(dataPos);
			dataPos++;
			selS+=pre+colFld.getCOLUMN_NAME();
			pre=",";
		}
		this.setSelectClause(selS);
		
	}
	public void  query() throws SQLException, ParseException, ClassNotFoundException
	{
		String ctQry;
		ctQry=retSqlPart("SELECT","count(*)");
		ctQry+=retSqlPart("FROM",this.getTableName());
		ctQry+=retSqlPart("WHERE",this.getWhereClause());
		ResultSet ctRs;
		ctRs=this.getDbObj().runSql(ctQry);
		int numRows;
		ctRs.next();
		numRows=ctRs.getInt(1);
		this.setRowCount(numRows);
		String qryS;
		qryS=retSqlPart("SELECT",this.getSelectClause());
		qryS+=retSqlPart("FROM",this.getTableName());
		qryS+=retSqlPart("WHERE",this.getWhereClause());
		qryS+=retSqlPart("ORDER BY",this.getOrderClause());
		ResultSet rsQ;
		rsQ=this.getDbObj().runSql(qryS);
		dbRow [] rowA;
		dbRow allocRow;
		int i;
		rowA=new dbRow[numRows];
		for(i=0;i<numRows;i++)
		{
			rsQ.next();
			allocRow=new dbRow(this.getMetaObj(),rsQ);
			rowA[i]=allocRow;
			
		}
		this.setRows(rowA);
		this.setRowIndex(0);
		
		
		
		
		
		
	}
	public void initList()
	{
		this.setRowIndex(0);
	}
	public boolean hasNext()
	{
		if(this.getRowIndex() < this.getRowCount())
		{
			return true;
		}
		return false;
	}
	public dbRow curr()
	{
		dbRow ret;
		ret=this.getRows()[this.getRowIndex()];
		return ret;	 

			
		
	}
	public int insert(meta metaObj,row rw) throws ClassNotFoundException, SQLException
	{
		String ins,pre;
		dbColumn colObj;
		dbField fldObj;
		int i,ct;
		int ret;
		ins="INSERT INTO "+this.getTableName();
		ins+=" (";
		pre="";
		ct=metaObj.getColumnCount();
		for(i=0;i<ct;i++)
		{
			colObj=metaObj.retColumnObj(i);
			ins+=pre+colObj.getCOLUMN_NAME();
			pre=",";
		}
		
		ins+=pre+"addedBy";
		ins+=pre+"addedDate";
		
		ins+=") VALUES (";
		pre="";
		for(i=0;i<ct;i++)
		{
			fldObj=rw.getField(i);
			ins+=pre+fldObj.sqlData();
			pre=",";
		}
		ins+=pre+"'"+this.getDbObj().getUserName()+"'";
		ins+=pre+"CURRENT_TIMESTAMP";
		ins+=")";
		ret=this.getDbObj().runUpdateSql(ins);
		return ret;
	}
	public dbRow next()
	{
		dbRow ret;
		if(this.hasNext())
		{
			 ret=this.getRows()[this.getRowIndex()];
			 this.setRowIndex(this.getRowIndex()+1);
			 return ret;
			
		}
		return null;
	}
	protected static String retSqlPart(String argType,String argStr)
	{
		if(argStr.length() == 0) return "";
		return " " +argType+" "+argStr;
		
	}
	private boolean ignoreColumn(String column_NAME) {
		// TODO Auto-generated method stub
		String []ar;
		ar=this.getIgnoreColumns().split(",");
		for(String cn : ar)
		{
			if(cn.equalsIgnoreCase(column_NAME))
			{
				return true;
			}
		}
		return false;
	}
	public String ignoreSqlColumns()
	{
		String ret,pre;
		String [] ar;
		ret="";
		pre="";
		ar=this.getIgnoreColumns().split(",");
		for(String cn : ar)
		{
			ret+=pre+"'"+cn+"'";
			pre=",";
		}
		return ret;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public db getDbObj() {
		return dbObj;
	}
	public void setDbObj(db dbObj) {
		this.dbObj = dbObj;
	}
	public dbMeta getMetaObj() {
		return metaObj;
	}
	public void setMetaObj(dbMeta metaObj) {
		this.metaObj = metaObj;
	}

	public String getIgnoreColumns() {
		return ignoreColumns;
	}
	public void setIgnoreColumns(String ignoreColumns) {
		this.ignoreColumns = ignoreColumns;
	}
	public String getSelectClause() {
		return selectClause;
	}
	public void setSelectClause(String selectClause) {
		this.selectClause = selectClause;
	}
	public String getWhereClause() {
		return whereClause;
	}
	public void setWhereClause(String whereClause) {
		this.whereClause = whereClause;
	}
	public String getOrderClause() {
		return orderClause;
	}
	public void setOrderClause(String orderClause) {
		this.orderClause = orderClause;
	}
	public int getRowCount() {
		return rowCount;
	}
	public void setRowCount(int rowCount) {
		this.rowCount = rowCount;
	}
	public int getRowIndex() {
		return rowIndex;
	}
	public void setRowIndex(int rowIndex) {
		this.rowIndex = rowIndex;
	}
	public dbRow[] getRows() {
		return rows;
	}
	public void setRows(dbRow[] rows) {
		this.rows = rows;
	}
	

}
