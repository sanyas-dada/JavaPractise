package scanning;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ScanSanyas {
	public static void main(String[] args) throws IOException {

		Scanner s = null;
		try {
			s = new Scanner(new BufferedReader(new FileReader("D:\\FileHandling\\NewFile.txt")));
			while (s.hasNext()) {
		
				//System.out.println(s.useDelimiter(",\\s*").next());
				System.out.println(s.next());
				
			}
		
		} finally {
			if (s != null) {
				s.close();
			}
		}

	}
}
