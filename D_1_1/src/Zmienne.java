import java.io.SequenceInputStream;

public class Zmienne {

	public static void main(String[] args) {
		
		final int PIERWSZA_STALA;
		int firstInt;
		String firstString = "Ernest";
		String cesString = new String("Damian");
		System.out.println(cesString);
		
		firstInt = 45;
		int secInt = 34;
		System.out.println(firstInt+secInt);
		System.out.println(firstString + " ma " + firstInt + " lat.");
		
		byte nowaZmienna = 9;
		float firstFloat = 45.6f; // dodadnie f na koñcu powoduje brak b³êdu
		double firstDoube = 34.7;
		nowaZmienna = 56;
		System.out.println(nowaZmienna);
		PIERWSZA_STALA = 9;
		
		

	}

}
