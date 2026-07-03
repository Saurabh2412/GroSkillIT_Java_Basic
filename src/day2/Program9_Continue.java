package day2;

public class Program9_Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hello");
		
		for(int i=1; i<=10;i++)
		{
			if(i==7)
			{
				System.out.println("Number found");
				continue;
			}
			System.out.println(i);
		}
		System.out.println("BYE");

	}

}
