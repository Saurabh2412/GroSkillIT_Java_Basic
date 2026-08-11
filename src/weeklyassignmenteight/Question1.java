package weeklyassignmenteight;

import java.util.Arrays;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="listen";
		String s2="silent";
		
		char[] charArray1 = s1.replace(" ","").toLowerCase().toCharArray();
		char[] charArray2 = s2.replace(" ","").toLowerCase().toCharArray();
		
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		if(Arrays.equals(charArray1, charArray2))
		{
			System.out.println("Strings are Anagram.");
		}
		else
		{
			System.out.println("Strings are not Anagram.");
		}
	}

}
