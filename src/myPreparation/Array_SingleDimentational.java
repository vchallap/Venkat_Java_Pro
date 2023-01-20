package myPreparation;

public class Array_SingleDimentational {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		int[] a= new int[3]; //declaration and creation of array
		
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;//Array index out of bond exception
		
		//System.out.println(a[0]+"\t"+a[1]+"\t"+a[2]);
		System.out.println(a[3]);
		
		System.out.println(a.length);
		/*
	//short cut way of declarating variable
		
		int[] b= {10,20,30};
		
		System.out.println(b[0]+"\t"+b[1]+"\t"+b[2]);
		*/
		
		/*
		//array with for loop
		int[] a= {10,21,22,21,23,12,13,13,99};
		
		System.out.println("the length of the array is : "+a.length);
		
		for (int i=0;i<a.length;i++)
			System.out.println(a[i]);
		
		*/
		//array with for each loop
		/*int[] a= {1,2,3,5,6,11,23,84};
		
		for (int i : a) 
		{
			
			System.out.println(i);
		}
		*/
		
	}

}
