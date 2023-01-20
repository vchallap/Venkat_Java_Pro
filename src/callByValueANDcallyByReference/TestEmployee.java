package callByValueANDcallyByReference;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Employee employee=new Employee();
		
		recvData(employee);
		int empNum = employee.getEmpNum();
		String empName = employee.getEmpName();
		String empGen = employee.getEmpGen();
		int empAge = employee.getEmpAge();
		String empDept = employee.getEmpDept();
		double empSal = employee.getEmpSal();
		
		System.out.println(empNum+"\t"+empName+"\t"+empGen+"\t"+empAge+"\t"+empDept+"\t"+empSal);
	/*	
		employee.setEmpNum(1001);
		employee.setEmpName("Venkatesh");
		employee.setEmpGen("Male");
		employee.setEmpAge(30);
		employee.setEmpDept("IT");
		employee.setEmpSal(2000.20);
		
		deliverData(employee);
				
		*/
	}
			//public static void deliverData(Employee emp)
	public static void recvData(Employee eno)
			{
	/*
				int empNum = emp.getEmpNum();
				String empName = emp.getEmpName();
				String empGen = emp.getEmpGen();
				int empAge = emp.getEmpAge();
				String empDept = emp.getEmpDept();
				double empSal = emp.getEmpSal();
				
				*/
				//System.out.println(empNum+"\t"+empName+"\t"+empGen+"\t"+empAge+"\t"+empDept+"\t"+empSal);
				
		eno.setEmpNum(1000);
		eno.setEmpName("Venkatesh");
		eno.setEmpGen("Male");
		eno.setEmpAge(30);
		eno.setEmpDept("IT");
		eno.setEmpSal(2000.21);
		
		
			}
	
	
	
}
