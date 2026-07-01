package day2;

public class Program4_SwapNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=7;
		int num2=10;
		
		int temp=num1;
		num1=num2;
		num2=temp;
		
		System.out.println("num1:"+num1);
		System.out.println("num2:"+num2);
		
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("num1:"+num1);
		System.out.println("num2:"+num2);
		
		
		num1=num1^num2;
		num2=num1^num2;
		num1=num1^num2;
		System.out.println("num1:"+num1);
		System.out.println("num2:"+num2);
		
		

	}

}
