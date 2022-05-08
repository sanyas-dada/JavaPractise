package streamdemo;

import java.util.stream.Stream;

public class OfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Stream.of(1,11,111,1111,11111).forEach(x -> System.out.println(x));
    System.out.println();
    System.out.println("i am doing my best at my speed ");
    
    String[] feeling = {"Good","enthralling","fabulous","clam","doer"};
    Stream.of(feeling).filter(x -> x.length() > 4).forEach(x -> System.out.println(x));
	}

}
