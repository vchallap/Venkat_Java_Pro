package assignment;

import java.util.Arrays;

//Java Program to sort strings in alphabetical order
public class SortStringAlphabeticalOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] str= {"c","testing","java","unix","c++","python","html","oracle","hadoop"};
		
		System.out.println("Before sorting");
		
		for (int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}
		
		//sorting
		
		Arrays.sort(str);
		
		System.out.println("After sorting");
		
		for (int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}
		
	}

}
