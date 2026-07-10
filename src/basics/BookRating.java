package basics;

public class BookRating extends Rating{
	
	boolean doYouLike;
	
	BookRating()
	{
		System.out.println("I am Book Rating");
	}
	@Override
	void greet()
	{
		System.out.println("bye");
	}
}
