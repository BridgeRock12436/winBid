package grammer.bridgeOnlineBidding.com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class bridgeFileCom extends bridgeCom {
	private String fileDir;
	private String filName;
	private BufferedReader readFileBuf;
	
	public bridgeFileCom(String fileDir)
	{
		this.setFileDir(fileDir);
	}

	public bridgeFileCom(String fileDir,String argFileName) throws FileNotFoundException
	{
		String fn;
		this.setFileDir(fileDir);
		this.setFilName(argFileName);
		fn=this.getFileDir()+File.separator+this.getFilName();
		this.setReadFileBuf(new BufferedReader(new FileReader(fn)));
	}
	public String getTokenString(String argName) throws IOException
	{
		String fn;
		
		fn=this.getFileDir()+File.separator+argName+".brd";
		BufferedReader br = new BufferedReader(new FileReader(fn));
		StringBuilder sb = new StringBuilder();
		String line = br.readLine();
		while (line != null) {
		sb.append(line);
		line = br.readLine();
		}
		String everything = sb.toString();
		return everything;
	}
	public String [] readLine() throws IOException
	{
		String line;
		String [] ar,ret;
		int i,ct;
		line=this.getReadFileBuf().readLine();
		if(line == null)
		{
			return null;
		}
		line=line.replaceAll("\t\t", "\t \t");
		ar=line.split("\t");
		ct=ar.length;
		ret= new String[ct];
		for(i=0;i<ct;i++)
		{
			ret[i]=ar[i].trim();
		}
		return ret;
		
	}

	public String getFileDir() {
		return fileDir;
	}

	public void setFileDir(String fileDir) {
		this.fileDir = fileDir;
	}

	public String getFilName() {
		return filName;
	}

	public void setFilName(String filName) {
		this.filName = filName;
	}

	public BufferedReader getReadFileBuf() {
		return readFileBuf;
	}

	public void setReadFileBuf(BufferedReader readFileBuf) {
		this.readFileBuf = readFileBuf;
	}
	
	

}
