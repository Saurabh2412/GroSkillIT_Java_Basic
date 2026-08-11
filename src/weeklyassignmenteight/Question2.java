package weeklyassignmenteight;

import java.util.ArrayList;
import java.util.List;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] words ={"flower","flow","flight"};
		
		String prefix=words[0];
		
		for(int i=1;i<words.length;i++)
		{
			
			while(!words[i].startsWith(prefix) && !prefix.isEmpty())
			{
				prefix=prefix.substring(0,prefix.length()-1);
			}
		}
		System.out.println("Longest Common Prefix:"+prefix);
		
		
		

	}

}
