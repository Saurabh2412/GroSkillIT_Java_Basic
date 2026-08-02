package weeklyassignmentseven;
import java.util.*;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "programming";
		
		char[] letters = str1.toCharArray();
		
		Set<Character> set = new LinkedHashSet<Character>();
		
		for(char c: letters) {
			set.add(c);
		}
		
		String result="";
		StringBuilder sb = new StringBuilder();
		
		
		for(char letter:set)
		{
			sb.append(letter);
		}
		
		result=sb.toString();
		
		System.out.println(result);	
		

	}

}
