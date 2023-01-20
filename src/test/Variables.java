package test;

public class Variables {

	/* variable is a name given to some location in the program memory.
	 * its values changes at run time
	 * it is temporary memory and its clears automatically when program stopped.
	 * it is one of identifier (class name,variable name, method name,object name,interface name) .
	 * it contains alphabets ,digits and under score.
	 * should not be special chars, spaces and keywords
	 * max length can be 255 chars
	 start with lower case and when multiple words - lower case and second word upper case
	
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// syntax: Data type and variable name
		//variables are local variables and saved into stack memory (location of variable is fixed and it can't be changed when values are change)
		//declaring variables
		String empName;
		char empGen;
		double empSal;
		String empCompany;
		int empAge;
		
		//Assignment
			
		empName= "Venkatesh";
		empGen= 'M';
		empSal= 1000.0;
		empCompany= "Oracle";
		empAge=30;
		
		//Initialization: declaring and assigning variables at a time
		
		String empDeptName = "HSGBU";
		
		System.out.println("Intial values are");
		System.out.println(empName);
		System.out.println(empGen);
		System.out.println(empSal);
		System.out.println(empCompany);
		System.out.println(empAge);
		System.out.println(empDeptName);
		
		
		
		//changing values
		//Every time of chaning value, Same location value overwrites .
		
		empName= "challapalli";//compiler initialization
		empGen= 'f';
		empSal= 6666.0;
		empCompany= "PS";
		empAge=31;
		 empDeptName = "sales";
		
		
		System.out.println("after changing values are");
		System.out.println(empName);
		System.out.println(empGen);
		System.out.println(empSal);
		System.out.println(empCompany);
		System.out.println(empAge);
		System.out.println(empDeptName); ///single line printing with sinle variables
		
		//same line printing with multiple variables  in one statement
		
		System.out.println("emp Name : "+empName+"\t emp Gen : "+empGen+"\t emp Sal : "+empSal+"\t emp Company : "+empCompany+"\t emp Age : "+empAge+"\t emp DeptName : "+empDeptName);
		
		//multiline printing with multiple variables in one statement
		
		System.out.println("emp Name : "+empName+"\n emp Gen : "+empGen+"\n emp Sal : "+empSal+"\n emp Company : "+empCompany+"\n emp Age : "+empAge+"\n emp DeptName : "+empDeptName);
		
		
		//Dynamic initialization----dynamic means runtime.
		
		int a =10;
		int b=20;
		int c=a*b; // dynamic initialization..
		
		System.out.println(c);
		
		
		//swaping two variables.
		
		int x =10;
		int y=20;
		 System.out.println("Before swaping the values are x : " + x + "\t y : "+y);
		
		x=y;
		y=x;
		
		System.out.println("After swaping the values are x : "+x+"\t b : "+y);
		// data lost here 
		
		// to save data, swaping two variabkes using temp variable
		
		int aa=10;
		int bb=20;
		int temp=aa;
		
		 System.out.println("Before swaping the values are aa : " + aa + "\t bb : "+bb);
		 
		aa=bb;
		bb=temp;
		
		System.out.println("After swaping the values are aa : "+aa+"\t bb : "+bb);
				
		
		// swaping tow variabes without using temp variable
		
		
		int m =20;
		int n =30;
		
		System.out.println("Before swaping the values are m= :"+m+"\t n :="  +n);
		
		m = m+n;
		n= m-n;
		m=m-n;
		
		System.out.println("After swaping the values are m= "+m+"\t n= "+n);
		
		
		System.out.println("Hi Git");
		
	}
	
	
	

}
