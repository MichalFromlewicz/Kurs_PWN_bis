package firma;

public class Prcownik {
	String imie;
	String nazwisko;
	int wiek;
	
	public Prcownik() {
		this.imie = "";
		this.nazwisko = "";
		this.wiek = 0;
	}
	
	public Prcownik(String imie, String nazwisko) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.wiek = 0;
	}

	public Prcownik(String nazwisko, int wiek) {
		this.nazwisko = nazwisko;
		this.wiek = 0;
	}
	
	public Prcownik(String imie, String nazwisko, int wiek) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.wiek = 0;
	}
		
	@Override
	public String toString() {
		return "Prcownik [imie=" + imie + ", nazwisko=" + nazwisko + ", wiek=" + wiek + "]";
	}
	
	
	
}
