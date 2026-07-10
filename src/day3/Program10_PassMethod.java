package day3;

public class Program10_PassMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int data=10;
		increment(data);
		System.out.println(data);
		
		//pass by reference
		int[] arrA= {100};
		increment(arrA);
		System.out.println(arrA[0]);
	}
	
	static void increment(int num)
	{
		num++;
	}
	static void increment(int[] arr)
	{
		arr[0]++;
	}

}
