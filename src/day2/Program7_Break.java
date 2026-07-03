package day2;

public class Program7_Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello");
		
		for(int i=1; i<=10;i++)
		{
			if(i==7)
			{
				System.out.println("Number found");
				break;
			}
			System.out.println(i);
		}
		System.out.println("BYE");
		
		int j=1;
		while(j<=10)
		{
			if(j==7)
			{
				System.out.println("Number found");
				break;
			}
			System.out.println(j);
			j++;
		}

	}

}
