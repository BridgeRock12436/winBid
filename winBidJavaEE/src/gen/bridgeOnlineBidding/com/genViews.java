package gen.bridgeOnlineBidding.com;

import java.io.BufferedWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

import db.bridgeOnline.com.db;
import db.bridgeOnline.com.dbColumn;

public class genViews extends gen {

	public genViews(String tableName, db dbObj)
			throws IOException, ClassNotFoundException, SQLException, ParseException {
		super(tableName, dbObj, "VIEW");
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
		wrS="\tSELECT";
		bufW.write(wrS);
		bufW.newLine();
		
		pre="";
		for(i=0;i<ct;i++)
		{
			colObj=colA[i];
			wrS="\t\t\t"+pre+colObj.getCOLUMN_NAME();
			bufW.write(wrS);
			bufW.newLine();
			pre=",";
		}
		
		wrS="\tFROM `"+this.getDbObj().getVarObj().getDb()+"`.`"+this.getTableName()+"`";
		bufW.write(wrS);
		bufW.newLine();
		bufW.write(gen.getDelim());
		bufW.newLine();
	}
	public  void printArgColumns() throws IOException {
		// TODO Auto-generated method stub
		String wrS;
		wrS=" AS";
		this.getBufW().write(wrS);
		this.getBufW().newLine();
		
		
	}
}
