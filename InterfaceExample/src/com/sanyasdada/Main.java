package com.sanyasdada;

public class Main {

	public static void main(String[] args) {
		/*
		 * TimeClient myTimeClient = new SimpleTimeClient();
		 * System.out.println(myTimeClient.toString());
		 */
		new SimpleTimeClient().getLocalDateTime();
		System.out.println(new SimpleTimeClient().toString());
	}

}
