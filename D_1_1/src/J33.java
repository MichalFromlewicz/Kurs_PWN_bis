import java.io.FilterInputStream;
import java.text.BreakIterator;
import java.util.Scanner;
import java.util.Spliterator;

public class J33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rl = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() {}
			});
		
		int a=0;
		int i=0;		
		
		while(true) {
			try {
				System.out.println("podaj liczbê A:");
				a = rl.nextInt();
				if(a>0) {
					
					break;
				}
				} catch (Exception e) {
					rl.nextLine();
				}
			for (i=0; i<=a; i++);
			System.out.println(Math.pow(2,a));
		}
		rl.close();	
		}
			
}

		/*while(true) {
			try {
				System.out.println("podaj wiek: ");
				int wiek = rl.nextInt();
				if (wiek >= 18) {
					System.out.println("Mo¿esz g³osowaæ!");
		}
		else {
			System.out.println("Nie mo¿esz g³osowaæ!");
		}
		break;
	} catch (Exception e) {
		rl.nextLine();
	}
	}
		
        System.out.println("Wprowadz napis: ");
		 String d1 = rl.nextLine();
		while(true) {
			try {
		System.out.println("Wprowadz liczbê: ");
		int l1 = rl.nextInt();
		int i =0;
		for (i = 0; i<=d1.length(); i += l1) {
			System.out.println(d1.charAt(i));
			}
		break;
			} catch (Exception e) {
				rl.nextLine();
			}
			rl.close();
			}
	}*/
	



