import java.io.FilterInputStream;
import java.util.Scanner;
import java.util.Spliterator;

public class J32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rl = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() {}
			});
		
		while(true) {
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
}
}
