package inheritance;

public class Student extends Person{
	
	private String course;
	private  double feePaid;
	private  double feeDue;
	private  char grade;

	
	public void setData(int pid, String name, String gender, int age,String course,double feePaid,double feeDue,char grade) 
	{
		// TODO Auto-generated method stub
		setData(pid, name, gender, age);
		this.course=course;
		this.feePaid=feePaid;
		this.feeDue=feeDue;
		this.grade=grade;
	}
	
	
	public void display()
	{
		super.display();
		System.out.println(course+"\t"+feePaid+"\t"+feeDue+"\t"+grade);
	}
	
	
	
	
	
	

}
