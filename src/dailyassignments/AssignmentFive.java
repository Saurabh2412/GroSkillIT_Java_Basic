package dailyassignments;

public class AssignmentFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1)Print every alternate uppercase letter
		
		int num =65;
		while(num<=90)
		{
			char charone= (char) num;
			System.out.print(charone+" ");
			num=num+2;
		}
		
		//2)Print ASCII values of A to Z
		System.out.println(" ");
		
		char A='A';
		while(A<='Z')
		{
			int numone=(int) A;
			
			System.out.println(A+" = "+numone);
			A++;
		}
		
	}

}
