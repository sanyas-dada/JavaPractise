package ioStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharacters {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader inputStream = null;
		FileWriter outputStream = null;

		try {
			inputStream = new FileReader("D:\\FileHandling\\NewFilef1.txt");
			outputStream = new FileWriter("D:\\FileHandling\\NewFile.txt");

			int c;
			while ((c = inputStream.read()) != -1) {
				outputStream.write(c);
			}
		} finally {
			if (inputStream != null) {
				inputStream.close();
			}
			if (outputStream != null) {
				outputStream.close();
			}
		}

	}

}
