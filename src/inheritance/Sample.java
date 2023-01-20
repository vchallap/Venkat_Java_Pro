package inheritance;

/*
 * It is an acquiring properties from parent into child.
 * It is a creation of new classes from existing classes. It as an acquiring old class properties into new class.
 * Old class is a parent class and new class is child class.
 * Purpose of Inheritance is code reusability.	
 * As per Java , Parent class is called as super class
And child class is called as sub class
Types of inheritance :

Java provides three types of inheritance:

1) Single inheritance

2) Multi level inheritance

3) Hierarchical Inheritance


 */
//Single inheritance

public class Sample {

	int a;
	int b;
	
	public void setAB(int x, int y)
	{
		a=x;
		b=y;
	}
	
	public void dispAB()
	{
		System.out.println("a= " +a + "\t b= "+b);
	}
	
	
}
