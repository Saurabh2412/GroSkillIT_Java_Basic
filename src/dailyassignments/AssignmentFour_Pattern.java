package dailyassignments;

public class AssignmentFour_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=5;i++)
		{
			for(int j=1;j<=5-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<i;k++)
			{
				System.out.print("*");
			}
			for(int l=0;l<i-1;l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
//		for(int i=1;i<5;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print(" ");
//			}
//			for(int k=0;k<5-i;k++)
//			{
//				System.out.print("*");
//			}
//			for(int l=1;l<5-i;l++)
//			{
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}

	}

}
