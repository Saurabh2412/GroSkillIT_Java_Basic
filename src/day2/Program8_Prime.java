package day2;

public class Program8_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=19;
		int count=0;
		
		for(int fact=3; fact<num; fact=fact+2)
		{
			if(num%fact==0)
			{
				System.out.println("not prime");
				count++;
				break;
			}
			
		}
		if(count==0)
		{
			System.out.println("prime");
		}
		
	}

}
