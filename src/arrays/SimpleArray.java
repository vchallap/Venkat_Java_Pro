package arrays;//collection of similar type of elements: 
//declaration: int [] a or int a[]- []= reference to array
//memory allocation: a=new int[5]- dynamic allocation which is at run time.
// int []a= new int[5]-- new is a keyword to allocate memory at runtime.new always works at heap memory.
//a[0],a[1],a[2]= accessing array elements
//a[0]=5- assigning value 
// x=10,y=10== these are variabes containes data- simple variables
//a[0],a[1]== these are contanies address whihc refence variabe.- reference variables.


// int []a={1,2,3,4,5}==complie time intialization 
//int []a = new int[]{1,2,3,4,5}- runtime memory allocation and initilization

//int n= a.length- lenth of the array and returns no of elements
public class SimpleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int a[]={1,2,3,4,5};//compile time memory allocation
		int a[]= new int []{1,2,3,4,5};
		for (int i=0;i<a.length;i++)
		{
			System.out.println(i);
		}
		
	//int []a; //array declaration
	//	a=new int [5];//memory allocation
		//a[0]=3//assigning valies.
		//a[1]=4
		// int a[]= new int[]{1,2,3,4,5}// run time intialization
		//int a[]={1,2,3,4,5}//compile time initialization
		
		
	}

}
