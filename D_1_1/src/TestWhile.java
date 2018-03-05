import java.io.FilterInputStream;
import java.util.Scanner;

public class TestWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rl = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() {
			}
		});

		int i = 0;
		while (i < 20) {
			System.out.println(i++);
		}

		String f = "";
		while (true) {
				System.out.println("Podaj q jeœli chcesz zakonczyæ");
				f = rl.nextLine();

				if (f.equals("q")) {

					break;
				}
		} while
			rl.close();
		}

	}

