package day3;

public class Program3_ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A= {10,2,3,-1,99,7,99};
		int largest=Integer.MIN_VALUE;
		int secondlargest=Integer.MIN_VALUE;
		
		for(int i=0;i<A.length;i++)
		{
			if(A[i]>largest)
			{
				largest=A[i];
			}
		}
		System.out.println("Largest: "+largest);
		for(int i=0;i<A.length;i++)
		{
			if(A[i]>secondlargest && A[i]!=largest)
			{
				secondlargest=A[i];
			}
		}
		System.out.println("Second Largest: "+secondlargest);
		
		for(int i=0;i<A.length;i++)
		{
			if(A[i]==99)
			{
				System.out.println("Postion of 99:"+i);
				break;
			}
		}
		
		
		

	}

}
