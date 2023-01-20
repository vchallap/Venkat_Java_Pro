package assignment;
//Java program to convert string to lowercase and uppercase.
import java.util.Scanner;

public class StringLowerToUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner (System.in);
		
		System.out.println("Enter your string in lower case");
		
		String str = sc.next();
		str= str.toUpperCase();
		
		System.out.println("The entered string in upper case is : "+str);
		
		
		
		
	}

}
