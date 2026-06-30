package dailyassignments;

public class AssignmentFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Write a Java program to find the largest digit in a given number. Example:
		 * Input: 59371 Output: 9
		 */
		
		int num=856371;
		int largestdigit=0;
		while(num>0)
		{
			int rem=num%10;
			
			if(rem>largestdigit)
			{
				largestdigit=rem;
			}
			num=num/10;
		}
		
		System.out.println("Largest Number: "+largestdigit);
	}

}
