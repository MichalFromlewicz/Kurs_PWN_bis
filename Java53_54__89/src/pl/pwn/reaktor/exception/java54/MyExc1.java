package pl.pwn.reaktor.exception.java54;

public class MyExc1 extends Exception{

	private static String message = "Myexc1";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		MyExc1.message = message;
	}

	public MyExc1(String message) {
		super(message);

	}

	public MyExc1() {
		super(message);
		
	}
	
	

}
