package dataConversioninJava;

import java.util.Scanner;

public class Stringtobasictype {
//every wrapper class provides static parseX() to convert from String to basic type.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*String str="1001";
		int a = Integer.parseInt(str);
		
		System.out.println(a);
		*/
		
		/*Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter emp number");
		
		String inputData= sc.next();
		int eno= Integer.parseInt(inputData);
		
		System.out.println("Enter name");
		String str=sc.next();
		
		System.out.println("Enter emo age");
		inputData=sc.next();
		int age= Integer.parseInt(inputData);
		
		System.out.println("Enter emp sal");
		
		inputData=sc.next();
		float f= Float.parseFloat(inputData);
		
	System.out.println(eno+"\t"+str+"\t"+age+"\t"+f);
		*/
		
		String record = "1001:mnrao:manager:15000.50:admin:male:30";
		
		String[] fields = record.split(":");
		
		int empNum=  Integer.parseInt(fields[0]);
		String empName= fields[1];
		String empJob= fields[2];
		double empSal= Double.parseDouble(fields[3]);
		String empDept = fields[4];
		String empGen= fields[5];
		int empAge = Integer.parseInt(fields[6]);
		
		System.out.println(empNum+"\t"+empName+"\t"+empJob+"\t"+empSal+"\t"+empDept+"\t"+empAge);
		
		
		
		
		
		
	}

}
