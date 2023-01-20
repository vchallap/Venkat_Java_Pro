package assignment;
//Java program to count vowels and consonants in a String
import java.util.Scanner;

public class vowelsANDconsonants {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter your String");
		
		String str=sc.next();
		
		int vowe=0;
		int conso=0;
		
		str.toLowerCase();
		
		for (int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if (ch == 'a' || ch=='e' || ch=='i'||ch=='o'||ch=='u')
			{
				vowe++;	
			}
			
			else if (ch>='a' && ch <= 'z')
			{
				conso++;
				
			}
		}
		
		System.out.println(" The number of vowels are :"+vowe);
		System.out.println(" The number of Consonants are :"+conso);
	}
	
	
	
}
