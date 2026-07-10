package day3;

public class Program8_Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;

		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print((++num)+" ");
			}
			System.out.println();
		}
		
		////////////////////////////////////
		for(int i=5;i>=0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		////////////////////////////
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
