package assignment;

import java.util.Scanner;

//Java Program to find duplicate characters in a String
public class DuplicateChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner (System.in);
		
		System.out.println("Enter your string ");
		
		String str= sc.next();
		int count=0;
		char [] ch =str.toCharArray();
	
		for (int i=0;i<str.length();i++)
		{
			for (int j = i+1;j<str.length();j++)
			{
				if (ch [i] == ch [j])
				{
				System.out.println("Duplicate chars are : "+ch [j]);	
				count++;
				break;
				}
			}
		}
		
		System.out.println("total number of duplicates are : "+count);
	}

	
	}


