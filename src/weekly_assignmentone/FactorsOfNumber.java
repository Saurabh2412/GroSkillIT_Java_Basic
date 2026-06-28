package weekly_assignmentone;

public class FactorsOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 24;
		System.out.println("Factors of 24 are:");
		for(int i=1; i<=num;i++)
		{
			if((num%i)==0)
			{
				System.out.println(i);
			}
		}

	}

}
