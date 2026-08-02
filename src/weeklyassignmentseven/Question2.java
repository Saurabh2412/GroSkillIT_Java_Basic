package weeklyassignmentseven;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str2 = "10,20,30,40";
		int sum=0;
		
		String[] newStr = str2.split(",");
		
		for (String string : newStr) {
			int i = Integer.parseInt(string);
			
			sum= sum+i;
		}
		
		System.out.println(sum);
	}

}
