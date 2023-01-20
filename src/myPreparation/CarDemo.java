package myPreparation;

public class CarDemo {

	public static void main(String[] args)
	{
		
		//object creation for car class
		
		Car maruthi = new Car();// new is the keyword for objection creation of the car//maruthi is the refvariable name of the car object
								//Car is the data type for variables which should be name of the class.
		
		Car benz = new Car();
		Car audi = new Car();
		
		//object initialization 
		
		maruthi.carModel="swift 123";
		maruthi.carCost= 10000;
		maruthi.carColor="Red";
		
		//calling methods using object reference 
		maruthi.carStart();
		maruthi.carDetails();
		maruthi.carStop();
		
		benz.carModel="benz 123";
		benz.carCost=100000;
		benz.carColor="Black";
		
		benz.carStart();
		benz.carDetails();
		benz.carStop();
		
		audi.carModel="audi 121";
		audi.carCost=20000;
		audi.carColor="Blue";
		
		audi.carStart();
		audi.carDetails();
		audi.carStop();
		
		
	}
	

}

class Car
{
	//car class properties created :
	//variables
	String carModel;
	int carCost;
	String carColor;
	
	//methods
	public void carStart()
	{
		
		System.out.println(carModel+ " started");
		
	}
	
	
	
	public void carDetails()
	{
		
		System.out.println("The model of the car is : "+carModel);
		System.out.println("The cost of the car is : " +carCost);
		System.out.println("The color of the car is: " +carColor );
		
		
	}
	
	public void carStop() 
	{
		
		System.out.println(carModel+ " Stopped");
		
		System.out.println("------------------------------------");
	}
	
	
	
	
	
	
	
}