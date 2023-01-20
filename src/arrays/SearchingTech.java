package arrays;

import java.util.Scanner;

public class SearchingTech {//linear search is used to duplicate and randomly, searching from beg to end

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []a= {10,34,56,99,1,2,0,5,67,89,12,34,55,0};
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter your number to search");
		
		int num=sc.nextInt();
		int count=0;
		
		boolean searchFlag=false;
		
		for (int i=0;i<a.length;i++)
		{
			if (num==a[i])
			{
				searchFlag=true;
				System.out.println("the number foud at a["+i+"]");
				count++;
				//break;
			}
		}
		
		if (searchFlag!=true)
		{
			System.out.println("your number not found");
		}
		
		System.out.println("number of occurances are :" +count);
		
	}

}
