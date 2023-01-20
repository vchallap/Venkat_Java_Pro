package inheritance;

public class HierarchialInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Student student= new Student();
		student.setData(1000, "Venkatesh", "Male", 30, "Java", 5000, 2000, 'A');
		Employee employee= new Employee();
		employee.setData(1001, "Veneela", "Female", 27, "IT", 50000, "Devaloper");
		
		System.out.println("Student details are: ");
		student.display();
		
		System.out.println("Employee details are :");
		employee.display();
		
	}

}
