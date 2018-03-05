import java.io.FilterInputStream;
import java.util.Scanner;

public class J30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rl = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() {}
			});
		
		System.out.println("podaj liczbê ca³kowit¹, doadatni¹: ");
		int x = rl.nextInt();
		int i = 0;
		for(i=0; i<=x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		
	}

}
