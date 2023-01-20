package loops; // loops are used to execute statements again and again (irritative statement)- repeatedly - While, do while,for

import java.util.Scanner;

//import java.util.Scanner;

public class WhileLoop { //first condition will check and then statements will executes

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Example 1:
		//To display 1 to 10
		Scanner sc= new Scanner (System.in);
		
		/*
		int i=1;
		
		while (i<=10)
		{
			System.out.print(i +" ");
			i++;
		}
			
		
		*/
		//Example 2:
		//To display 10 to 1
		
		/*
		int i=10;
		while(i>=1){
			System.out.println(i);
			i--;
		}
		*/
		
		//Example 3: To display 1 to n
		
		System.out.println("Enter you number");
		int n=sc.nextInt();
		int i=1;
		
		while(i<=n)
		{
			System.out.println(i);
			i++;
		}
		
	}

}
