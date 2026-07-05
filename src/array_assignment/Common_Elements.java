package array_assignment;

public class Common_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[] = {2, 5, 7, 9, 11, 5};
		int arr2[] = {1, 5, 7, 15, 20, 10};
		boolean flag=false;
		boolean flag1=false;
		
		for(int i=0; i<arr1.length;i++)
		{
			for(int j=0; j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					
					flag=true;
					break;
				}
			}
			if(flag==true)
			{
				for(int k=i+1;k<arr1.length;k++)
				{
					if(arr1[k]==arr1[i])
					{
						flag1=true;
						break;
					}
				}
				if(flag1==false)
				{
					System.out.println(arr1[i]);
				}
				flag1=false;
			}
			flag=false;
		}


	}

}
