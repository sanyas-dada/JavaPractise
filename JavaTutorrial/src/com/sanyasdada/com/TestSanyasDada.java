package com.sanyasdada.com;

public class TestSanyasDada {
	public static void main(String[]args) {
//		SanyasDada sanyasdada = new SanyasDada();
//		SanyasDada sanyas = new SanyasDada();
//	    sanyasdada.setDream("I am going to make powerful software application in this month");
//		System.out.println(sanyasdada.getDream());
//		 sanyas.setName("all is well ");
//		 
//		 System.out.println(sanyas.getName());
		
		SanyasDada sanyasdada = new SanyasDada(1, "sanyasdada","BusinessMan",345.987f);
		
		sanyasdada.setDream("I am going to make powerful software application in this world");
		sanyasdada.setName("Visionary");
		String name = sanyasdada.getName();
		System.out.println(name);
		
		System.out.println(sanyasdada.getDream());
		System.out.println(sanyasdada.getName());
		System.out.println(sanyasdada.getSalary());
		System.out.println(sanyasdada.getRollNo());
	    
	    System.out.println(name);
	    sanyasdada.equals(sanyasdada);
		
	}
	
	

}
