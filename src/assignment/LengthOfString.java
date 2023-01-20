package assignment;

import java.util.Scanner;

//How to calculate length of the string using String.length() method in Java?
public class LengthOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner (System.in);
		
		System.out.println("Enter your string");
		
		String str= sc.next();
		
		System.out.println("The length of the string entered is " +str.length());
		
		
	}

}
