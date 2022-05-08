package ioStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamTest {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		File file = new File("D:\\FileHandling\\Filef1.txt");
		FileInputStream fis = new FileInputStream(file);
		FileOutputStream out = new FileOutputStream("File2.txt");

		int data;
		while ((data=fis.read()) != -1) {
			// copying the file into Filef1 into the File2
			out.write(data);
		
			System.out.println("read data:" + data + "\t" + (char)data);
		}
		fis.close();
		out.close();
          
	}

}
