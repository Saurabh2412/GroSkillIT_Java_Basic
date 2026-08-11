package weeklyassignmenteight;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class Question4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		File file = new File("C:\\Users\\ADMIN\\eclipse-workspace\\GroSkillIT_Java_Basic\\src\\weeklyassignmenteight\\testData.txt");
		
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		String str;
		
		StringBuilder sb = new StringBuilder();
		while((str=br.readLine())!=null)
		{
			sb.append(str).append(" ");
		}
		
		String[] mainString = sb.toString().replace(".", "").split(" ");
		
		Map<String,Integer> map = new HashMap<>();
		
		for(String str1:mainString)
		{
			if(map.containsKey(str1))
			{
				int value = map.get(str1);
				value++;
				map.put(str1, value);
			}
			else
			{
				map.put(str1, 1);
			}
		}
		
		map.entrySet().stream()
		.sorted((o1, o2) -> o2.getValue()-o1.getValue())
		.toList()
		.forEach(entry-> System.out.println(entry.getKey()+":"+entry.getValue()));	
		
		
	}

}
