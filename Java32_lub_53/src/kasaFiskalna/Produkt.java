package kasaFiskalna;

import java.security.PublicKey;

public class Produkt {

	public String nazwa;
	
	public int cena;
	
	public String kod;
	
	public Produkt() {
		
		nazwa = "";
		cena = 0;
		kod = "0";
	}

	public Produkt(String nazwa, int cena, String kod) {
		this.nazwa = nazwa;
		this.cena = cena;
		this.kod = kod;
	}
	
	
	
}
