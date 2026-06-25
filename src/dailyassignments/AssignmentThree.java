package dailyassignments;

public class AssignmentThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*		Student Grade Calculator (if-else-if)
		Problem Statement

		Write a Java program that accepts the marks of a student (out of 100) and displays the corresponding grade based on the following criteria.

		Grading Criteria
		Marks	Grade
		90 – 100	A
		75 – 89	B
		60 – 74	C
		40 – 59	D
		0 – 39	Fail */
		
		int marks=67;
		
		if(marks>=90 && marks <=100)
		{
			System.out.println("Grade: A");
		}
		else if(marks>=75 && marks <=89)
		{
			System.out.println("Grade: B");
		}
		else if(marks>=60 && marks <=74)
		{
			System.out.println("Grade: C");
		}
		else if(marks>=40 && marks <=59)
		{
			System.out.println("Grade: D");
		}
		else if(marks>=0 && marks <=39)
		{
			System.out.println("Grade: Fail");
		}
		else
		{
			System.out.println("Invalid marks!");
		}
		
	}

}
