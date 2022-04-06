package com.capg.day4;

interface TeamA {
	public void print();

}

class print implements TeamA, TeamB {
	public void print() {
		System.out.println("Hello World");
	}
}

interface TeamB {
}

class demo implements TeamB {
	public void print() {
		System.out.println("Hii");
	}
	
}

public class TeamA {
	public static void main(String[] args)
	{
		print p = new print();
	}
}
