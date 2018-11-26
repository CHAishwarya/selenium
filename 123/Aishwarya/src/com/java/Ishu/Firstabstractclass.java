package com.java.Ishu;

public class Firstabstractclass extends Firstabstract
{

	public static void main(String[] args) {
		Firstabstractclass f= new Firstabstractclass();
		f.m1();
		f.m2();

	}

	@Override
	
	public void m2() {
		System.out.println("iam m2 overdiridden method in fristabsract");
		
	}

}
