package com.bridgeOnlineBidding.com;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;

public class runInsertBridgeTok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		db.bridgeOnline.com.macBobUserDbVar mDbVarObj;
		db.bridgeOnline.com.db dbObj;
		db.bridgeOnline.com.dbTable dbTableObj;
		String tableName="bridgeTokens";
		mDbVarObj=new db.bridgeOnline.com.macBobUserDbVar();
		dbObj=new db.bridgeOnline.com.db(mDbVarObj);
		db.bridgeOnline.com.dbAllTable dbAllTable;
		dbAllTable=null;
		
		try {
			dbAllTable=new db.bridgeOnline.com.dbAllTable(dbObj, "ALL_TABLE_VIEW");
			dbAllTable.setWhereClause("bridgeTokens");
			dbAllTable.query();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ResultSet rs;
		
		String sqlS="select * from bridgeTokens";
		try {
			dbObj.connectDb();
			dbTableObj=new db.bridgeOnline.com.dbTable(dbObj, tableName);
			dbTableObj.query();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
