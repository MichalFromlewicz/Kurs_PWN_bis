import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.io.FilterInputStream;

public class J50 {

	public static void main(String[] args) {

		Scanner rl = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() {}
		});
		
		HashMap<String, Double> produkty = new HashMap<>();
		ArrayList<String> nazwy =new ArrayList<>();
		Double[] tab = new Double[5];
		int suma = 0;
		String wybor = "";
		
		produkty.put("chleb", 4.66);
		produkty.put("mleko", 2.25);
		produkty.put("mas³o", 7.50);
		produkty.put("m¹ka", 2.12);
		produkty.put("cebula", 1.69);
		
		for(String i : produkty.keySet()){
			System.out.print(i+" cena: ");
			System.out.println(produkty.get(i));
		}
		
		
		while(true) {
			System.out.println("wprowadz nazwê wybranego produktu lub zakoñcz, wpisuj¹c (koniec)");
			usrN = rl.nextLine();
			if (!usrN.toLowerCase().equals("koniec"))
			suma += produkty.value(i);
			else
				break;
		
		
		rl.close();
	}

}