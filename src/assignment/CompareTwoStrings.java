package assignment;

import java.util.Scanner;

public class CompareTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter your first string is : ");
		
		String str1 = sc.next();
		
		System.out.println("Enter your second string is : ");
		
		String str2= sc.next();
		
		if(str1.compareTo(str2)==0)
		{
			System.out.println("Strings are equal.");
		}
			
		else
		{
			System.out.println("Strings are not equal.");
		}
			
		
			}

}
