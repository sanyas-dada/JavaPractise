package www.sanyasdada.fileio.inputandoutstream;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) {
		
		try{// TODO Auto-generated method stub
             FileWriter newfile = new FileWriter("D:\\FileHandling\\Filef1.txt",true);
             newfile.write("so that i challege myself everysingleday");
             newfile.close();
             System.out.println("Successfully wrote to the file.");
		}catch(IOException ex) {
			System.out.println("An error occurred");
			ex.printStackTrace();
		}
	}

}
