import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Arrays;

public class Zbiory {

	public static void main(String[] args) {
		HashSet<String> strSet = new HashSet<>();
		boolean czyUnikalny = false;
		boolean czyUsuniety = false;
		czyUnikalny = strSet.add("Ernest");
		System.out.println(czyUnikalny);
		czyUnikalny = strSet.add("Ernest");
		System.out.println(czyUnikalny);
		
		for(String i: strSet) {
			System.out.println(i);
		}
		
		System.out.println(strSet.isEmpty());
		ArrayList<String> strList = new ArrayList<>();
		strList.add("Franek");
		
		strSet.addAll(Arrays.asList("A","B","C"));

	}

}
