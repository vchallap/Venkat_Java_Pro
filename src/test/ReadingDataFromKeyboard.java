package test;

import java.util.Scanner; //scanner is the class to read the data from input buffer

public class ReadingDataFromKeyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//System.out.println("Enter the byte value");
		Scanner sc= new Scanner(System.in);
		/*
		byte b= sc.nextByte();
		
		System.out.println("the value of b is : " +b);
		
		System.out.println("Enter the value of short");
		
		short s = sc.nextShort();
		
		System.out.println("The value of s is :" +s);
		
		System.out.println("Enter the integer value");
		
		int i = sc.nextInt();
		
		System.out.println("the value of i is: "+i);
		
		System.out.println("Enter the value of string ");
		
		String str= sc.next();
		
		System.out.println("the value of string is :" +str);
		
		*/
		
		
		System.out.println("Enter employee details");
		
		System.out.println("Enter employee number");
		
		int empnum = sc.nextInt();
		
		System.out.println("Enter employee name");
		
		String empName= sc.next();
		
		System.out.println("Enter employee Age");
		
		int empAge= sc.nextInt();
		
		System.out.println("Enter employee department");
		
		String empDept= sc.next();
		
		System.out.println("Enter employee salary");
		
		double empSal=sc.nextDouble();
		
		System.out.println("Enter employee gender");
		
		String empGen=sc.next();
		
		System.out.print("The employee details entered are: " );
		System.out.println(empnum+","+empName+","+empAge+","+empDept+","+empSal+","+empGen);
		
	}

}
