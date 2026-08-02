package weeklyassignmentseven;
import java.util.*;
import java.util.stream.Collectors;

class Employee{
	
	private int id;
    private String name;
    private String department;
    private double salary;
    private int age;
	public Employee(int id, String name, String department, double salary, int age) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
    
    
    
    
}

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> list1 = new ArrayList<Employee>();
		
		Employee e1 = new Employee(1,"Rahul","HR",254000,32);
		Employee e2 = new Employee(2,"Neha","IT",1040000,35);
		Employee e3 = new Employee(3,"Aman","IT",1240000,40);
		Employee e4 = new Employee(4,"Ritesh","OP",750000,28);
		Employee e5 = new Employee(5,"Girish","IT",1045600,25);
		
		list1.add(e1);
		list1.add(e2);
		list1.add(e3);
		list1.add(e4);
		list1.add(e5);
		
		System.out.println("Question 6");
		
		list1.stream().filter(employee->employee.getAge()>30)
		.forEach(s->System.out.println(s.getName()+"-"+s.getAge()));
		
		System.out.println("\nQuestion 7");

		list1.stream().filter(employee->employee.getDepartment().equals("IT"))
		.sorted(Comparator.comparing(Employee::getName)).forEach(s->System.out.println(s.getName()));
		
		System.out.println("\nQuestion 8");
		
		List<Employee> list2=list1.stream().
				map(emp-> new Employee(
						emp.getId(),
						emp.getName(),
						emp.getDepartment(),
						emp.getSalary()*1.10,
						emp.getAge()))
				.collect(Collectors.toList());
		
		list2.forEach(s->System.out.println(s.getName()+"-"+s.getSalary()));
		
	}

}
