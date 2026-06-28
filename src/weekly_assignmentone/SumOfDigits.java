package weekly_assignmentone;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num= 4567;
		int r=0;
		int sum=0;
		
		while(num!=0)
		{
			r=num%10;
			sum=sum+r;
			num=num/10;
		}
		
		System.out.println("Sum of digits"+" = "+sum);

	}

}
