package Day3;

import java.io.IOException;
import java.io.Reader;

public class Rotateby13Reader extends Reader {
	public Reader source;
	public Rotateby13Reader(Reader source) {
		// TODO Auto-generated constructor stub
		this.source=source;
	}

	@Override
	public int read(char[] cbuf, int off, int len) throws IOException {
		// TODO Auto-generated method stub
		char[] buffer=new char[cbuf.length];
		int i=source.read(buffer);
		if(i==-1) return -1;
		for (int j = 0; j < i; j++) {
			cbuf[j]=Rot13Utility.rotate(buffer[j]);
			
		}
		return i;
	}

	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
		source.close();
	}
	
	

}
