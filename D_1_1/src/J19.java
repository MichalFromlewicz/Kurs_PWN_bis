import java.util.Scanner;

public class J19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Prosze podac imiê i nacisnac ENTER: \n");
		Scanner s1 = new Scanner(System.in);
		String imie = s1.nextLine();
		System.out.println(imie + ", witaj na kursie Javy!!!!");
		//String imie = s1.nextInt();
		
		
		
		s1.close();
		
	}

}