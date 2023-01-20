package arrays;

import java.util.Scanner;

public class MaxMinSumAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner (System.in);
		System.out.println("Enter how many numbers you want");
		
		int n= sc.nextInt();
		
		int []a= new int[n];
		
		for (int i=0;i<a.length;i++)
		{
			System.out.println("Enter number");
			a[i]= sc.nextInt();
		}
		
		//int [] a= {10,2,4,15,22,1,10};
		int max=a[0];
		int min=a[0];
		int sum=a[0];
		
		for (int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			
			if(a[i]<min)
			{
				min=a[i];
				
			}
			sum=sum+a[i];
		}
		
		
		
		
		float avg= (float) sum/a.length;
		
		System.out.println("No of elements : "+a.length);
		System.out.println("Max value : "+max);
		System.out.println("Min value : "+min);
		System.out.println("Sum : "+sum);
		System.out.println("Avug : "+avg);
		
		
	}

}
