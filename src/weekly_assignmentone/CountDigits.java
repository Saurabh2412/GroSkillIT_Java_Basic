package weekly_assignmentone;

public class CountDigits {
	
	public static void main(String[] args) {
		
		int num= 987654;
		int count=0;
		
		while(num!=0)
		{
			num=num/10;
			if(num>0);
			{
				count++;
			}
		}
		
		System.out.println("Number of digits"+" = "+count);
	}

}
