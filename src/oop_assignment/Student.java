package oop_assignment;

public class Student extends Person{
	
	float marks;
	
	Student()
	{
		
	}
	Student(String name, int age, float marks)
	{
		super(name,age);
		this.marks=marks;
	}
	
	void display()
	{
		System.out.println("Name:"+name+" age:"+age+" marks:"+marks);
	}
	
	
	public static void main(String[] args) {
		Student s1= new Student("MyFirstBane",19,80F);
		
		s1.display();
	}
	
	
	

}
