package unchecked;

//public class MyUncheckedException extends RuntimeException{
public class MyUncheckedException extends IllegalArgumentException{
	public MyUncheckedException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
}

