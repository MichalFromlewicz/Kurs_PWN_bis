import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import javax.swing.event.InternalFrameListener;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList<String> imiona = new ArrayList<>();
		ArrayList<Integer> intList = new ArrayList<>();
		ArrayList<Integer> intList2 = intList; //przypisanie tozsamoœc ten sam adrs pamiêci
		ArrayList<Integer> intList3 = new ArrayList<>();
		Collections.copy(intList2, intList); // kopiuje zawartoœæ listy do listy2
 		
		intList.add(2);
		intList.add(3);
		intList.add(1);
		intList.add(2);
		intList.add(4);
		intList.add(2);
		
		intList.remove(2); // usunie pozycje z indeksem 2!
		intList.remove(new Integer(2));
		for (int i: intList) {
			System.out.println(i);
		}
		
		
		System.out.println(imiona.size()); // ile elementów w liœcie
		
		imiona.add("Ernest"); // dodawanie elementów do listy
		imiona.add("Damian");
		imiona.add("AD");
		
		System.out.println(imiona.size()); // ile elementów w liœcie
		imiona.remove("AD"); // usuwanie po elemencie
		imiona.remove(0); // usuwanie po indeksie
		System.out.println(imiona.size()); // ile elementów w liœcie
		System.out.println(intList.get(2)); // pokazuje, co jest na pozycji 2
		System.out.println(intList.contains(9)); // sprawdza czy wystêpujê
		System.out.print(Collections.frequency(intList, 2)); //zwraca ile razy wystêpuje
		System.out.println(Collections.max(intList)); // zwraca maksymaln¹ wartosc
		System.out.println(Collections.min(intList));
		Collections.sort(intList); // sortowanie
		Collections.reverse(intList); // sortowanie odwrotnr
		Collections.shuffle(intList); // miesza listê
		System.out.println(intList.indexOf(3)); // poka¿e indeks na którym wystêpujê "3"
		
		
	}

}
