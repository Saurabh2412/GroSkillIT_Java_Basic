package weeklyassignmentseven;
import java.util.*;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str1 = "listen";
		String str2 = "silent";
		
		str1=str1.toLowerCase().replace(" ","");
		str2=str2.toLowerCase().replace(" ","");

		if(str1.length()!=str2.length())
		{
			System.out.println("Not Anagram");
		}
		else {
		
			char[] c1 = str1.toCharArray();
			char[] c2 = str2.toCharArray();
		
			Arrays.sort(c1);
			Arrays.sort(c2);
		
			if(Arrays.equals(c1, c2))
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("Not Anagram");
			}
		}
		
		
		

	}

}
