package kasaFiskalna;

import java.util.HashMap;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FilterInputStream;

public class Magazyn {
	
	public HashMap<String, Produkt> produkty = new HashMap<>();
	
	public void newProdukt(String nazwa, int cena, String kod) {
		
		Produkt nowy = new Produkt(nazwa, cena, kod);
		produkty.put(kod, nowy);
		
	}

	public Produkt getProdukt(String kod) {
		
		Scanner rl = new Scanner(new FilterInputStream(System.in) {
		
			@Override
			public void close() {}
		});
		while(!produkty.containsKey(kod)) {
			System.out.println("Podaj poprawny kod produktu");
			kod = rl.nextLine();
			
					

			
		
		}
				
		rl.close();
		return produkty.get(kod);
	}
	static Magazyn init() {
		Magazyn magazyn = new Magazyn();
		magazyn.newProdukt("p¹czki", 1, "001");
		magazyn.newProdukt("chleb", 2, "002");
		magazyn.newProdukt("sok", 1, "003");
		magazyn.newProdukt("ser", 2, "004");
		magazyn.newProdukt("pomidor", 3, "005");
		
		return magazyn;
	}
}

