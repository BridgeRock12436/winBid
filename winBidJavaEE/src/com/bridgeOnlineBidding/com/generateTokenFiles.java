package com.bridgeOnlineBidding.com;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

public class generateTokenFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		grammer.bridgeOnlineBidding.com.bridgeWriteFileCom fileComObj;
		
		db.bridgeOnline.com.db dbObj;
		db.bridgeOnline.com.macBobUserDbVar varObj;
		db.bridgeOnline.com.dbTable dbTableObj;
		String  []line;
		fileComObj=null;
		varObj=new db.bridgeOnline.com.macBobUserDbVar();
		dbObj=new db.bridgeOnline.com.db(varObj);
		fileComObj=null;
		try {
			fileComObj=new grammer.bridgeOnlineBidding.com.bridgeWriteFileCom("data","bridgeTokens.java");
			fileComObj.writeln("package grammer.bridgeOnlineBidding.com;");
			fileComObj.writeln("");
			fileComObj.writeln("");
			fileComObj.writeln("");
			fileComObj.writeln("");
			
			fileComObj.writeln("public enum bridgeTokens {");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(-901);
		}
		
				
		dbTableObj=null;
		try {
			dbTableObj=new db.bridgeOnline.com.dbTable(dbObj, "bridgeTokens");
			dbTableObj.setOrderClause("tokenName");
			dbTableObj.query();
			db.bridgeOnline.com.dbRow rw;
			String oline;
			int colIndex;
			colIndex=dbTableObj.getMetaObj().findColumn("tokenName");
			int dataPos;
			String pre;
			pre="";
			db.bridgeOnline.com.dbField fldObj;
			dataPos=dbTableObj.getMetaObj().retColumnObj(colIndex).getDataPos();
			while(dbTableObj.hasNext())
			{
				rw=dbTableObj.next();
				fldObj=rw.getField(dataPos);
				oline="\t\t\t"+pre+fldObj.getData();
				fileComObj.writeln(oline);
				pre=",";
				
			}
			
		} catch (ClassNotFoundException | SQLException | ParseException | IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			System.exit(-900);
		}
		try {
			fileComObj.writeln("}");
			fileComObj.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
