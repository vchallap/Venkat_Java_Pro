package controlStatements;

import java.util.Scanner;

public class GradeOfStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Grade of the students based average Marks 

		Student should be passed, then grades 

		avg>=90  --> Grade A

		80 to 89 --> Grade B

		70 to 79 --> Grade C

		60 to 69 --> Grade D

		<60  --> Grade E  ( 40 to 59 )

	if failed no grade

		 * 
		 * 
		 * 
		 * 
		 */
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Enter sub1 marks");
		
		int m1 = sc.nextInt();
		
		System.out.println("Enter sub2 marks");
		
		int m2=sc.nextInt();
		
		System.out.println("Enter sub3 maarks");
		
		int m3=sc.nextInt();
		
		System.out.println("Enter sub4 marks");
		
		int m4=sc.nextInt();
		
		/*
		 * 
		 
		if (m1>=40 && m2>=40 && m3>=40)
		{
			
			int avg= (m1+m2+m3)/3;
			
			if (avg>=90)
			{
				System.out.println("Subject is passed : Grade A");
			}
			else if (avg>=89)
			{
				System.out.println("Subject is passed : Grade B ");
			}
			else if (avg>=79)
			{
				System.out.println("Subject is passed : Grade C");
			}
			else if (avg>=69)
			{
				System.out.println("Subject is Passed : Grade D");
			}
			
			else 
			{
				System.out.println("Subject is Passed : Garde E");
			}
			
			
		}
		
		else 
		{
			System.out.println("Student failed and no Grade");
		}
		
		*/
		
		//Program to check subject wise Result and Final Result of a student
		
		int passCount=0;
		
		if (m1>=40)
		{
			passCount++;
			System.out.println("Sub1 is passed");
		}
		else
		{
			System.out.println("Sub1 is failed");
		}
		if (m2>=40)
		{
			passCount++;
			System.out.println("Sub2 is passed");
		}
		else
		{
			System.out.println("Sub2 is failed");
		}
		if (m3>=40)
		{
			passCount++;
			System.out.println("Sub3 is passed");
		}
		
		else
		{
			System.out.println("Sub 3 is failed");
		}
		
		if (m4>=40)
		{
			passCount++;
			System.out.println("Sub 4 is passed");
		}
		else
		{
			System.out.println("Sub 4 is failed");
		}
		
		
		if (passCount>=3)
		{
			System.out.println("Student is passed");
		}
		else
		{
			System.out.println("Student is failed");
		}
	}

}
