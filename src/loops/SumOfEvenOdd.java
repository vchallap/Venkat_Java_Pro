package loops;

import java.util.Scanner;

public class SumOfEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter your number");
		int n=sc.nextInt();
		int evesum=0;
		int oddsum=0;
		
		for(int i=1;i<=n;i++)
		{
			if (i%2==0)
			{
				evesum=evesum+i;
				
			}
			
			else 
			{
				oddsum=oddsum+i;
			}
				
		}
		System.out.println("Even sum are : "+evesum);
		System.out.println("Odd sum are : "+oddsum);
		
		
		
		
	}

}
