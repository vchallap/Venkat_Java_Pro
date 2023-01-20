package arrays;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a [] = {12,12,1,3,12,13};
		//for -each :will be used for only arrays.it will process all elements in a array.we can;t skip,selected eliminets we can read.
		//for for arrays and any repeated(itirative) statements. we can ship any elements .
		for (int n : a)
		{
			System.out.println(n);
		}
		
		String [] names = {"Java","Testing",".net","C#","C"};
		
		for (String name : names)
		{
			System.out.println(name);
		}
	}

}
