package www.sanyasdada.fileio.inputandoutstream;

import java.io.File;

public class FileInformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       File myFile = new File("D:\\FileHandling\\NewFilef1.txt");
       if(myFile.exists()) {
    	   System.out.println("File name: " +myFile.getName());
    	   System.out.println("Absolute path: " +myFile.getAbsolutePath());
    	   System.out.println("Writable: " +myFile.canWrite());
    	   System.out.println("Readable: " +myFile.canRead());
    	   System.out.println("File size in bytes: " +myFile.length());
       }else {
    	   System.out.println("The file does not exists");
       }
	}

}
