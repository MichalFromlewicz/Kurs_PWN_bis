import java.util.ArrayList;
import java.util.Scanner;
import java.io.FilterInputStream;

public class J49 {

	public static void main(String[] args) {

		Scanner rl = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() {}
		});
		
		ArrayList<String> usrText = new ArrayList<>();
		String usrN = " ";
		while(true) {
			System.out.println("wprowadz tekst lub zakoncz, wpisuj¹c (end)");
			usrN = rl.nextLine();
			if (!usrN.toLowerCase().equals("end"))
			usrText.add(usrN);
			else
				break;
		}
		System.out.println("Elementy listy: ");	
		for (String i: usrText) {
				System.out.println(i);
		}
		rl.close();
	}

}
