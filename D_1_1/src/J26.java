import java.util.Scanner;

import javax.security.auth.x500.X500Principal;
import javax.sound.sampled.LineUnavailableException;

import java.io.FilterInputStream;
import java.lang.invoke.SwitchPoint;

public class J26{

	public static void main(String[] args) {
		Scanner rl = new Scanner(new FilterInputStream(System.in) {
		@Override
		public void close() {}
		});
		
		
		
		System.out.println("Podaj pierwsz� liczb�: ");
		int ra = rl.nextInt();
		rl.nextLine();
		System.out.println("Wybierz dzia�anie: ");
			String d1 = rl.nextLine();
		
		System.out.println("Podaj drug� liczb�: ");
		int rb = rl.nextInt();
		
		switch(d1) {
		
		case "+":
			System.out.println("Wynik: "+(ra+rb));
			break;
		
		case "-":
			System.out.println("Wynik: "+(ra-rb));
			break;
		
		case "*":
			System.out.println("Wynik: "+(ra*rb));
			break;
			
		case "/":
			System.out.println("Wynik: "+(ra/rb));
			break;
		}
	}

}
