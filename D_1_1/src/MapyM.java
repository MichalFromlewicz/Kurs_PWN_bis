import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MapyM {

	public static void main(String[] args) {
		HashMap<Integer, String> mapa = new HashMap<>();
		HashMap<Integer[], ArrayList<String>> mapa2 = new HashMap<>();
		ArrayList<String> strList =new ArrayList<>();
		Integer[] tab = new Integer[10];
		Arrays.fill(tab, 3);
		mapa2.put(tab, strList);
		mapa.put(2, "A");
		mapa.put(1, "B");
		mapa.put(3, "C");
		
		for(int i : mapa.keySet()){
			System.out.println(mapa.get(i));
			System.out.println(i);
		}
		
		for(String i : mapa.values()) {
			System.out.println(i);
		}

	}

}
