package day1;

public class Program5_TypeCasting {
	
	public static void main(String[] args) {
		
		//DownCasting or explicit type conversion
		float height = 162.5f;
		int heightInt= (int) height;
		
		System.out.println(heightInt);
		
		//upcasting ot implicit type conversion
		int age=32;
		float ageFloat=age;
		System.out.println(ageFloat);
	}

}
