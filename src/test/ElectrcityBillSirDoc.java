package test;
import java.util.Scanner;

public class ElectrcityBillSirDoc {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Press 1: Domestic"+"\n"+"Press 2: Commercial"+"\n"+"Press 3:Industrial");
		int option=scan.nextInt();
		
		
		switch(option) {
		case 1:
			  System.out.println("Welcome xyz"+"\n"+"Service ID: DA001234");
			  System.out.println("Enter Consumption Unit");
			  int consumption=scan.nextInt();
			  
			  if(consumption>=0 && consumption<=49) {
				  System.out.println("price: 0"+"\n"+"Minimum bill: 10"+"\n"+"Service Charge: 5%"+"\n"+"Bill has to be paid: 10.50 rs");
			  }
			  
			  else if(consumption<=99) {
				  int price=consumption*3;
				  System.out.println("Price :"+price+"\n"+"Service Charge: 5%"+"\n"+"Bill has to be paid:"+(price+(price*(5/100f)))+"rs");
				  
			  }
			  
			  else if(consumption<=499) {
				  int price=consumption*4;
				  System.out.println("Price :"+price+"\n"+"Service Charge: 5%"+"\n"+"Bill has to be paid:"+(price+(price*(5/100f)))+"rs");
				  
			  }
			  
			  else {
				  int price=consumption*5;
				  System.out.println("Price :"+price+"\n"+"Service Charge: 5%"+"\n"+"Bill has to be paid:"+(price+(price*(5/100f)))+"rs");
				  
			  }
			  
			  break;
			  
		 case 2:
			  System.out.println("Welcome xyz Commertial"+"\n"+"Service ID: CA001234");
			  System.out.println("Enter Consumption Unit");
			  int consumption1=scan.nextInt();
			  
			  if(consumption1>=0 && consumption1<=49) {
				  int price=consumption1*3;
				  if(price<100) {
					  System.out.println("Minimum bill: 100"+"\n"+"Service Charge: 5%"+"\n"+"Bill has to be paid: 105 rs");
				  }
				  else {
				  System.out.println("Price :"+price+"\n"+"Service Charge: 5%"+"\n"+"Bill has to be paid:"+(price+(price*(5/100f)))+"rs");
			  }
			  }
			  
			  else if(consumption1<=99) {
				  int price=consumption1*5;
				  System.out.println("Price :"+price+"\n"+"Service Charge: 5%"+"\n"+"Bill has to be paid:"+(price+(price*(5/100f)))+"rs");
				  
			  }
			  
			  else if(consumption1<=499) {
				  int price=consumption1*6;
				  System.out.println("Price :"+price+"\n"+"Service Charge: 5%"+"\n"+"Bill has to be paid:"+(price+(price*(5/100f)))+"rs");
				  
			  }
			  
			  else {
				  int price=consumption1*7;
				  System.out.println("Price :"+price+"\n"+"Service Charge: 5%"+"\n"+"Bill has to be paid:"+(price+(price*(5/100f)))+"rs");
				  
			  }	  
			  
			  break;
			  
		
	 case 3:
		  System.out.println("Welcome xyz Industry"+"\n"+"Service ID: IA001234");
		  System.out.println("Enter Consumption Unit");
		  int consumption2=scan.nextInt();
		  
		  if(consumption2>=0 && consumption2<=49) {
			  int price=consumption2*4;
			  if(price<500) {
				  System.out.println("Minimum bill: 500"+"\n"+"Service Charge: 5%"+"\n"+"Bill has to be paid: 525 rs");
			  }
			  else {
			  System.out.println("Price :"+price+"\n"+"Service Charge: 5%"+"\n"+"Bill has to be paid:"+(price+(price*(5/100f)))+"rs");
		  }
		  }
		  
		  else if(consumption2<=99) {
			  int price=consumption2*6;
			  System.out.println("Price :"+price+"\n"+"Service Charge: 5%"+"\n"+"Bill has to be paid:"+(price+(price*(5/100f)))+"rs");
			  
		  }
		  
		  else if(consumption2<=499) {
			  int price=consumption2*7;
			  System.out.println("Price :"+price+"\n"+"Service Charge: 5%"+"\n"+"Bill has to be paid:"+(price+(price*(5/100f)))+"rs");
			  
		  }
		  
		  else {
			  int price=consumption2*8;
			  System.out.println("Price :"+price+"\n"+"Service Charge: 5%"+"\n"+"Bill has to be paid:"+(price+(price*(5/100f)))+"rs");
			  
		  }	  
		  
		  break;
		  
		 default:
			 System.out.println("Invalid number");
		  
	}
		
	}

}
