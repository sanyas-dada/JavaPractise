package com.sanyasdada.thread.firstclass.ArrayBlockingQueue;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.concurrent.BlockingQueue;

public class FileParser extends Thread {
	private BlockingQueue<File> queue;
	private String keyword;

	public FileParser(BlockingQueue<File> queue, String keyword) {
		this.queue = queue;
		this.keyword = keyword;
	}
	
	public void run() {
		while(true) {
			try {
				// if the head isnot the "signal element",it removes the head from 
				// the queue and parses the file
				File file = queue.peek();
				if(file !=null &&  !file.getName().equals("END")) {
					file = queue.take();
					parseFile(file);
				}else {
					break;
				}
			}catch (InterruptedException | IOException ex){
				ex.printStackTrace();
			}
		}
	}

	private void parseFile(File file) throws IOException {
		// TODO Auto-generated method stub
		List<String> lines = Files.readAllLines(file.toPath());
		int lineCount = 0;
		 
		for( String aLine: lines ) {
			lineCount++;
			if(aLine.contains(keyword)) {
				String result = "Found in %s at line %d\n";
				System.out.printf(result,file.getAbsoluteFile(),lineCount);
			}
			
		}
	}

}
