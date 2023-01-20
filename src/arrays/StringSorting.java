package arrays;

import java.util.Arrays;

public class StringSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a = {99,2,45,12,4,11,66,88,1,90};
		
		System.out.println("BEFORE SORTING");
		
		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		//sorting
		Arrays.sort(a);
		
		System.out.println("After sorting");
		
		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
