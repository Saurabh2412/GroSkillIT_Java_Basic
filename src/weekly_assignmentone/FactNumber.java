package weekly_assignmentone;

public class FactNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=6;
		int fact=1;
		
		for(int i=1; i<=num; i++)
		{
			fact = fact * i;
		}
		
		System.out.println("Factorial of "+num+" = "+fact);
	}

}
