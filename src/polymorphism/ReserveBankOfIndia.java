package polymorphism;

public abstract class ReserveBankOfIndia {

	public int getMinInterestRate()
	{
		return 5;
	}
	
	public int getMaxInterestRate()
	{
		return 15;
		
	}
	
	public abstract int getActInterestRate();
	
}
