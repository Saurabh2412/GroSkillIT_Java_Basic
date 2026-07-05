package array_assignment;

public class Duplicate_Prints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {5, 3, 8, 5, 2, 3, 9, 8,9,9,5,6,2};
		boolean flag=false;
		
		for(int i=0; i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					flag=true;
					break;
				}
				
			}
			if(flag==false)
			{
				System.out.println(arr[i]);
			}
			flag=false;
			
		}

	}

}
