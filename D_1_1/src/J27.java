import java.util.Locale;
import java.util.Scanner;
import java.io.FilterInputStream;


public class J27{

	public static void main(String[] args) {
		Scanner rl = new Scanner(new FilterInputStream(System.in) {
		@Override
		public void close() {}
		});
		
		rl.useLocale(Locale.US);
		
		System.out.println("Podaj liczbê: ");
		double ra = rl.nextDouble();
		
		if(ra>0) {
			if (ra<1) {
			System.out.println("OK");
			
		} else {
			System.out.println("Not OK");
			rl.close();
		}
		}
			
	}

}
