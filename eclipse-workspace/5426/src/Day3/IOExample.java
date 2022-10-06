package Day3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.nio.CharBuffer;

public class IOExample {
	
	
	public void writeCharsToFile(String fileName,String data) throws Exception {
		File file=new File(fileName);
		Writer out=new BufferedWriter(new FileWriter(file));
		out.write(data);
		out.flush();
		out.close();
	}
	
	public String readCharsFromFile(String fileName) throws Exception {
		char [] buffer=new char[4];
		File file=new File(fileName);
		Reader read=new BufferedReader(new FileReader(file));
		int i=-1;
		StringBuffer result=new StringBuffer();
	while((i=read.read(buffer))!=1) {
		System.out.println("size of read=");
		result.append(buffer,0,i);
			
		}
read.close();
return result.toString();
		
	}
		
		
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String readFromFile(String fileName) throws Exception {
		byte[] buffer=new byte[4];       ///16k or 32k buffer size ideally and here he can read only 4 bytes not at once
		File file=new File(fileName);
		InputStream is=new FileInputStream(file);
		int i=-1;
		StringBuffer sb=new StringBuffer();
		while ((i=is.read(buffer))!=-1) 
			
		 {
			System.out.println("size of read="+i);
			sb.append(buffer);
		}
		is.close();
		return sb.toString();
	}
	
	
	
	
	
	
	
	public void writeToFile(String fileName,String contents) throws Exception {
		byte [] data=contents.getBytes();
		File file=new File(fileName);
		OutputStream os=new FileOutputStream(fileName);
		os.write(data);
		os.close(); //always should be written in finally
	
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		IOExample ex=new IOExample();
		ex.writeToFile("hellovaltech.txt", "HELLO VALTECHIANS");
		
		System.out.println(ex.readFromFile("hellovaltech.txt"));
		
		ex.writeCharsToFile("hellovaltech.txt", "busy doing java");
		System.out.println(ex.readCharsFromFile("hellovaltech.txt"));
	}

}
