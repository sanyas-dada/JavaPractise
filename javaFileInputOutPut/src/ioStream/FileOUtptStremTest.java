package ioStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;

public class FileOUtptStremTest {

	public static void main(String[] args) throws IOException {
     LocalDate today = LocalDate.now();	
     System.out.println(today);
     File newFile = new File("D:\\FileHandling\\Filef7.txt");
     FileOutputStream fos = new FileOutputStream(newFile);
     fos.write(244);
     System.out.println("Data is saved");
    fos.close();
     
	}

}
