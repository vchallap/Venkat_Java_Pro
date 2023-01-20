package polymorphism;

public class BankInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReserveBankOfIndia rbi=new AxisBank();
		
		System.out.println("Axis bank Interest details are");
		System.out.println("Min = :" +rbi.getMinInterestRate());
		System.out.println("Max= :"+rbi.getMaxInterestRate());
		System.out.println("Actual= : "+rbi.getActInterestRate());
		
		rbi=new SBI();
		
		System.out.println("SBI bank Interest details are");
		System.out.println("Min= :" +rbi.getMinInterestRate());
		System.out.println("Max=: "+rbi.getMaxInterestRate());
		System.out.println("Actual= "+rbi.getActInterestRate());
		
		rbi=new ICICI();
		
		System.out.println("ICICI bank Interest details are ");
		System.out.println("Min = "+rbi.getMinInterestRate());
		System.out.println("Max = "+rbi.getMaxInterestRate());
		System.out.println("Actuval = "+rbi.getActInterestRate());
		
		
		
	}

}
