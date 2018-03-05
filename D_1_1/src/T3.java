import java.util.Scanner;

import javax.security.auth.x500.X500Principal;
import javax.sound.sampled.LineUnavailableException;

import java.io.FilterInputStream;

public class T3{

	public static void main(String[] args) {
		Scanner rl = new Scanner(new FilterInputStream(System.in) {
		@Override
		public void close() {}
		});
		
		System.out.println("Podaj liczbê");
		int liczba = rl.nextInt();
		switch(liczba){
		case 1:
			System.out.println("x = 1 lub x = 3");
			break
		case 2:
			
			
		}
	}

}
