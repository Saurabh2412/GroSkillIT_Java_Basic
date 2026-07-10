package basics;

public class Constructor_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t1= new Test();
		Test t2= new Test(1,"Test1");
		Test t3= new Test(2);
		t1.print();
		t2.print();
		t3.print();
		
		t3.setTestName("ABCD Exam");
		System.out.println(t3.getTestName());

	}

}
