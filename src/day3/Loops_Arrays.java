package day3;

public class Loops_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1= {10,20,30,40,50};
		
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");
			
			
		}
		arr1[0]=-1;
		System.out.println("");
		for(int i=arr1.length-1;i>=0;i--)
		{
			System.out.println(arr1[i]+" ");
		}
	}

}
