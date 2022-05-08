package www.sanyasdada.fileio.inputandoutstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadToFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       File file = new File("D:\\FileHandling\\Filef1.txt");
       Scanner myReader;
	try {
		myReader = new Scanner(file);
		while(myReader.hasNextLine()) {
			String next = myReader.nextLine();
			System.out.println(next);
		}
		myReader.close(); 
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       

	}

}
