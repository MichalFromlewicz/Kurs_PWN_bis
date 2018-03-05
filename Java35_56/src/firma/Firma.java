package firma;

public class Firma {
	
	public static void main (String[]args) {
		Prcownik p1 = new Prcownik();
		System.out.println(p1);
		
		Prcownik p2 = new Prcownik("Karol", "Kowalski");
		System.out.println(p2);
		
		Prcownik p3 = new Prcownik("Marek", 25);
		System.out.println(p3);
		
		Prcownik p4 = new Prcownik("Adam", "Adamowicz", 19);
		System.out.println(p4);
		
		Prcownik p5 = new Prcownik("Woiak", 24);
		System.out.println(p5);
		
	}
}