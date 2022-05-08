package com.sanyasdada.reversedString;

public class ReversedString {

	public static void main(String[] args) {
		String name = "sanyasdada";
		System.out.println(name.length());
		//char method = name.charAt(0);
		//System.out.println(method);
//		int temp = 0;
//
//		for (int i = 0; i < name.length(); i++) {
//			for (int j = i + 1; j < name.length(); j++) {
//				if (!name.isEmpty() && (name.charAt(i) == name.charAt(j))){
//					temp = temp + 1;
//				}
//			}
//			System.out.println(temp +"\t");
//
//		}
//		System.out.println("___________________________________");
//		System.out.println("the value of the temp is:"+temp);
		
		for(int i = 0;i<10;i++) {
			if(i%2 == 1) {
				System.out.println(i);
			}else if(i%2 == 0) {
				System.out.println("i am going to nailed it:" +i);
			}
		}
		
        int yes = (int)(Math.random() *5);
        System.out.println(yes);
       
        
		
	}
}