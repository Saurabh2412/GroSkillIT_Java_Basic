package weeklyassignmenteight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import array_assignment.Frequency;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Solution 1
		String str = "swiss";
		boolean repeat =false;
		
		char ch[]=str.toCharArray();
		
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<str.length();j++)
			{
				if(i==j)
				{
					continue;
				}
				if(ch[i]==ch[j])
				{
					repeat=true;
					break;
				}
			}
			if(repeat==false)
			{
				System.out.println("First Non-repeating character: "+ch[i]);
				break;
			}
			repeat=false;
		}
		
		
		
		//Solution2
		String str1 = "swiss";
		
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		
		char[] ch1= str1.toCharArray();
		for(char c:ch1)
		{
			if(map.containsKey(c))
			{
				int value=map.get(c);
				value++;
				map.put(c, value);
			}
			else
			{
				map.put(c, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet())
		{
			if(entry.getValue()==1)
			{
				System.out.println("First Non-repeating character: "+entry.getKey());
				break;
			}
		}
		
		
		//Solution 3
		
		System.out.println(map.entrySet().stream().filter(s->s.getValue()==1).findFirst().map(entry->entry.getKey()).orElse(null));
		
		//Solution 4
		
		String str2 = "swiss";
		
		List<Character> list = new ArrayList<Character>();
		
		char[] ch2 = str2.toCharArray();
		
		for(char c:ch2)
		{
			list.add(c);
		}
		//System.out.println(list);
		
		System.out.println(list.stream().
				filter(c->list.stream().filter(x->x==c).count()==1).findFirst().orElse(null));
		
		
		
		

	}

}
