package weeklyassignmentsix;


class Employee{
	
	int empId;
	String name;
	double salary;
	static String companyName="ABC Technologies";
	
	
	Employee(int empId, String name, double salary)
	{
		this.empId=empId;
		this.name=name;
		this.salary=salary;
	}
	
	static void displayCompany()
	{
		System.out.println("Company Name: "+companyName);
	}
	void displayEmployee()
	{
		System.out.println();
		System.out.println("Employee Details: ");
		System.out.println("Employee ID: "+empId);
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
		
	}
}

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee.displayCompany();
		
		Employee e1 = new Employee(101,"Priya",50000);
		e1.displayEmployee();
		Employee e2 = new Employee(102,"Rahul",62000);
		e2.displayEmployee();
		Employee e3 = new Employee(103,"Anjali",58000);
		e3.displayEmployee();
		
	}

}
