package array_assignment;

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {4, 2, 4, 6, 2, 2, 7, 8, 9 ,7, 8, 1, 1};
		int count=0;
		boolean flag=false;
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr.length-1;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					continue;
					
				}
				for(int k=i+1;k<arr.length;k++)
				{
					if(arr[i]==arr[k])
					{
						flag=true;
						break;
					}
					
				}
				
				
			}
			if(count>0 && flag==false)
			{
				System.out.println(arr[i]+" occurs "+count+" times");
			}
			count=0;
			flag=false;
			
			
		}

	}

}
