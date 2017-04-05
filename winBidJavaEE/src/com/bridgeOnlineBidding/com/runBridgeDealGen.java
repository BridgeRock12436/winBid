package com.bridgeOnlineBidding.com;

import java.io.IOException;

import grammer.bridgeOnlineBidding.com.bridgeParseException;

public class runBridgeDealGen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		grammer.bridgeOnlineBidding.com.bridgeFileCom fileCom;
		grammer.bridgeOnlineBidding.com.bridgeRule ruleObj;
		
		String fileDir;
		fileDir=System.getenv("BRIDGEFILEDB");
		fileCom=new grammer.bridgeOnlineBidding.com.bridgeFileCom(fileDir);
		try {
			ruleObj=new grammer.bridgeOnlineBidding.com.bridgeRule(fileCom, "HEARTS");
		} catch (bridgeParseException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
				

	}

}
