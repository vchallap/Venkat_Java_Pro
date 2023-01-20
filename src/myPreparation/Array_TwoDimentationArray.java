package myPreparation;

public class Array_TwoDimentationArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		int[][] a= new int[2][3];
		
		a[0][0]= 5;
		a[0][1]=10;
		a[0][2]=15;
		a[1][0]=20;
		a[1][1]=25;
		a[1][2]=30;
		
		System.out.println(a[0][0]);
		System.out.println(a[0][1]);
		System.out.println(a[0][2]);
		System.out.println(a[1][0]);
		System.out.println(a[1][1]);
		System.out.println(a[1][2]);
*/
		//short cut way representation
/*
		int[][] a= {{1,2,3},{4,5,6}};
		
		System.out.println(a[0][0]);
		System.out.println(a[0][1]);
		System.out.println(a[0][2]);
		System.out.println(a[1][0]);
		System.out.println(a[1][1]);
		System.out.println(a[1][2]);
		
		System.out.println(a.length);//no  of rows 
		System.out.println(a[0].length);//no of columns
		System.out.println(a[1].length);//nu of columns
*/
		
		//using for loop
		
		
		int[][] a= {{1,2,3},{4,5,6}};
		
		for (int i=0;i<a.length;i++)
		{
			for (int j=0;j<a[0].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			
			System.out.println();
		}
		
		
	}

}
