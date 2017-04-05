package grammer.bridgeOnlineBidding.com;

import java.io.IOException;
import java.util.LinkedList;
import java.util.ListIterator;

public class bridgeTokenHold {
		 private grammer.bridgeOnlineBidding.com.bridgeReservedWords resWord;
		    private grammer.bridgeOnlineBidding.com.bridgeTokenString tokS;
		    private LinkedList<grammer.bridgeOnlineBidding.com.bridgeTok1> listTok;
		    private ListIterator<grammer.bridgeOnlineBidding.com.bridgeTok1> listI;
		    private grammer.bridgeOnlineBidding.com.bridgeTok1 errorTok;
		    private grammer.bridgeOnlineBidding.com.bridgeTok1 currTok;
		    public bridgeTokenHold(String argTokenString) throws bridgeParseException
		    {
		    	this.init(argTokenString);
		    }
		    public bridgeTokenHold(grammer.bridgeOnlineBidding.com.bridgeCom comObj,String argName) throws bridgeParseException, IOException
		    {
		    	String tokenString;
		    	tokenString=comObj.getTokenString(argName);
		    	this.init(tokenString);
		    }
		    private void init(String argTokenString) throws bridgeParseException
		    {
		    	
		    		this.setResWord(new grammer.bridgeOnlineBidding.com.bridgeReservedWords());
		    		this.setListTok(new LinkedList<grammer.bridgeOnlineBidding.com.bridgeTok1>());
		    		this.setTokS(new grammer.bridgeOnlineBidding.com.bridgeTokenString(argTokenString));
		    		grammer.bridgeOnlineBidding.com.bridgeTok1 alloc;
		    		grammer.bridgeOnlineBidding.com.bridgeTokens1 token;
		    		token=grammer.bridgeOnlineBidding.com.bridgeTokens1.ERROR;
		    		
		    		String errorMsg;
		    		errorMsg="ERROR";
		    		alloc=new grammer.bridgeOnlineBidding.com.bridgeTok1(token,errorMsg);
		    		this.setErrorTok(alloc);
		    		this.makeTokList();
		    		this.setListI(this.getListTok().listIterator());
		    }
		    private void makeTokList() throws bridgeParseException {
				// TODO Auto-generated method stub
				grammer.bridgeOnlineBidding.com.bridgeTok1 retTok;
				grammer.bridgeOnlineBidding.com.bridgeTokens1 tk;
				char ch;
				
				while(true)
				{
					if(this.getTokS().hasCurr() == false) 
					{
					break;
					}
					ch=this.getTokS().curr().charAt(0);
					switch(ch)
					{
					case '$':retTok=this.isWord();
							break;
					case '_': retTok=this.isResWord();
							break;
					case '0':
					case '1':
					case '2':
					case '3':
					case '4':
					case '5':
					case '6':
					case '7':
					case '8':
					case '9':
						retTok=this.isNumeric();
						break;
					default:
						tk=grammer.bridgeOnlineBidding.com.bridgeTok1.returnToken(this.getTokS().curr());
						retTok=new grammer.bridgeOnlineBidding.com.bridgeTok1(tk,this.getTokS().curr());
						this.getTokS().next();
						break;
					
					
					}
					if(retTok.getTok() == grammer.bridgeOnlineBidding.com.bridgeTokens1.ERROR)
					{
						grammer.bridgeOnlineBidding.com.bridgeParseException ps;
						ps=new grammer.bridgeOnlineBidding.com.bridgeParseException("INVALID TOKEN");
						throw ps;
						
					}
					
					this.getListTok().add(retTok);
			}
					
					
				grammer.bridgeOnlineBidding.com.bridgeTok1 alloc;
	    		grammer.bridgeOnlineBidding.com.bridgeTokens1 token;
	    		token=grammer.bridgeOnlineBidding.com.bridgeTokens1.END;
	    		
	    		String errorMsg;
	    		errorMsg="END";
	    		alloc=new grammer.bridgeOnlineBidding.com.bridgeTok1(token,errorMsg);	
	    		this.getListTok().add(alloc);
				
				
				
		    }
		    private bridgeTok1 isResWord() {
				// TODO Auto-generated method stub
		    	bridgeTok1 ret;
		        char ch,lastCh;
		        String tokS;
		        grammer.bridgeOnlineBidding.com.bridgeTokens1 tk;
		        ch=this.getTokS().curr().charAt(0);
		        if(ch != '_')
		        {
		        	return this.getErrorTok();
		        }
		        tokS="";
		        lastCh=ch;
		        ch=this.getTokS().next().charAt(0);
		        while(Character.isLetterOrDigit(ch) == true || ch != '_' || ch != '-')
	        	{
		        
		        
		       
		        	tokS+=String.valueOf(ch);
		            if(!this.getTokS().hasNext()) 
		        	{
		             		this.getTokS().next();
		             		break;
		        		
		        		
		        	}
		        	lastCh=ch;
		        	ch=this.getTokS().next().charAt(0);
		        	
		        }
		        if(lastCh == '_' || lastCh=='-')
		        {
		        	return this.getErrorTok();
		        }
		        tk=this.getResWord().getToken(tokS);
		        ret=new grammer.bridgeOnlineBidding.com.bridgeTok1(tk,tokS);
		        return ret;
		        
				
			}
			private grammer.bridgeOnlineBidding.com.bridgeTok1 isNumeric() {
		        bridgeTok1 ret;
		        char ch;
		        String tokS;
		        ch=this.getTokS().curr().charAt(0);
		        if(Character.isDigit(ch) == false)
		        {
		        	return this.getErrorTok();
		        }
		        tokS=String.valueOf(ch);
		        ch=this.getTokS().next().charAt(0);
		        while(Character.isDigit(ch))
		        {
		        	tokS+=String.valueOf(ch);
		        	ch=this.getTokS().next().charAt(0);
		        	
		        }
		        ret=new grammer.bridgeOnlineBidding.com.bridgeTok1(grammer.bridgeOnlineBidding.com.bridgeTokens1.NUMERIC,tokS);
		        return ret;
		        
		        
				
			}
		    private grammer.bridgeOnlineBidding.com.bridgeTok1 isWord() {
		        bridgeTok1 ret;
		        char ch,lastCh;
		        String tokS;
		        grammer.bridgeOnlineBidding.com.bridgeTokens1 tk;
		        ch=this.getTokS().curr().charAt(0);
		        if(ch != '$')
		        {
		        	return this.getErrorTok();
		        }
		        ch=this.getTokS().next().charAt(0);
		        if(ch != '{')
		        {
		        	return this.getErrorTok();
		        }
		        ch=this.getTokS().next().charAt(0);
		       
		        ch=this.getTokS().next().charAt(0);
		        if(Character.isLetterOrDigit(ch) == false)
		        {
		        	return this.getErrorTok();
		        }
		        tokS=String.valueOf(ch);
		        lastCh=ch;
		        ch=this.getTokS().next().charAt(0);
		        while(ch != '}')
		        {
		        	tokS+=String.valueOf(ch);
		        	if(Character.isLetterOrDigit(ch) == false && ch != '_' && ch != '-')
		        	{
		        		return this.getErrorTok();
		        	}
		        	if(!this.getTokS().hasNext()) 
		        		{
		        		this.getTokS().next();
		        		return this.getErrorTok();
		        		
		        		
		        		}
		        	  lastCh=ch;
		        	ch=this.getTokS().next().charAt(0);
		        	
		        }
		        if(lastCh == '_' || lastCh=='-')
		        {
		        	return this.getErrorTok();
		        }
		        tk=grammer.bridgeOnlineBidding.com.bridgeTokens1.WORD;
		        ret=new grammer.bridgeOnlineBidding.com.bridgeTok1(tk,tokS);
		        return ret;
		        
		        
				
			}
		    public  grammer.bridgeOnlineBidding.com.bridgeTok1 ignore()
			  {
				  grammer.bridgeOnlineBidding.com.bridgeTok1 retTok;
				  retTok=this.curr();
				  while(true)
				  {
					  switch(retTok.getTok())
					  {
					  		case SPACE:
					  		case CR_LF:
					  		case TAB:
					  				break;
					  		default: return retTok;
					  					
					
					  }
					  retTok=this.next();
				  }
			  }
		    public boolean isToken(String msg,grammer.bridgeOnlineBidding.com.bridgeTokens1 argTokenA[]) throws grammer.bridgeOnlineBidding.com.bridgeParseException
		    {
		    	
		    	for(grammer.bridgeOnlineBidding.com.bridgeTokens1 tk: argTokenA)
		    	{
		    		if(this.curr().getTok() == tk)
		    		{
		    			return true;
		    		}
		    		
		    	}
		    grammer.bridgeOnlineBidding.com.bridgeTok1.throwTokens(msg, this.getCurrTok().getTok(), argTokenA);
		    	return false;
		    	
		    	
		    	
		    	
		    }
		    public grammer.bridgeOnlineBidding.com.bridgeTok1 curr() {
				// TODO Auto-generated method stub
				return this.getCurrTok();
			}
		    public grammer.bridgeOnlineBidding.com.bridgeTok1 next()
		    {
		    	if(!this.getListI().hasNext())
		    	{
		    		return null;
		    	}
		    	bridgeTok1 retTok;
		    	retTok=this.getListI().next();
		    	this.setCurrTok(retTok);
		    	return retTok;
		    	
		    }
			public grammer.bridgeOnlineBidding.com.bridgeReservedWords getResWord() {
				return resWord;
			}
			public void setResWord(grammer.bridgeOnlineBidding.com.bridgeReservedWords resWord) {
				this.resWord = resWord;
			}
			public grammer.bridgeOnlineBidding.com.bridgeTokenString getTokS() {
				return tokS;
			}
			public void setTokS(grammer.bridgeOnlineBidding.com.bridgeTokenString tokS) {
				this.tokS = tokS;
			}
			public LinkedList<grammer.bridgeOnlineBidding.com.bridgeTok1> getListTok() {
				return listTok;
			}
			public void setListTok(LinkedList<grammer.bridgeOnlineBidding.com.bridgeTok1> listTok) {
				this.listTok = listTok;
			}
			public ListIterator<grammer.bridgeOnlineBidding.com.bridgeTok1> getListI() {
				return listI;
			}
			public void setListI(ListIterator<grammer.bridgeOnlineBidding.com.bridgeTok1> listI) {
				this.listI = listI;
			}
			public grammer.bridgeOnlineBidding.com.bridgeTok1 getErrorTok() {
				return errorTok;
			}
			public void setErrorTok(grammer.bridgeOnlineBidding.com.bridgeTok1 errorTok) {
				this.errorTok = errorTok;
			}
			public grammer.bridgeOnlineBidding.com.bridgeTok1 getCurrTok() {
				return currTok;
			}
			public void setCurrTok(grammer.bridgeOnlineBidding.com.bridgeTok1 currTok) {
				this.currTok = currTok;
			}
			public int ignoreTokens() {
				// TODO Auto-generated method stub
				grammer.bridgeOnlineBidding.com.bridgeTok1 tk;
				tk=this.getCurrTok();
				while(tk.isTok(grammer.bridgeOnlineBidding.com.bridgeTokens1.END)  == false)
				{
					switch(tk.getTok())
					{
						case SPACE:
						case TAB:
						case CR_LF:
							tk=this.next();
							break;
							default: return 0;
								
					}
					
				}
				
			
			return 0;
			}
	}



