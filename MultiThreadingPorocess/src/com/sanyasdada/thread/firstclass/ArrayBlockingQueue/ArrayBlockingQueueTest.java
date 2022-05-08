package com.sanyasdada.thread.firstclass.ArrayBlockingQueue;

import java.io.File;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ArrayBlockingQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            String dirPath = args[0];
            String extension = args[1];
            String keyword = args[2];
            BlockingQueue<File> queue = new ArrayBlockingQueue<>(100);
            DirectoryLister lister = new DirectoryLister(queue, new File(dirPath),extension);
            lister.start();
            for(int i =0; i<10; i++) {
            	FileParser parser = new FileParser(queue,keyword);
            	parser.start();
            }
	}

}
