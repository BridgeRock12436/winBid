package com.bridgeOnlineBidding.com;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.LinkedList;
import java.util.ListIterator;

public class runGenViews {

	public runGenViews() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		db.bridgeOnline.com.db dbObj;
		db.bridgeOnline.com.macBobUserDbVar varObj;
		db.bridgeOnline.com.dbTable dbTableObj=null;
		db.bridgeOnline.com.dbRow rw;
		gen.bridgeOnlineBidding.com.genViews allocObj;
		LinkedList<String> strL;
		ListIterator<String> listI;
		int i,numRows,tableNameIndex;
		String tblName;
		varObj=new db.bridgeOnline.com.macBobUserDbVar();
		dbObj=new db.bridgeOnline.com.db(varObj);
		strL=new LinkedList<String>();
		try {
			dbTableObj=new db.bridgeOnline.com.dbTable(dbObj, "table_name_view");
		} catch (ClassNotFoundException | SQLException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(-100);
		}
		tableNameIndex=dbTableObj.getMetaObj().findColumn("table_name");
		tableNameIndex=dbTableObj.getMetaObj().getColumn(tableNameIndex).getDataPos();
		dbTableObj.setWhereClause("TABLE_TYPE='BASE TABLE'");
		try {
			dbTableObj.query();
			while(dbTableObj.hasNext())
			{
				rw=dbTableObj.next();
				tblName=rw.getField(tableNameIndex).getData();
				strL.add(tblName);
			}
		} catch (ClassNotFoundException | SQLException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(-101);
		}
		
		listI=strL.listIterator();
		while(listI.hasNext())
		{
			tblName=listI.next();
			try {
				allocObj=new gen.bridgeOnlineBidding.com.genViews(tblName, dbObj);
			} catch (ClassNotFoundException | IOException | SQLException | ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.exit(-103);
			}
			
		}


	}

}
