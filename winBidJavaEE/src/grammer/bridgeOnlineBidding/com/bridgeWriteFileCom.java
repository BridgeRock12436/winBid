package grammer.bridgeOnlineBidding.com;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class bridgeWriteFileCom extends bridgeCom {
	
	private String fileDir;
	private String fileName;
	private BufferedWriter bw;
	
	public bridgeWriteFileCom(String fileDir, String fileName) throws IOException {
		super();
		FileWriter fw;
		
		this.setFileDir(fileDir);
		String fn;
		fn=this.getFileDir()+File.separator+fileName;
		this.setFileName(fn);
		fw=new FileWriter(this.getFileName());
		this.setBw(new BufferedWriter(fw));
		
	}
	public void write(String argLine) throws IOException
	{
		this.getBw().write(argLine);
	}
	public void writeln(String argLine) throws IOException
	{
		this.write(argLine);
		this.write("\n");
	}
	public String getFileDir() {
		return fileDir;
	}
	public void setFileDir(String fileDir) {
		this.fileDir = fileDir;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public BufferedWriter getBw() {
		return bw;
	}
	public void setBw(BufferedWriter bw) {
		this.bw = bw;
	}
	public void close() throws IOException {
		// TODO Auto-generated method stub
		this.getBw().close();
		
	}

}
