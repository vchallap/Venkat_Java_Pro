package loops;

import java.util.Scanner;

public class DoWhile { // first statement executes and next condition check

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Example 1: 
		/*
		int i=1;
		
		do
		{
			System.out.println(i);
			i++;
		}
		while (i<=10);
		*/
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter your number");
		int n=sc.nextInt();
		int i=n;
		do
		{
			System.out.println(i);
			i--;
		}
		while(i>=1);
		
		

	}

}
