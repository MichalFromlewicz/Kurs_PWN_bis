package pl.pwn.reaktor.exception.java54;

public class MyExc2 extends Exception{
	
	private static String message ="MyEx2";

	public MyExc2() {
		super(message);
		// TODO Auto-generated constructor stub
	}

		
	public String getMessage() {
		return message;
	}


	public static void setMessage(String message) {
		MyExc2.message = message;
	}


	public MyExc2(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	} 
	
	
	

}
