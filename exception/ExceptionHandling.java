package exception;

public class ExceptionHandling {

	public static void main(String[] args) {

		//int mInt = Integer.parseInt("what?"); //cause NumberFormatException so it needs to be placed in a try, catch block
		
		try {
			int mInt  = Integer.parseInt("what");
			
		}
		catch(NumberFormatException nfe) {
			System.out.println("you cant do that!");
		}
		finally {
			System.out.println("this will be executed no matter what!");
		}

	}

}
