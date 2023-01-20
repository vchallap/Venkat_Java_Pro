package controlStatements;

import java.util.Scanner;

public class SwitchCommonCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter your choice from 1 to 7");
		
		int choice = sc.nextInt();
		
		switch(choice)
		{
		
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
				System.out.println("on weekdays");
				break;
		case 6:
		case 7: 
				System.out.println("Week day");
				break;
		default:
			System.out.println("not on week days");
			break;
		}
		
		
	}

}
