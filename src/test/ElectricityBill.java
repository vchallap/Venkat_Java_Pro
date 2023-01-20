package test;

import java.util.Scanner;

public class ElectricityBill {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Welcome to AP/TS Transco Electricity Department");
		System.out.println("Enter your Choice");
		System.out.println("Menu");
		System.out.println("1. Domestic");
		System.out.println("2. Commercial");
		System.out.println("3. Industrial");
		
		
		
		int choice=sc.nextInt();
		System.out.println("Enter Service Id");
		String serviceId=sc.next();
		
		System.out.println("Enter name");
		String custName=sc.next();
	
		System.out.println("Enter current reading");
		int custRead=sc.nextInt();
		System.out.println("Enter pre reading");
		int preRead=sc.nextInt();
		int domesticMinbill= 10;
		int commercialMinbill=100;
		int industrialMinbill=500;
		int netbill = 0;
		int serCharge = 0;
		int totalBill = 0;
		
		
				
		int consumUnits=custRead-preRead;
		
				switch(choice)
				{
					
					case 1: 
								if (consumUnits >=0 && consumUnits <=49)
								{
									 netbill= domesticMinbill;
									
									
								}
								else if (consumUnits <=99)
								{
									 netbill = consumUnits*3;
									 
									 if (netbill<domesticMinbill)
									 {
										 netbill= domesticMinbill;
										
									 }
									 
								}
								else if (consumUnits <=499)
								{
									netbill = consumUnits*4;
									
									 if (netbill<domesticMinbill)
									 {
										 netbill= domesticMinbill;
										 
									 }
									 
								}
								else 
								{
									netbill = consumUnits*5;
									
									 if (netbill<domesticMinbill)
									 {
										 netbill= domesticMinbill;
										
									 }
									
								}
					  
								
					break;
					
					case 2: 
						
								if (consumUnits >=0 && consumUnits <=49)
								{
									 netbill= consumUnits*3;
									 
									 if (netbill<commercialMinbill)
									 {
										 netbill= commercialMinbill;
										
									 }
									 
								}
								else if (consumUnits <=99)
								{
									 netbill = consumUnits*5;
									 if (netbill<commercialMinbill)
									 {
										 netbill= commercialMinbill;
										 
									 }
									 
								}
								else if (consumUnits <=499)
								{
									netbill = consumUnits*6;
									 if (netbill<commercialMinbill)
									 {
										 netbill= commercialMinbill;
										
									 }
									 
								}
								else 
								{
									netbill = consumUnits*7;
									 if (netbill<commercialMinbill)
									 {
										 netbill= commercialMinbill;
										
									 }
									 
								}
								
							break;	
					case 3: 
						
								if (consumUnits >=0 && consumUnits <=49)
								{
									 netbill= consumUnits*4;
									 if (netbill<industrialMinbill)
									 {
										 netbill= industrialMinbill;
										
									 }
									 
								}
								else if (consumUnits <=99)
								{
									 netbill = consumUnits*6;
									 if (netbill<industrialMinbill)
									 {
										 netbill= industrialMinbill;
										
									 }
									 
								}
								else if (consumUnits <=499)
								{
									netbill = consumUnits*7;
									 if (netbill<industrialMinbill)
									 {
										 netbill= industrialMinbill;
										
									 }
									 
								}
								else 
								{
									netbill = consumUnits*8;
									 if (netbill<industrialMinbill)
									 {
										 netbill= industrialMinbill;
										 
									 }
									 
								}
								
							break;
							
				default:
									System.out.println("Wrong choice entered");
									break;
								
				}
				
				serCharge= (int) ((netbill*5)/100f);
				totalBill=netbill+serCharge;
				
				System.out.println("======================================================");
				System.out.println("TS / AP Transco");
				System.out.println("Customer Type 	: "+choice);
				System.out.println("Service Id		: "+serviceId);
				System.out.println("Customer Name 	: "+custName);
				System.out.println("Current Reading : "+custRead);
				System.out.println("Pre reading 	: "+preRead);
				System.out.println("Units consumed 	: "+consumUnits);
				System.out.println("Net Bill 		: "+ netbill);
				System.out.println("Service Charges (5%) : "+serCharge);
				System.out.println("Total Bill  	: "+totalBill);
				
	}

}
