import java.util.Arrays;
import java.util.Random;


public class J44 {

	public static void main(String[] args) {
		
		Random gen = new Random();
			
		int[] tab1 = new int[20];
		
		
		for (int i=0; i<tab1.length; i++) {
			int x = gen.nextInt(11)+1;
			tab1[i] = x;
		}
		
		int z=0;
		System.out.println("Zawartoœæ tablicy: "+Arrays.toString(tab1));
	
		for (int y=1; y<=10; y++) {
			for (int i=0; i<tab1.length; i++) {
			if (tab1[i] == y) {
				z += 1;
				
			}
			}
			System.out.println(y+"->"+z);
			z=0;
		}
	}		
}	
		
