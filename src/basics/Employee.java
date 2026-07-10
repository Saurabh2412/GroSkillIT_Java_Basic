package basics;

public class Employee {

	String name;
	int age;
	float salary;
	void print()
	{
		System.out.println(name+" "+age+" "+salary);
	}
	public Employee(String name1, int age1, float salary1) {
		// TODO Auto-generated constructor stub
		
		name=name1;
		age=age1;
		salary=salary1;
		
		System.out.println("Constructor called");
	}
	
}
