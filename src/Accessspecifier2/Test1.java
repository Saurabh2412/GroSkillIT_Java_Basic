package Accessspecifier2;
import accessspecifier.*;

public class Test1 extends Access{
	
	void print()
	{
		protectedNum=10;
	}

}

class A{
	
	void add()
	{
		Access ac = new Access();
		ac.publicNum=10;
	}
	
}

class B extends A{
	
	void add() {
		
	}
}
