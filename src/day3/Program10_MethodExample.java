package day3;

public class Program10_MethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arrB= {10,20,30,40,50};
		sumOfArray(arrB);
	}
	
	static void sumOfArray(int arr[])
	{
		int total=0;
		for(int num:arr)
		{
			total=total+num;
			System.out.println(total);
		}
	}

}
