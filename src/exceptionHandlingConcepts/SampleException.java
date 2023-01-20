package exceptionHandlingConcepts;

public class SampleException extends Throwable{
	
	
	private String message;

	public void SampleException()
	{
		message =null;
	}
	
	public SampleException(String message) {
		// TODO Auto-generated constructor stub
		
		this.message= message;
		
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return message;
	}
	
}
