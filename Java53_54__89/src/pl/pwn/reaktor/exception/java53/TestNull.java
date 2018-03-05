package pl.pwn.reaktor.exception.java53;

public class TestNull {

	public static void main(String[] args) {
		
	tryTest("Warszawa");
	
	tryTest(null);

	}
	static void tryTest(String s) {
		try {
		System.out.println(s.length());
		}catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("Nie mo¿na wyœietliæ d³ugoœci ci¹gu, poniewaz do metody zosta³ przekazany null");
		} finally {
			System.out.println("Metoda dzia³a");
		}
	}
		

}
