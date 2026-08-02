package weeklyassignmentseven;
import java.util.*;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		
		System.out.println(list1);
		
		List<Integer> list2 = new ArrayList<Integer>();
		
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		list2.add(7);
		
		System.out.println(list2);
		
		Set<Integer> s1 = new HashSet<Integer>(list1); 
		s1.retainAll(list2);
		
		System.out.println(s1);
		
		Set<Integer> s2 = new HashSet<Integer>();
		for(Integer num: list1)
		{
			if(list2.contains(num))
			{
				s2.add(num);
			}
		}
		System.out.println(s2);
		
	}
		
	

}
