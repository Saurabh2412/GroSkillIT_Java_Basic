package day3;

public class Program4_SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr3[]= {20,20,19,15,15,20,2,19,21};
		
		int largestNum=Integer.MIN_VALUE;
		int seclargestNum = Integer.MIN_VALUE;
		
		for(int i=0; i<arr3.length;i++)
		{
			if(arr3[i]>largestNum)
			{
				seclargestNum=largestNum;
				largestNum=arr3[i];
			}
			else if(arr3[i]>seclargestNum && arr3[i] != largestNum)
			{
				seclargestNum=arr3[i];
			}
		}
		
		System.out.println("Largest: "+largestNum);
		System.out.println("Second Largest: "+seclargestNum);

	}

}
