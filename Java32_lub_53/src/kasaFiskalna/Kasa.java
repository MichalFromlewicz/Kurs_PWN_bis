package kasaFiskalna;

import java.io.FilterInputStream;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Scanner;

public class Kasa {
	
	ArrayList<String> cart = new ArrayList<>();
	
	float totalValue=0;

	public static void main(String[] args) {
		
		Magazyn magazyn = Magazyn.init();
		
		Scanner rl = new Scanner(new FilterInputStream(System.in) {
		@Override
		public void close() {}
	});
	
	
		
		Kasa kasa = new Kasa();
		while (true) {
			System.out.println("Podaj kod produktu (00x )lub zakoñcz \"end\":");
			String rlToDo=rl.nextLine();	
		if (rlToDo.toLowerCase().equals("end"))	{
			kasa.printBill(magazyn);
			break;
		} else {
			kasa.addProd(magazyn, rlToDo);
		}
		}
		
	

	
	}
	
	public void addProd(Magazyn magazyn, String kod) {
		Produkt p= magazyn.getProdukt(kod);
		totalValue += p.cena;
		cart.add(p.kod);
		
	}
	
	public void printBill(Magazyn magazyn) {
		for (String c : cart) {
			Produkt buyProd = magazyn.getProdukt(c);
			System.out.println("Produkt: " + buyProd.nazwa +""+buyProd.cena +" z³");
		}
		System.out.println("Suma zkupów: " + totalValue);
	} 
}
