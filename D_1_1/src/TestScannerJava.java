import java.util.Scanner;

public class TestScannerJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("podaj liczbê: ");
		Scanner rl = new Scanner(System.in);
		String i = rl.nextLine();
		//i = rl.nextLine();
		//int i = rl.nextInt();
		System.out.println(i);
		rl.close();
	}

}
