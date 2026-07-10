package basics;

public class Test {
	
	int testCode;
	String testName;
	Test()
	{
		
	}
	Test(int testCode1, String testName1)
	{
		testCode=testCode1;
		testName=testName1;
	}
	
	Test(int testCode1)
	{
		testCode=testCode1;
	}
	void print()
	{
		System.out.println(testCode+" : "+testName);
	}

	int getTestCode()
	{
		return testCode;
	}
	void setTestCode(int testCode1)
	{
		testCode=testCode1;
	}
	
	String getTestName()
	{
		return testName;
	}
	void setTestName(String testName1)
	{
		testName=testName1;
	}
	
}
