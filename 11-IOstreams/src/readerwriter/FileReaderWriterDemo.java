package readerwriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {
	
	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("C:\\Users\\hp\\javafsd\\javademos\\readwrite\\testfile001.txt");
		FileWriter fw = new FileWriter("C:\\Users\\hp\\javafsd\\javademos\\readwrite\\testfilewriter.txt");
		
		int ch;
		while ( (ch = fr.read()) != -1) {
			fw.write(ch);
		}
		System.out.println(fr);
		fr.close();
		fw.close();
	}

}