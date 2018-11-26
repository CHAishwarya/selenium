package com.java.Ifcomditions;

public class Switch {

	public static void main(String[] args) 
	{
		int a=3;
		
		switch(a) 
		{
		case 1:
			System.out.println("you chose one");	
			break;
		
		case 2:
			System.out.println("you chose two");	
			break;
			
		case 3:
			System.out.println("you chose three");	
			break;
			
		case 4:
			System.out.println("you chose four");	
			break;
			
		default:
			System.out.println("Enter a number between 1 to 4");
			break;
		}

	}

}
