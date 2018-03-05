import java.util.HashMap;

public class Mapy {

	public static void main(String[] args) {
		HashMap<Integer, String> mapa = new HashMap<>();
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
