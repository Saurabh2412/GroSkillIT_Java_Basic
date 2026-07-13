package oop_assignment;

public class Employee {
	
	int id;
	String name;
	double basicSalary;
	
	Employee(int id, String name, double basicSalary)
	{
		this.id=id;
		this.name=name;
		this.basicSalary=basicSalary;
	}
	
	double calculateSalary()
	{
		double hra = basicSalary *0.2;
		double bonus = basicSalary * 0.1;
		double totalSalary = basicSalary+hra+bonus;
		return totalSalary;
	}
	
	void display()
	{
		System.out.println("ID:"+id);
		System.out.println("Name:"+name);
		System.out.println("Basic Salary:"+basicSalary);
		System.out.println("Total Salary:"+calculateSalary());
		
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee(10,"FirstName",40000);
		e1.display();
	}

}
