package controlStatements; // if,switch,while,do while ,for loops

import java.util.Scanner;

public class IfStatement {// simple if, if else, nested if,ladder if 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Example 1:
		
		/*

		if( true )
		{
			System.out.println ("true part");
		}
		else
		{
			System.out.println ("false part");
		}

*/
		
		//Example 2:
		
		/*
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Enter First number");
		
		int a=sc.nextInt();
		
		System.out.println("Enter Second number");
		
		int b=sc.nextInt();
		
		boolean c=a>=b;
		
		//if (a>=b)
		if (c)
		{
			System.out.println("Greater number is a");
		
		}
		else
		{
			System.out.println("Greater number is b");
		}
*/
		
		
		//program to find greater of three numbers:
		
		/*Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter first number");
		
		int a = sc.nextInt();
		
		System.out.println("Enter Second number");
		
		int b=sc.nextInt();
		
		System.out.println("Enter third number");
		
		int c=sc.nextInt();
		
		if (a>b)
		{
			if (a>c)
			{
				System.out.println("a is greater");
			}
			
		}
		else if(b>c)
		{
			System.out.println("b is greater");
		}
		else 
		{
			System.out.println("c is greater");
		}
		
		*/
		
		//program to find greater of three numbers: different logic
		
		
	/*	Scanner sc=new Scanner (System.in);
System.out.println("Enter first number");
		
		int a = sc.nextInt();
		
		System.out.println("Enter Second number");
		
		int b=sc.nextInt();
		
		System.out.println("Enter third number");
		
		int c=sc.nextInt();
		
		
		if (a>b&&a>c)
		{
			System.out.println("A is greater");
		}
		else if(b>a&&b>c)
		{
			System.out.println("B is greater");
		}
		else
		{
			System.out.println("C is greter");
		}
		
		*/
		
		//Program to check the result of student based on subjects marks:
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter first number");
				
				int m1 = sc.nextInt();
				
				System.out.println("Enter Second number");
				
				int m2=sc.nextInt();
				
				System.out.println("Enter third number");
				
				int m3=sc.nextInt();
				
				/*
				
				 
				if (m1>=40)
				{
					if (m2>40)
					{
						if(m3>=40)
						{
							System.out.println("PASS");
						}
						else
						{
							System.out.println("FAIL");
						}
					}
					else
						{
							System.out.println("FAIL");
						}
				}
				else
				{
					
					System.out.println("FAIL");
					
				}
		
		*/
				/*
				
				 
				if (m1>=40&&m2>=40&&m3>=40)
				{
					System.out.println("PASS");
					
				}
				else
				{
					System.out.println("FAIL");
				}
				*/
				
				/*
				 
				 
				if(m1<40)
				{
					System.out.println("FAIL");
				}
				else if (m2<40)
				{
					System.out.println("FAIL");
				}
				else if(m3<40)
				{
					System.out.println("FAIL");
				}
				else 
				{
					System.out.println("PASS");
				}
					*/
				
				if (m1<40||m2<40||m3<40)
				{
					System.out.println("FAIL");
				}
				else
				{
					System.out.println("PASS");
				}
		
	}

}
