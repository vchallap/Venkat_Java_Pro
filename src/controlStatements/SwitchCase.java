package controlStatements;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number a");
		
		int a=sc.nextInt();
		
		System.out.println("Enter number b");
		
		int b= sc.nextInt();
		
		System.out.println("Menu");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("Enter your Choice : 1/2/3");
		int choice= sc.nextInt();
		switch(choice)
		
		{
				case 1: 
				        System.out.println("Additon : "+(a+b));
				        break;
				        
				case 2:
					System.out.println("Subtraction : "+(a-b));
					break;
					
				case 3:
					
					System.out.println("Multiplication : "+(a*b));
					break;
					
			default :
						System.out.println("Invalid choice entered");
						break;
						
		}
		
		
		
	}

}
