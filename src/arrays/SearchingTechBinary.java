package arrays;

import java.util.Scanner;

public class SearchingTechBinary { //based on id field Search in the half . numbers are unique and Ascending order


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a= {1,6,10,16,20,25,30,34,40,48,50,55,60,63,71,79,82,87,93,99}; //Initializing data to array
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Enter your number to search");
		
		int num=sc.nextInt();//reading data from keybord and assigning it to num variable
		
		int l=0;
		int h=a.length-1;
		boolean serchFalg=false;
		
		while(l<=h)
		{
			int m=(l+h)/2;
			
			if (num==a[m])
			{
				serchFalg=true;
				System.out.println("your number foud at a["+m+"]");
				break;
			}
			else if (num>a[m])
			{
				l=m+1;
			}
			else
			{
				h=m-1;
			}
				
			
		}
		if (serchFalg==false)
		{
			System.out.println("your number not found");
		}
		
		
		
		
		
	}

}
