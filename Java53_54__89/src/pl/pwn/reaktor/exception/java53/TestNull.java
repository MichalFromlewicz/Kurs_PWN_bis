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
			System.out.println("Nie mo�na wy�ietli� d�ugo�ci ci�gu, poniewaz do metody zosta� przekazany null");
		} finally {
			System.out.println("Metoda dzia�a");
		}
	}
		

}
