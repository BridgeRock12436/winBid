package gen.bridgeOnlineBidding.com;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

public class gen {
	private String tableName;
	private String objectName;
	private BufferedWriter bufW;
	private db.bridgeOnline.com.dbTable dbTblObj;
	private db.bridgeOnline.com.db dbObj;
	private String fileName;
	private static String delim="//";
	private String type;
	
	
	public gen(String tableName,db.bridgeOnline.com.db dbObj,String argType) throws IOException, ClassNotFoundException, SQLException, ParseException {
		this.setDbObj(dbObj);
		this.setTableName(tableName);
		this.setType(argType);
		this.initVariables();
		this.printDelimiter();
		this.printUseDb();
		this.printDropStatement();
		this.printCreateStatement();
		this.printArgColumns();
		this.printStatementBody();
		this.close();
		
	}
	private void close() throws IOException {
		// TODO Auto-generated method stub
		this.getBufW().close();
		
	}
	public void printStatementBody() throws IOException {
		// TODO Auto-generated method stub
		
	}
	public void printArgColumns() throws IOException {
		// TODO Auto-generated method stub
		String wrS;
		wrS="(";
		this.getBufW().write(wrS);
		this.getBufW().newLine();
		wrS=")";
		this.getBufW().write(wrS);
		this.getBufW().newLine();
	}
	private void printCreateStatement() throws IOException {
		// TODO Auto-generated method stub
		String wrS;
		wrS="CREATE DEFINER=`BobAdmin`@`localhost` "+this.getType()+" `"+this.getObjectName()+"` ";
		this.getBufW().write(wrS);
		this.getBufW().newLine();
		
	}
	private void printDropStatement() throws IOException {
		// TODO Auto-generated method stub
		String wrS;
		wrS="drop "+this.getType()+" "+this.getDbObj().getVarObj().getDb()+"."+this.getObjectName();
		this.getBufW().write(wrS);
		this.getBufW().newLine();
		this.getBufW().newLine();
		this.getBufW().write(gen.getDelim());
		this.getBufW().newLine();
		this.getBufW().newLine();
		
	}
	private void printUseDb() throws IOException {
		// TODO Auto-generated method stub
		String wrS;
		wrS="use "+this.getDbObj().getVarObj().getDb();
		this.getBufW().write(wrS);
		this.getBufW().newLine();
		this.getBufW().newLine();
		this.getBufW().write(gen.getDelim());
		this.getBufW().newLine();
		this.getBufW().newLine();
		
	}
	private void printDelimiter() throws IOException {
		// TODO Auto-generated method stub
		String wrS;
		wrS="DELIMITER "+gen.getDelim();
		this.getBufW().write(wrS);
		this.getBufW().newLine();
		
	}
	private void initVariables() throws IOException, ClassNotFoundException, SQLException, ParseException {
		// TODO Auto-generated method stub
		String filn;
		this.setObjectName(this.getTableName()+this.getSuffix());
		filn=this.getObjectName()+".sql";
		this.setFileName(filn);
		FileWriter flW;
		flW=new FileWriter(this.getFileName());
		this.setBufW(new BufferedWriter(flW));
		this.setDbTblObj(new db.bridgeOnline.com.dbTable(this.getDbObj(), this.getTableName()));
		
		
		
	}
	private String getSuffix() {
		// TODO Auto-generated method stub
		if(this.getType().equalsIgnoreCase("PROCEDURE")) return "_SP";
		if(this.getType().equalsIgnoreCase("VIEW")) return "_BASEVIEW_VW";
		return "NDF";
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public BufferedWriter getBufW() {
		return bufW;
	}
	public void setBufW(BufferedWriter bufW) {
		this.bufW = bufW;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public static String getDelim() {
		return delim;
	}
	public static void setDelim(String delim) {
		gen.delim = delim;
	}
	public db.bridgeOnline.com.dbTable getDbTblObj() {
		return dbTblObj;
	}
	public void setDbTblObj(db.bridgeOnline.com.dbTable dbTblObj) {
		this.dbTblObj = dbTblObj;
	}
	public db.bridgeOnline.com.db getDbObj() {
		return dbObj;
	}
	public void setDbObj(db.bridgeOnline.com.db dbObj) {
		this.dbObj = dbObj;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getObjectName() {
		return objectName;
	}
	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}

}
