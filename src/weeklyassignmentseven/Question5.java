package weeklyassignmentseven;

import java.util.*;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=10;
		
		List<Integer> list1 = Arrays.asList(1,2,4,6,7,9);
		Set<Integer> s1 = new LinkedHashSet<Integer>(list1);
		Set<Integer> missing = new LinkedHashSet<Integer>();
		
		for(int i=1;i<=n;i++)
		{
		
			if(!s1.contains(i))
			{
				missing.add(i);
			}	
		
		}
		System.out.println(missing);

	}

}
