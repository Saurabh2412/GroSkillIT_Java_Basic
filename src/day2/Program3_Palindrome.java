package day2;

public class Program3_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num= 1234;
		int OriginalNum=num;
		int rev =0;
		
		while(num>0)
		{
			int r =num%10;
			rev = (rev*10) + r;
			num=num/10;
		}
		
		System.err.println("Reverse: "+rev);
		
		if(OriginalNum==rev)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
		

	}

}
