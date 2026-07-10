package day3;

public class Program10_MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(sum());
		System.out.println(sum(5));
		System.out.println(sum(10,5));
		System.out.println(sum(10.5F,11.5F));

	}
	
	static int sum(int num1,int num2)
	{
		return num1+num2;
	}
	
	static int sum(int num1)
	{
		return num1;
	}
	
	static int sum()
	{
		return -1;
	}
	
	static float sum(float num1,float num2)
	{
		return num1+num2;
	}

}
