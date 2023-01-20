package controlStatements;

import java.util.Scanner;

public class CricketBatsmenScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * 
		 * Program  to display Message on Cricket bat's man score 

		score<0  --> Invalid input

		score = 0  --> Duckout

		score ==> 1 to 49  ==> Normal Score

		score ==> 50 to 99  ==> Half Century

		score ==> 100 to 199 ==> Century

		score  >=200  ==> Double Century

		 * 
		 * 
		 */
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter bat's man score ");
		
		int score = sc.nextInt();
		
		if (score<0)
		{
			System.out.println("Invalid input");
		}
		else if (score==0)
		{
			System.out.println("Duckout");
		}
		else if (score<=49)
		{
			System.out.println("Normal Score");
		}
		else if (score<=99)
		{
			System.out.println(" Half Century");
		}
		else if (score<=199)
		{
			System.out.println("Century");
		}
		else 
		{
			System.out.println("Double Century");
		}
			
	}

}
