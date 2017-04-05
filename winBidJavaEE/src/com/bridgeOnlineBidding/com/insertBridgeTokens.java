package com.bridgeOnlineBidding.com;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

import db.bridgeOnline.com.dbException;

public class insertBridgeTokens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		grammer.bridgeOnlineBidding.com.bridgeFileCom fileComObj;
		db.bridgeOnline.com.fileMeta flMetaObj;
		db.bridgeOnline.com.db dbObj;
		db.bridgeOnline.com.macBobUserDbVar varObj;
		db.bridgeOnline.com.dbTable dbTableObj;
		String  []line;
		fileComObj=null;
		varObj=new db.bridgeOnline.com.macBobUserDbVar();
		dbObj=new db.bridgeOnline.com.db(varObj);
		dbTableObj=null;
		try {
			dbTableObj=new db.bridgeOnline.com.dbTable(dbObj, "bridgeTokens");
		} catch (ClassNotFoundException | SQLException | ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			System.exit(-900);
		}
		try {
			fileComObj=new grammer.bridgeOnlineBidding.com.bridgeFileCom("data","TOKENS.txt");
			line=fileComObj.readLine();
			flMetaObj=new db.bridgeOnline.com.fileMeta(dbTableObj.getMetaObj(),line);
			db.bridgeOnline.com.row rw;
			rw=null;
			while(true)
			{
				line=fileComObj.readLine();
				if(line == null) break;
				if(rw==null)
				{
					rw=new db.bridgeOnline.com.row(flMetaObj, line);
					dbTableObj.insert(flMetaObj, rw);
					
					continue;
				}
				rw.makeFa(flMetaObj, line);
				dbTableObj.insert(flMetaObj, rw);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (dbException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
