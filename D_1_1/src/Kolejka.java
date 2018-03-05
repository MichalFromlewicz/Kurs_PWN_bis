import java.util.ArrayDeque;

public class Kolejka {

	public static void main(String[] args) {
		ArrayDeque<String> kolejka = new ArrayDeque<>();
		
		kolejka.add("A");
		kolejka.add("B");
		kolejka.add("C");
		
		for (int i =0; i<kolejka.size(); i++) {
			System.out.println(kolejka.poll());
			System.out.println(kolejka.size());
		}
		
		for (String i: kolejka) {
			System.out.println(i);
		}

	}

}
