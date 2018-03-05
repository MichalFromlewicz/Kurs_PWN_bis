package calculator;

import java.io.FilterInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class CalcTest {

	public static void main(String[] args) {
		Calkculator calculator = new Calkculator();
		Scanner rl = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() {}
		});
		System.out.println("Kalkulator (+,-)");
		System.out.println("Podaj dzia³anie: ");
		String dzial = rl.nextLine();
		System.out.println("Podaj liczbê elementów (2-3): ");
		int liczby = rl.nextInt();
		ArrayList<Double> liczbyLista = new ArrayList<>();
		for (int i=0; i<liczby; i++) {
			Double x = rl.nextDouble();
			liczbyLista.add(x);
		}
		switch (dzial) {
		case "+":
			if (liczbyLista.size()==2) {
				calculator.add(liczbyLista.get(0), liczbyLista.get(1));
			} else if (liczbyLista.size()==3) {
				calculator.add(liczbyLista.get(0), liczbyLista.get(1), liczbyLista.get(2));
			}
			break;
		case "-":
			if (liczbyLista.size()==2) {
				calculator.sub(liczbyLista.get(0), liczbyLista.get(1));
			} else if (liczbyLista.size()==3) {
				calculator.sub(liczbyLista.get(0), liczbyLista.get(1), liczbyLista.get(2));
		}
		break;
		
		default:
			System.out.println("Brak takiego dzia³ania!");
			break;
		}
	}

}
