package classesObjects;

public class Employeedemo
{
	
private int empNum;
	
	private String empName;
	
	private String empJob;
	
	private double empSalary;
	
	private String empDeptName;
	
	private String empGender;
	
	private int empAge;	

	
	/*public void setData(int eno,String ename,String egen,float esal,String edept,int eage)
	{
		empNum=eno;
		empName=ename;
		empGender=egen;
		empSalaray=esal;
		empDepartment=edept;
		empAge=eage;	
	}
	*/
	
	public void setEmpNum(int eno)
	{		
		empNum = eno;
	}
	
	public void setEmpName(String ename)
	{
		empName = ename;
	}
	
	public void setEmpJob(String job)
	{
		empJob = job;
	}
	
	public void setEmpSalary(double salary)
	{
		empSalary = salary;		
	}
	
	public void setEmpDeptName(String dname)
	{
		empDeptName = dname;
	}
	
	public void setempGender(String gender)
	{
		empGender = gender;
	}
	
	public void setempAge(int age)
	{
		empAge = age;
	}
	
	public void display()
	{
		System.out.println(empNum+"\t"+empName+"\t"+empJob+"\t"+empSalary+"\t"+empDeptName+"\t"+empGender+"\t"+empAge);
	}

	public int getEmpnum() {
		// TODO Auto-generated method stub
		return 0;
	}
}





