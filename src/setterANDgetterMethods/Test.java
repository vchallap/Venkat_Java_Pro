package setterANDgetterMethods;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Employee employee=new Employee();
		
		employee.setEmpNum(1001);
		employee.setEmpName("Venkatesh");
		employee.setEmpGen("Male");
		employee.setEmpSal(2000.21);
		employee.setEmpDept("IT");
		employee.setEmpAge(30);
		
		int empNum = employee.getEmpNum();
		String empName = employee.getEmpName();
		String empGen = employee.getEmpGen();
		double empSal = employee.getEmpSal();
		String empDept = employee.getEmpDept();
		int empAge = employee.getEmpAge();
		
		
		System.out.println(empNum+"\t"+empName+"\t"+empGen+"\t"+empSal+"\t"+empDept+"\t"+empAge);
		
	}

}
