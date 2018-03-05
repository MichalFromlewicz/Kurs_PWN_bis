package pl.pwn.reaktor.exception.java54;

public class MyExc3 extends Exception {
	
	private static String message = "MyExc3";

	public MyExc3() {
		super(message);
		
	}

	public String getMessage() {
		return message;
	}

	public MyExc3(String message) {
		super(message);
		
	}

	public static void setMessage(String message) {
		MyExc3.message = message;
	}

	
	
	

}
