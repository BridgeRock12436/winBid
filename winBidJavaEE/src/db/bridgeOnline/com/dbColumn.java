package db.bridgeOnline.com;

import java.sql.ResultSet;
import java.sql.SQLException;

public class dbColumn {
	private String COLUMN_NAME;
	private String DATA_TYPE;
	private int ORDINAL_POSITION;
	private String COLUMN_DEFAULT;
	private String IS_NULLABLE;
	private int CHARACTER_MAXIMUM_LENGTH;
	private int dataPos;
	public dbColumn(dbRow rs) throws SQLException
	{
		this.setCOLUMN_NAME(rs);
		this.setDATA_TYPE(rs);
		this.setORDINAL_POSITION(rs);
		this.setCOLUMN_DEFAULT(rs);
		this.setIS_NULLABLE(rs);
		this.setCHARACTER_MAXIMUM_LENGTH(rs);
		this.setDataPos(-1);
	}
	public dbColumn(dbColumn columnObj)
	{
		this.setCOLUMN_NAME(columnObj.getCOLUMN_NAME());
		this.setCOLUMN_DEFAULT(columnObj.getCOLUMN_DEFAULT());
		this.setDATA_TYPE(columnObj.getDATA_TYPE());
		this.setORDINAL_POSITION(columnObj.getORDINAL_POSITION());
		this.setCHARACTER_MAXIMUM_LENGTH(columnObj.getCHARACTER_MAXIMUM_LENGTH());
		this.setIS_NULLABLE(columnObj.getIS_NULLABLE());
		this.setDataPos(columnObj.getDataPos());
	}
	public dbColumn(String argColumnName
			,String argDataType
			,int argPosition
			,String argColumnDefault
			,String argNullable
			,int argLength
			)
	{
		this.setCOLUMN_NAME(argColumnName);
		this.setDATA_TYPE(argDataType);
		this.setORDINAL_POSITION(argPosition);
		this.setCOLUMN_DEFAULT(argColumnDefault);
		this.setIS_NULLABLE(argNullable);
		this.setCHARACTER_MAXIMUM_LENGTH(argLength);
		this.setDataPos(-1);
		
	}
	public String getCOLUMN_NAME() {
		return COLUMN_NAME;
	}
	public void setIS_NULLABLE(dbRow rw) {
		dbField fld;
		fld=(dbField) rw.getField(7);
		this.setIS_NULLABLE(fld.getData());
	}
	public void setCOLUMN_DEFAULT(dbRow rw) {
		dbField fld;
		fld=(dbField) rw.getField(6);
		this.setCOLUMN_DEFAULT(fld.getData());
	}
	public void setDATA_TYPE(dbRow rw) {
		dbField fld;
		fld=(dbField) rw.getField(4);
		this.setDATA_TYPE(fld.getData());
	}
	public void setCOLUMN_NAME(dbRow rw) {
		dbField fld;
		fld=(dbField) rw.getField(3);
		this.setCOLUMN_NAME(fld.getData());
	}
	public void setCOLUMN_NAME(String cOLUMN_NAME) {
		COLUMN_NAME = cOLUMN_NAME;
	}
	public String getDATA_TYPE() {
		return DATA_TYPE;
	}
	public void setDATA_TYPE(String dATA_TYPE) {
		DATA_TYPE = dATA_TYPE;
	}
	public int getORDINAL_POSITION() {
		return ORDINAL_POSITION;
	}
	public void setORDINAL_POSITION(dbRow rw) {
		dbInt fld;
		fld=(dbInt) rw.getField(5);
		this.setORDINAL_POSITION(fld.getIdata());
		
	}
	public void setCHARACTER_MAXIMUM_LENGTH(dbRow rw) {
		dbInt fld;
		fld=(dbInt) rw.getField(8);
		this.setCHARACTER_MAXIMUM_LENGTH(fld.getIdata());
		
	}
	public void setORDINAL_POSITION(int oRDINAL_POSITION) {
		ORDINAL_POSITION = oRDINAL_POSITION;
	}
	public String getCOLUMN_DEFAULT() {
		return COLUMN_DEFAULT;
	}
	public void setCOLUMN_DEFAULT(String cOLUMN_DEFAULT) {
		COLUMN_DEFAULT = cOLUMN_DEFAULT;
	}
	public String getIS_NULLABLE() {
		return IS_NULLABLE;
	}
	public void setIS_NULLABLE(String iS_NULLABLE) {
		IS_NULLABLE = iS_NULLABLE;
	}
	public int getCHARACTER_MAXIMUM_LENGTH() {
		return CHARACTER_MAXIMUM_LENGTH;
	}
	public void setCHARACTER_MAXIMUM_LENGTH(int cHARACTER_MAXIMUM_LENGTH) {
		CHARACTER_MAXIMUM_LENGTH = cHARACTER_MAXIMUM_LENGTH;
	}
	public int getDataPos() {
		return dataPos;
	}
	public void setDataPos(int dataPos) {
		this.dataPos = dataPos;
	}
	public boolean equalsIgnoreCase(String columnName) {
		// TODO Auto-generated method stub
		String nm;
		nm=this.getCOLUMN_NAME();
		return nm.equalsIgnoreCase(columnName);
	}
	public String retColumnDataType() {
		// TODO Auto-generated method stub
		String ret;
		ret=this.getDATA_TYPE();
		if(this.getDATA_TYPE().equalsIgnoreCase("VARCHAR"))
		{
			ret+=" ("+this.getCHARACTER_MAXIMUM_LENGTH()+")";
		}
		return ret;
	}
	

}
