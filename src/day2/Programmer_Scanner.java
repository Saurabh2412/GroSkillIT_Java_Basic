package day2;
import java.util.*;
public class Programmer_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println("Enter Input:");
//		Scanner sc= new Scanner(System.in);
//		int num= sc.nextInt();
//		System.out.println("Square of: "+num+" is "+num*num);
//		
//		System.out.println("1. Press 1 to print square of 4");
//		System.out.println("2. Press 2 to check if 4 is even or odd");
//		System.out.println("Press 3 to print pattern");
//		System.out.println("4. Press any other Key to exit");
		
		
		int num=0;
		do
		{

			System.out.println("Menu:"+

				"\n1. Press 1 to print square of 4"+

				"\n2. Press 2 to check if 4 is even or odd"+

				"\n3. Press 3 to print"+ 

				   "\n****"+

				   "\n*  *"+

				   "\n*  *"+

				   "\n****"+

				"\n4. Press any other Key to exit");

			Scanner sc=new Scanner(System.in);

			 num=sc.nextInt();

			 if(num==1)

				 System.out.println("Square is 16");

			 else if(num==2)

				 System.out.println("4 is even");

			 else if(num==3)

				 System.out.println(

						 "****"+

						   "\n*  *"+

						   "\n*  *"+

						   "\n****" 

						 );

			 else

				 System.out.println("SUCCESSFULLY EXITED!");

				 

		}while(num<=3 && num>=1);
	}

}
