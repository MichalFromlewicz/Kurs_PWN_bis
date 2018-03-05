package src;

public class Company {

	public static void main(String[] args) {
		Emploee pracwnik1 = new Emploee();
		Emploee pracwnik2 = new Emploee();
		Emploee pracwnik3 = new Emploee();
		
		pracwnik1.imie ="Marek";
		pracwnik1.nazwisko = "Markiewicz";
		pracwnik1.rokUrodzenia = 1980;
		pracwnik1.wiek = 38;

		pracwnik2.imie ="Aldona";
		pracwnik2.nazwisko = "Aldoneska";
		pracwnik2.rokUrodzenia = 1970;
		pracwnik2.wiek = 28;
		
		pracwnik3.imie ="Yoko";
		pracwnik3.nazwisko = "Ono";
		pracwnik3.rokUrodzenia = 1956;
		pracwnik3.wiek = 61;
		
		System.out.println("Pracownik 1: " + pracwnik1.imie + " " + pracwnik1.nazwisko + ", rocznik: "+pracwnik1.rokUrodzenia+", wiek: "+pracwnik1.wiek);
		System.out.println("Pracownik 2: " + pracwnik2.imie + " " + pracwnik2.nazwisko + ", rocznik: "+pracwnik2.rokUrodzenia+", wiek: "+pracwnik2.wiek);
		System.out.println("Pracownik 3: " + pracwnik3.imie + " " + pracwnik3.nazwisko + ", rocznik: "+pracwnik3.rokUrodzenia+", wiek: "+pracwnik3.wiek);
	}

}
