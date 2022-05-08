package ioStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyLines {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader inputStream = null;
		BufferedWriter outputStream = null;
		
		try {
			inputStream = new BufferedReader(new FileReader("D:\\FileHandling\\sanyas.txt"));
			outputStream = new BufferedWriter(new FileWriter("D:\\FileHandling\\NewBufferdFile.txt"));
		   
		    String l;
			
			while((l = inputStream.readLine()) !=null) {
				outputStream.write(l);
			}
			
		
		}finally {
			if(inputStream !=null) {
			   inputStream.close();	
			}
			if(outputStream !=null) {
				outputStream.close();
			}
		}
		

	}

}
