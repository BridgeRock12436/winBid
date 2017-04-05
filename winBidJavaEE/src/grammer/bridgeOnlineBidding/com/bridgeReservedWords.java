package grammer.bridgeOnlineBidding.com;

import java.util.LinkedList;
import java.util.ListIterator;



public class bridgeReservedWords {
	LinkedList<grammer.bridgeOnlineBidding.com.bridgeWord> linkW;
	private static String upHat="&#x41;";
	private static String notSort="&#45";
	private static String downHat="&#x2200;";
	
	public bridgeReservedWords()
	{
	LinkedList<grammer.bridgeOnlineBidding.com.bridgeWord>wA;
	wA=new LinkedList<grammer.bridgeOnlineBidding.com.bridgeWord>();
	grammer.bridgeOnlineBidding.com.bridgeWord alloc;
	alloc=new grammer.bridgeOnlineBidding.com.bridgeWord("TAGS",grammer.bridgeOnlineBidding.com.bridgeTokens1.TAGS);
	wA.add(alloc);
	
	alloc=new grammer.bridgeOnlineBidding.com.bridgeWord("JAVASCRIPT",grammer.bridgeOnlineBidding.com.bridgeTokens1.JAVASCRIPT);
	wA.add(alloc);
	alloc=new grammer.bridgeOnlineBidding.com.bridgeWord("TYPE",grammer.bridgeOnlineBidding.com.bridgeTokens1.TYPE);
	wA.add(alloc);
	alloc=new grammer.bridgeOnlineBidding.com.bridgeWord("DATA",grammer.bridgeOnlineBidding.com.bridgeTokens1.DATA);
	wA.add(alloc);
	alloc=new grammer.bridgeOnlineBidding.com.bridgeWord("DATATYPE",grammer.bridgeOnlineBidding.com.bridgeTokens1.DATATYPE);
	wA.add(alloc);
	alloc=new grammer.bridgeOnlineBidding.com.bridgeWord("COLUMNS",grammer.bridgeOnlineBidding.com.bridgeTokens1.COLUMNS);
	wA.add(alloc);
	alloc=new grammer.bridgeOnlineBidding.com.bridgeWord("SORTABLE",grammer.bridgeOnlineBidding.com.bridgeTokens1.SORTABLE);
	wA.add(alloc);
	alloc=new grammer.bridgeOnlineBidding.com.bridgeWord("FILTERABLE",grammer.bridgeOnlineBidding.com.bridgeTokens1.FILTERABLE);
	wA.add(alloc);
	alloc=new grammer.bridgeOnlineBidding.com.bridgeWord("TRUE",grammer.bridgeOnlineBidding.com.bridgeTokens1.TRUE);
	wA.add(alloc);
	alloc=new grammer.bridgeOnlineBidding.com.bridgeWord("FALSE",grammer.bridgeOnlineBidding.com.bridgeTokens1.FALSE);
	wA.add(alloc);
	alloc=new grammer.bridgeOnlineBidding.com.bridgeWord("HEADER",grammer.bridgeOnlineBidding.com.bridgeTokens1.HEADER);
	wA.add(alloc);
	alloc=new grammer.bridgeOnlineBidding.com.bridgeWord("LENGTH",grammer.bridgeOnlineBidding.com.bridgeTokens1.LENGTH);
	wA.add(alloc);
	alloc=new grammer.bridgeOnlineBidding.com.bridgeWord("NULLABLE",grammer.bridgeOnlineBidding.com.bridgeTokens1.NULLABLE);
	wA.add(alloc);
	alloc=new grammer.bridgeOnlineBidding.com.bridgeWord("IDENTITY",grammer.bridgeOnlineBidding.com.bridgeTokens1.IDENTITY);
	wA.add(alloc);
	alloc=new grammer.bridgeOnlineBidding.com.bridgeWord("END_COLUMN",grammer.bridgeOnlineBidding.com.bridgeTokens1.END_COLUMN);
	wA.add(alloc);
	alloc=new grammer.bridgeOnlineBidding.com.bridgeWord("NAME",grammer.bridgeOnlineBidding.com.bridgeTokens1.NAME);
	wA.add(alloc);
	alloc=new grammer.bridgeOnlineBidding.com.bridgeWord("STRING",grammer.bridgeOnlineBidding.com.bridgeTokens1.STRING);
	wA.add(alloc);
	alloc=new grammer.bridgeOnlineBidding.com.bridgeWord("DOUBLE",grammer.bridgeOnlineBidding.com.bridgeTokens1.DOUBLE);
	wA.add(alloc);
	alloc=new grammer.bridgeOnlineBidding.com.bridgeWord("INTEGER",grammer.bridgeOnlineBidding.com.bridgeTokens1.INTEGER);
	wA.add(alloc);
	alloc=new grammer.bridgeOnlineBidding.com.bridgeWord("DATE",grammer.bridgeOnlineBidding.com.bridgeTokens1.DATE);
	wA.add(alloc);
	alloc=new grammer.bridgeOnlineBidding.com.bridgeWord("WORD",grammer.bridgeOnlineBidding.com.bridgeTokens1.WORD);
	wA.add(alloc);
	alloc=new grammer.bridgeOnlineBidding.com.bridgeWord("NUMERIC",grammer.bridgeOnlineBidding.com.bridgeTokens1.NUMERIC);
	wA.add(alloc);
	alloc=new grammer.bridgeOnlineBidding.com.bridgeWord("SORT_DEFAULT",grammer.bridgeOnlineBidding.com.bridgeTokens1.SORT_DEFAULT);
	wA.add(alloc);
	alloc=new grammer.bridgeOnlineBidding.com.bridgeWord("ASCENDING",grammer.bridgeOnlineBidding.com.bridgeTokens1.ASCENDING);
	wA.add(alloc);
	alloc=new grammer.bridgeOnlineBidding.com.bridgeWord("DESCENDING",grammer.bridgeOnlineBidding.com.bridgeTokens1.DESCENDING);
	wA.add(alloc);
	alloc=new grammer.bridgeOnlineBidding.com.bridgeWord("PAGESIZE",grammer.bridgeOnlineBidding.com.bridgeTokens1.PAGESIZE);
	wA.add(alloc);
	alloc=new grammer.bridgeOnlineBidding.com.bridgeWord("HIDDEN",grammer.bridgeOnlineBidding.com.bridgeTokens1.HIDDEN);
	wA.add(alloc);
	alloc=new grammer.bridgeOnlineBidding.com.bridgeWord("SELECTABLE",grammer.bridgeOnlineBidding.com.bridgeTokens1.SELECTABLE);
	wA.add(alloc);
	this.setLinkW(wA);
	
		
	}
	public String toString()
	{
		String ret;
		String pre;
		
		grammer.bridgeOnlineBidding.com.bridgeWord wd;
		ListIterator<grammer.bridgeOnlineBidding.com.bridgeWord> listI;
		listI=this.getLinkW().listIterator();
		ret="";
		pre="";
		while(listI.hasNext())
		{
			wd=listI.next();
			ret+=pre+wd.getWd();
			pre=",";
		}
		return ret;
}
	
	
	
public grammer.bridgeOnlineBidding.com.bridgeTokens1 getToken(String argWord)
	
	{
		ListIterator<grammer.bridgeOnlineBidding.com.bridgeWord>listI;
		listI=this.getLinkW().listIterator();
		grammer.bridgeOnlineBidding.com.bridgeWord wd;
		while(listI.hasNext())
		{
			wd=listI.next();
			if(wd.equal(argWord))
			{
				return wd.getTok();
			}
		}
		return grammer.bridgeOnlineBidding.com.bridgeTokens1.ERROR;
		
	}
	public LinkedList<grammer.bridgeOnlineBidding.com.bridgeWord> getLinkW() {
		return linkW;
	}
	public void setLinkW(LinkedList<grammer.bridgeOnlineBidding.com.bridgeWord> linkW) {
		this.linkW = linkW;
	}
	public static String getUpHat() {
		return upHat;
	}
	public static void setUpHat(String upHat) {
		grammer.bridgeOnlineBidding.com.bridgeReservedWords.upHat = upHat;
	}
	public static String getNotSort() {
		return notSort;
	}
	public static void setNotSort(String notSort) {
		grammer.bridgeOnlineBidding.com.bridgeReservedWords.notSort = notSort;
	}
	public static String getDownHat() {
		return downHat;
	}
	public static void setDownHat(String downHat) {
		grammer.bridgeOnlineBidding.com.bridgeReservedWords.downHat = downHat;
	}
}