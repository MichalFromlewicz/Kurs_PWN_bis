import java.util.Arrays;

public class Tablice2 {

	public static void main(String[] args) {
		int[] tab1 = new int[10];
		int tab2[] = new int[10];
		int[] tab3 = {1,2,3,4,5};
		String[] tabStr = {"ER", "KR", "DA"};
		int index = 0;
		for(int i : tab1) {
			System.out.println("Tab1[" + index++ +"] = " + i);
		}
		System.out.println("-----------tab2----------");
		index =0;
		for (int i :tab2) {
			System.out.println("Tab2[" + index++ +"] = " + i);
		}
		
		System.out.println("-----------tab3----------");
		index =0;
		for (int i :tab3) {
			System.out.println("Tab3[" + index++ +"] = " + i);
		}
		
		System.out.println("-----------tabStr----------");
		index =0;
		for (String i :tabStr) {
			System.out.println("TabStr[" + index++ +"] = " + i);
		}
		
		System.out.println(Arrays.toString(tabStr));
		tab1[0] = 1;
		tab1[1] = 2;
		tab1[2] = 3;
		index = 0;
		for(int i : tab1) {
			System.out.println("Tab1[" + index++ +"] = " + i);
		}
		// pêtla do uzupe³nainai tablicy - wype³niania
		for (int i=0; i<tab1.length; i++) {
			tab1[i] = i+1;
		}
		System.out.println(Arrays.toString(tab1));
		Arrays.fill(tab2, 2); // przypisanie do kazdego indexu tablicy wartoœci 2
		System.out.println(Arrays.toString(tab2));
		System.out.println(tabStr[2]);
		System.out.println(tab3.length);
		System.out.println(tabStr[tabStr.length -1]); 
	}
	

}
