package assignment;
//Java program to find occurrence of a character in a String
import java.util.Scanner;

public class OccuranceOfChar {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
					Scanner sc= new Scanner (System.in);
					String str;
					char ch;
					int count =0;
					boolean searchFlag=false;
					sc= new Scanner(System.in);

					System.out.print("Please Enter any String =  ");
					str = sc.nextLine();
					
					System.out.print("Enter the Character to Find =  ");
					ch = sc.next().charAt(0);
					
					for(int i = 0; i < str.length(); i++)
					{
						if(str.charAt(i) ==  ch) 
						{
							searchFlag=true;
							System.out.println("The occurance of your character  " +str.charAt(i)+" foud at position: "+i);
							count++;
							
						}
						
						
					}
					if(!searchFlag)
					{
						System.out.println("your entered character not found");
					}
					System.out.println("The total number of occurance are "+count);
					
		
	}

}
