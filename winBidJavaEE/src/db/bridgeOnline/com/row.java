package db.bridgeOnline.com;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;

public class row {
	private dbField [] dbFA;
	private meta metaObj;
	public row(meta metaObj,ResultSet argRs) throws SQLException, ParseException
	{
		dbField [] fA;
		dbField allocField;
		dbColumn colField;
		int dataPos;
		int i,ct;
		this.setMetaObj(metaObj);
		ct=metaObj.getColumnCount();
		fA=new dbField[ct];
		for(i=0;i<ct;i++)
		{
			colField=metaObj.retColumnObj(i);
			dataPos=colField.getDataPos();
			if(dataPos < 0) continue;
			allocField=dbField.newInstance(colField.getDATA_TYPE());
			allocField.setData(argRs, dataPos+1);
			fA[i]=allocField;
		}
		this.setDbFA(fA);
	}
	public row(meta metaObj,String [] argData) throws ParseException
	{
		this.setMetaObj(metaObj);
		this.makeFa(metaObj, argData);
	}
	public void makeFa(meta metaObj,String [] argData) throws ParseException
	{
		dbField [] fA;
		dbField allocField;
		dbColumn colField;
		int dataPos;
		int i,ct;
		ct=metaObj.getColumnCount();
		fA=new dbField[ct];
		for(i=0;i<ct;i++)
		{
			colField=metaObj.retColumnObj(i);
			dataPos=colField.getDataPos();
			if(dataPos < 0) continue;
			allocField=dbField.newInstance(colField.getDATA_TYPE());
			allocField.setData(argData[dataPos]);
			fA[i]=allocField;
		}
		this.setDbFA(fA);
	}
	public void setRow(meta metaObj,String [] argData) throws SQLException, ParseException
	{
		
		dbField dataField;
		dbColumn colField;
		int dataPos;
		int i,ct;
		ct=metaObj.getColumnCount();
	
		for(i=0;i<ct;i++)
		{
			colField=metaObj.retColumnObj(i);
			dataPos=colField.getDataPos();
			if(dataPos < 0) continue;
			dataField=this.getDbFA()[i];
			dataField.setData(argData[dataPos]);
			
		}
	}
	public dbField[] getDbFA() {
		return dbFA;
	}
	public void setDbFA(dbField[] dbFA) {
		this.dbFA = dbFA;
	}
	public dbField getField(int argColIndex) {
		// TODO Auto-generated method stub
		
		return this.getDbFA()[argColIndex];
	}
	public meta getMetaObj() {
		return metaObj;
	}
	public void setMetaObj(meta metaObj) {
		this.metaObj = metaObj;
	}

}
