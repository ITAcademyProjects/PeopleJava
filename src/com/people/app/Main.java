package com.people.app;

public class Main {

	public static void main(String[] args) {
		People p1 = new People("EDU", 16);
		People p2 = new People("FELIZ", 19);
		People p3 = new People("NAVIDAD", 29);

		People p4 = p1;

		p1.setName("YA NO SOY EDU");
		p4.setAge(10);

		p3 = p2;

		p3.setName("O SI");
		p1 = p2;
		p2 = p1;
		p4.setAge(29);
		printPeople(p1);
		p1.setName("SOY EDU");

		printPeople(p2);
		p3.setName("VERANO");
		p1 = p3;
		
		printPeople(p3);
		p1.setAge(34);
		p2 = p4;

		printPeople(p4);
	}
	
	private static void printPeople(People p) {
		System.out.println("" + p.getName() + " Y SOY ADULTO? " + p.isAdult());
	}

}
