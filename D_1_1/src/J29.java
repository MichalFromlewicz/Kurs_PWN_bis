import java.util.Scanner;

import javax.security.auth.x500.X500Principal;
import javax.sound.sampled.LineUnavailableException;

import java.io.FilterInputStream;
import java.lang.invoke.SwitchPoint;

public class J29{

	public static void main(String[] args) {
		Scanner rl = new Scanner(new FilterInputStream(System.in) {
		@Override
		public void close() {}
		});
		
				
		
		System.out.println("Wybierz �wiczenie, wybieraj�c odpowiedni� liter�:  ");
		System.out.println("a - �wiczenie J22");
		System.out.println("b - �wiczenie J27");
		System.out.println("c - �wiczenie J28");
		System.out.println("Aby wyj��, wybierz: q ");
		//rl.nextLine();
		String d1 = rl.nextLine();
		
		
		switch(d1) {
		
		case "a":
			J22.main(args);
			break;
		
		case "b":
			J27.main(args);
			break;
		
		case "c":
			J28.main(args);
			break;
			
		case "q":
			System.out.println("Do zobaczenia");
			break;
		}
	}

}
