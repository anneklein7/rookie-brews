package fileio;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderExample {
	
	public static void main(String[] args) {
		try {
			Reader r=new FileReader("/Users/annechafer/Documents/doctest.rtf");
			int data=r.read(); //reads first character only!
			while(data != -1) // loop through all characters
			{
				System.out.print((char)data);
				data=r.read(); // read next character
			}
			// System.out.println(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
