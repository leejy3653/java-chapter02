package exception;

public class MyException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public MyException() {
		super("MyException 발생");
	}
	
	public MyException(String message) {
		super(message);
	}
}
