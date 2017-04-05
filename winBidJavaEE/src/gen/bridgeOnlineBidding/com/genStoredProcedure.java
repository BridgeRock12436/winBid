package gen.bridgeOnlineBidding.com;

import java.io.BufferedWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

import db.bridgeOnline.com.db;
import db.bridgeOnline.com.dbColumn;

public class genStoredProcedure extends gen {

	public genStoredProcedure(String tableName, db dbObj)
			throws IOException, ClassNotFoundException, SQLException, ParseException {
		super(tableName, dbObj,"PROCEDURE");
		// TODO Auto-generated constructor stub
		
		
	}
	public void printStatementBody() throws IOException {
		// TODO Auto-generated method stub
		String wrS,pre;
		BufferedWriter bufW;
		int i,ct;
		dbColumn[] colA;
		dbColumn colObj;
		ct=this.getDbTblObj().getMetaObj().getColumnCount();
		colA=this.getDbTblObj().getMetaObj().getColA();
		bufW=this.getBufW();
		wrS="\tMODIFIES SQL DATA";
		bufW.write(wrS);
		bufW.newLine();
		wrS="BEGIN";
		bufW.write(wrS);
		bufW.newLine();
		wrS="\tDECLARE logName VARCHAR(10);";
		bufW.write(wrS);
		bufW.newLine();
		wrS="\tDECLARE action CHAR;";
		bufW.write(wrS);
		bufW.newLine();
		for(i=1;i<ct;i++)
		{
			colObj=colA[i];
			wrS="\tDECLARE "+colObj.getCOLUMN_NAME()+" " + colObj.retColumnDataType()+";";
			bufW.write(wrS);
			bufW.newLine();
		}
		bufW.newLine();
		bufW.newLine();
		wrS="\tset returnId=argId;";
		bufW.write(wrS);
		bufW.newLine();
		wrS="\tset logname=RTRIM(LTRIM(arglogname));";
		bufW.write(wrS);
		bufW.newLine();
		wrS="\tset action=argAction;";
		bufW.write(wrS);
		bufW.newLine();
		for(i=1;i<ct;i++)
		{
			colObj=colA[i];
			wrS="\tset "+ colObj.getCOLUMN_NAME()+"=";
			if(colObj.getDATA_TYPE().equalsIgnoreCase("VARCHAR"))
			{
				wrS+="RTRIM(LTRIM(arg"+ colObj.getCOLUMN_NAME()+"));";
			}
			else
			{
				wrS+="arg"+ colObj.getCOLUMN_NAME()+";";
			}
			bufW.write(wrS);
			bufW.newLine();
		}
		bufW.newLine();
		bufW.newLine();
		wrS="\tcase action ";
		bufW.write(wrS);
		bufW.newLine();
		bufW.newLine();
		wrS="\t\twhen 'I' then ";
		bufW.write(wrS);
		bufW.newLine();
		wrS="\t\t\tBEGIN";
		bufW.write(wrS);
		bufW.newLine();
		wrS="\t\t\t\tINSERT INTO "+this.getTableName() + " (";
		bufW.write(wrS);
		bufW.newLine();
		pre="";
		for(i=1;i<ct;i++)
		{
			colObj=colA[i];
			wrS="\t\t\t\t\t"+pre+colObj.getCOLUMN_NAME();
			bufW.write(wrS);
			bufW.newLine();
			pre=",";
		}
		wrS="\t\t\t\t\t"+pre+"addedBy";
		bufW.write(wrS);
		bufW.newLine();
		wrS="\t\t\t\t\t"+pre+"addedDate";
		bufW.write(wrS);
		bufW.newLine();
		wrS="\t\t\t\t\t) VALUES (";
		bufW.write(wrS);
		bufW.newLine();
		pre="";
		for(i=1;i<ct;i++)
		{
			colObj=colA[i];
			wrS="\t\t\t\t\t"+pre+colObj.getCOLUMN_NAME();
			bufW.write(wrS);
			bufW.newLine();
			pre=",";
		}
		wrS="\t\t\t\t\t"+pre+"logname";
		bufW.write(wrS);
		bufW.newLine();
		wrS="\t\t\t\t\t"+pre+"CURRENT_TIMESTAMP";
		bufW.write(wrS);
		bufW.newLine();
		wrS="\t\t\t\t\t);";
		bufW.write(wrS);
		bufW.newLine();
		wrS="\t\t\t\tset returnId=Last_Identity_Id();";
		bufW.write(wrS);
		bufW.newLine();
		wrS="\t\t\tEND;";
		bufW.write(wrS);
		bufW.newLine();
		bufW.newLine();
		wrS="\t\twhen 'D' then ";
		bufW.write(wrS);
		bufW.newLine();
		wrS="\t\t\tBEGIN";
		bufW.write(wrS);
		bufW.newLine();
		wrS="\t\t\t\tDELETE FROM "+this.getTableName() ;
		bufW.write(wrS);
		bufW.newLine();
		
		wrS="\t\t\t\tWHERE id=argId;";
		bufW.write(wrS);
		bufW.newLine();
		wrS="\t\t\tEND;";
		bufW.write(wrS);
		bufW.newLine();
		bufW.newLine();
		wrS="\t\twhen 'U' then ";
		bufW.write(wrS);
		bufW.newLine();
		wrS="\t\t\tBEGIN";
		bufW.write(wrS);
		bufW.newLine();
		wrS="\t\t\t\tUPDATE "+this.getTableName() + " SET";
		bufW.write(wrS);
		bufW.newLine();
		pre="";
		for(i=1;i<ct;i++)
		{
			colObj=colA[i];
			wrS="\t\t\t\t\t"+pre+colObj.getCOLUMN_NAME()+"="+colObj.getCOLUMN_NAME();
			bufW.write(wrS);
			bufW.newLine();
			pre=",";
		}
		wrS="\t\t\t\t\tWHERE id=argId;";
		bufW.write(wrS);
		bufW.newLine();
		wrS="\t\t\tEND;";
		bufW.write(wrS);
		bufW.newLine();
		bufW.newLine();
		wrS="\tEND CASE; ";
		bufW.write(wrS);
		bufW.newLine();
		bufW.newLine();
		wrS="END ";
		bufW.write(wrS);
		bufW.newLine();
		bufW.newLine();
		bufW.write(gen.getDelim());
		bufW.newLine();
		
	}
	public  void printArgColumns() throws IOException {
		// TODO Auto-generated method stub
		String wrS;
		wrS="(";
		this.getBufW().write(wrS);
		this.getBufW().newLine();
		
		wrS="\tOUT returnId INT";
		this.getBufW().write(wrS);
		this.getBufW().newLine();
		wrS="\t,IN arglogName VARCHAR(10)";
		this.getBufW().write(wrS);
		this.getBufW().newLine();
		wrS="\t,IN argAction CHAR";
		this.getBufW().write(wrS);
		this.getBufW().newLine();
		wrS="\t,IN argId INT";
		this.getBufW().write(wrS);
		this.getBufW().newLine();
		int i,ct;
		dbColumn[] colA;
		dbColumn colObj;
		ct=this.getDbTblObj().getMetaObj().getColumnCount();
		colA=this.getDbTblObj().getMetaObj().getColA();
		for(i=1;i<ct;i++)
		{
			colObj=colA[i];
			wrS="\t,IN arg"+colObj.getCOLUMN_NAME()+" " + colObj.retColumnDataType();
			this.getBufW().write(wrS);
			this.getBufW().newLine();
		}
		wrS=")";
		this.getBufW().write(wrS);
		this.getBufW().newLine();
		
	}

}
