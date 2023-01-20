package operators;

import java.util.Scanner;

//Based on no of operends, operators are 3 types
//Unary , binary and terinory
//Binary- Arthamatic, relational,logical,assignment, short hand,Bitwise operators
//unary operator works with one operator- -, ++,  --

public class AddSubMul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//program to add, subtract and multiply two numbers.
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Enter First number");
		
		int a= sc.nextInt();
		
		System.out.println("Enter Second number");
		
		int b=sc.nextInt();
		
		int res= a+b;
		
		System.out.println("Addition is : "+res);
		
		res=a-b;
		
		System.out.println("Subtraction is : "+res);
		
		res=a*b;
		
		System.out.println("Multiplication is : "+res);
		
		
			
		
	}

}
