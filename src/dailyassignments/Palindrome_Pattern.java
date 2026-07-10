package dailyassignments;

public class Palindrome_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=0;
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5-i;j++)
			{
				System.out.print("  ");
			}
			for(int k=0;k<i;k++)
			{
				System.out.print(++num+" ");
				
			}
			for(int l=0;l<i;l++)
			{	
				if(num>=i)
				{
					num--;
				}
				if(num>=1)
				{
				System.out.print((num--)+" ");
				}
			}		
			
			System.out.println();
		}

	}

}
