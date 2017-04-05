package com.bridgeOnlineBidding.com;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

import grammer.bridgeOnlineBidding.com.bridgeParseException;
import grammer.bridgeOnlineBidding.com.bridgeTokens1;

public class generateBridgeTok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
grammer.bridgeOnlineBidding.com.bridgeWriteFileCom fileComObj;
		
		db.bridgeOnline.com.db dbObj;
		db.bridgeOnline.com.macBobUserDbVar varObj;
		db.bridgeOnline.com.dbTable dbTableObj;
		String  []line;
		char dQuote;
		dQuote=(char)34;
		fileComObj=null;
		varObj=new db.bridgeOnline.com.macBobUserDbVar();
		dbObj=new db.bridgeOnline.com.db(varObj);
		fileComObj=null;
		try {
			fileComObj=new grammer.bridgeOnlineBidding.com.bridgeWriteFileCom("data","bridgeTok.java");
			fileComObj.writeln("package grammer.bridgeOnlineBidding.com;");
			fileComObj.writeln("");
			fileComObj.writeln("");
			fileComObj.writeln("");
			fileComObj.writeln("");
			
			fileComObj.writeln("public class bridgeTok{");
			fileComObj.writeln("private grammer.bridgeOnlineBidding.com.bridgeTokens tok;");
			fileComObj.writeln("private String data;");
			fileComObj.writeln("public bridgeTok(grammer.bridgeOnlineBidding.com.bridgeTokens tok, String data)");
			fileComObj.writeln("{");
				fileComObj.writeln("this.setTok(tok);");
				fileComObj.writeln("this.setData(data);");
			
			fileComObj.writeln("}");
			fileComObj.writeln("public static grammer.bridgeOnlineBidding.com.bridgeTokens exclame()");
			fileComObj.writeln("{");
				fileComObj.writeln("return grammer.bridgeOnlineBidding.com.bridgeTokens.EXCLAME;");
			fileComObj.writeln("}");
			fileComObj.writeln("public static grammer.bridgeOnlineBidding.com.bridgeTokens[] nodeTypes()");
			fileComObj.writeln("{");
			fileComObj.writeln("\t\tgrammer.bridgeOnlineBidding.com.bridgeTokens[] tokA={grammer.bridgeOnlineBidding.com.bridgeTokens.TOTAL_POINTS");
			fileComObj.writeln("			,grammer.bridgeOnlineBidding.com.bridgeTokens.POINT");
			fileComObj.writeln("			,grammer.bridgeOnlineBidding.com.bridgeTokens.COUNT");
			fileComObj.writeln("			,grammer.bridgeOnlineBidding.com.bridgeTokens.SUIT");
			fileComObj.writeln("			};");
			fileComObj.writeln("	return tokA;");
			fileComObj.writeln("}");
			fileComObj.writeln("");
			fileComObj.writeln("public static bridgeTokens[] mainTypes() {");
			fileComObj.writeln("	// TODO Auto-generated method stub");
			fileComObj.writeln("	grammer.bridgeOnlineBidding.com.bridgeTokens[] tokA={grammer.bridgeOnlineBidding.com.bridgeTokens.LEFT_PAR");
			fileComObj.writeln("			,grammer.bridgeOnlineBidding.com.bridgeTokens.EXCLAME");
			fileComObj.writeln("			,grammer.bridgeOnlineBidding.com.bridgeTokens.END");
			fileComObj.writeln("			,grammer.bridgeOnlineBidding.com.bridgeTokens.OR");
			fileComObj.writeln("			};");
			fileComObj.writeln("	return tokA;");
			fileComObj.writeln("}");
			fileComObj.writeln(" public static grammer.bridgeOnlineBidding.com.bridgeTokens  returnToken(String argTokS)");
			fileComObj.writeln("    {");
			fileComObj.writeln("    	char ch;");
			fileComObj.writeln("    	int chi;");
			fileComObj.writeln("   "); 	
			fileComObj.writeln("    	ch=argTokS.charAt(0);");
			fileComObj.writeln("    	chi=(int)ch");
			fileComObj.writeln(" "); 
			fileComObj.writeln("\tswitch(chi)");
			fileComObj.writeln("\t{");



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
			int colIndex,charIndex;
			colIndex=dbTableObj.getMetaObj().findColumn("tokenName");
			charIndex=dbTableObj.getMetaObj().findColumn("tokenChar");
			int dataPos;
			String pre;
			char ch;
			int chi,cDataPos;
			pre="";
			db.bridgeOnline.com.dbField fldObj,charObj;
			dataPos=dbTableObj.getMetaObj().retColumnObj(colIndex).getDataPos();
			cDataPos=dbTableObj.getMetaObj().retColumnObj(charIndex).getDataPos();
			while(dbTableObj.hasNext())
			{
				rw=dbTableObj.next();
				fldObj=rw.getField(dataPos);
				charObj=rw.getField(cDataPos);
				ch=charObj.getData().charAt(0);
				chi=(int)ch;
				oline="\t\t\tcase "+chi+": return grammer.bridgeOnlineBidding.com.bridgeTokens."+fldObj.getData()+";";
				fileComObj.writeln(oline);
				pre=",";
				
			}
                fileComObj.writeln("    	}");
                fileComObj.writeln("   	return grammer.bridgeOnlineBidding.com.bridgeTokens.ERROR;");
                fileComObj.writeln("    }");
                fileComObj.writeln("");
                fileComObj.writeln("public grammer.bridgeOnlineBidding.com.bridgeTokens getTok() {");
                fileComObj.writeln("	return tok;");
                fileComObj.writeln("}");
                fileComObj.writeln("public void setTok(grammer.bridgeOnlineBidding.com.bridgeTokens tok) {");
                fileComObj.writeln("	this.tok = tok;");
                fileComObj.writeln("}");
                fileComObj.writeln("public String getData() {");
                fileComObj.writeln("	return data;");
                fileComObj.writeln("}");
                fileComObj.writeln("public void setData(String data) {");
                fileComObj.writeln("	this.data = data;");
                fileComObj.writeln("}");
                fileComObj.writeln("public static void throwTokens(String argMsg, bridgeTokens tk, bridgeTokens[] argTokenA) throws bridgeParseException {");

			fileComObj.writeln("               // TODO Auto-generated method stub");
			fileComObj.writeln("               String msg;");
			fileComObj.writeln("       String tokS;");
			fileComObj.writeln("       String pre;");
			fileComObj.writeln("       tokS=retTokValue(tk);");
			fileComObj.writeln("       msg=argMsg;");
			fileComObj.writeln("       msg+="+dQuote+"RECIEVED ("+dQuote+"+tokS+"+dQuote+")  EXPECTED ("+dQuote+";");
			fileComObj.writeln("       pre="+dQuote+dQuote+";");
			fileComObj.writeln("       for(grammer.bridgeOnlineBidding.com.bridgeTokens tkI:argTokenA)");
			fileComObj.writeln("       {");
			fileComObj.writeln("               msg+=pre+retTokValue(tkI);");
			fileComObj.writeln("               pre="+dQuote+","+dQuote+";");
			fileComObj.writeln("       }");
			fileComObj.writeln("       grammer.bridgeOnlineBidding.com.bridgeParseException ps;");
			fileComObj.writeln("       ps=new grammer.bridgeOnlineBidding.com.bridgeParseException(msg);");
			fileComObj.writeln("       throw(ps);");
			fileComObj.writeln("               ");
			fileComObj.writeln("       }");
			fileComObj.writeln("       private static String retTokValue(grammer.bridgeOnlineBidding.com.bridgeTokens tk) {");
			fileComObj.writeln("               // TODO Auto-generated method stub");
			fileComObj.writeln("               switch(tk)");
			fileComObj.writeln("               {");
			colIndex=dbTableObj.getMetaObj().findColumn("tokenName");
			charIndex=dbTableObj.getMetaObj().findColumn("tokenValue");
		
			pre="";
			dataPos=dbTableObj.getMetaObj().retColumnObj(colIndex).getDataPos();
			cDataPos=dbTableObj.getMetaObj().retColumnObj(charIndex).getDataPos();
			dbTableObj.initList();
			while(dbTableObj.hasNext())
			{
				rw=dbTableObj.next();
				fldObj=rw.getField(dataPos);
				charObj=rw.getField(cDataPos);
				ch=charObj.getData().charAt(0);
				chi=(int)ch;
				oline="\t\t\tcase "+fldObj.getData()+": return "+dQuote+charObj.getData()+dQuote+";";
				fileComObj.writeln(oline);
				pre=",";
				
			}
			oline="\t\t}";
			
			fileComObj.writeln(oline);
			oline="\treturn "+dQuote+dQuote+";";
			
			fileComObj.writeln(oline);
			oline="\t}";
			
			fileComObj.writeln(oline);
			fileComObj.writeln("       private static char retTokChar(grammer.bridgeOnlineBidding.com.bridgeTokens tk) {");
			fileComObj.writeln("               // TODO Auto-generated method stub");
			fileComObj.writeln("               switch(tk)");
			fileComObj.writeln("               {");
			colIndex=dbTableObj.getMetaObj().findColumn("tokenName");
			charIndex=dbTableObj.getMetaObj().findColumn("tokenChar");
		
			pre="";
			dataPos=dbTableObj.getMetaObj().retColumnObj(colIndex).getDataPos();
			cDataPos=dbTableObj.getMetaObj().retColumnObj(charIndex).getDataPos();
			dbTableObj.initList();
			while(dbTableObj.hasNext())
			{
				rw=dbTableObj.next();
				fldObj=rw.getField(dataPos);
				charObj=rw.getField(cDataPos);
				ch=charObj.getData().charAt(0);
				chi=(int)ch;
				oline="\t\t\tcase "+fldObj.getData()+": return (char) "+chi+";";
				fileComObj.writeln(oline);
				pre=",";
				
			}
			oline="\t\t}";
			
			fileComObj.writeln(oline);
			oline="\treturn '';";
			
			fileComObj.writeln(oline);
			oline="\t}";
			
			fileComObj.writeln(oline);
			fileComObj.writeln("public boolean isTok(bridgeTokens argTok) {");
				fileComObj.writeln("   	// TODO Auto-generated method stub");
						fileComObj.writeln("\tif(this.getTok() == argTok)");
							fileComObj.writeln("\t{");
								fileComObj.writeln("\t\treturn true;");
								fileComObj.writeln("\t}");
							fileComObj.writeln("\treturn false;");
							fileComObj.writeln("}");
			
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


