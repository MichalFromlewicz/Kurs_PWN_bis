import java.util.Arrays;
import java.util.Random;


public class J43 {

	public static void main(String[] args) {
		
		Random gen = new Random();
		int x = gen.nextInt(20)-10;
		
		int[] tab1 = new int[10];
		int min = 0;
		int max = 0;
		int sred = 0;
		int sredmin = 0;
		int sredplus = 0;
		
		for (int i=0; i<tab1.length; i++) {
			x = gen.nextInt(20)-10;
			tab1[i] = x;
		}
		
		System.out.println("Zawartoœæ tablicy: "+Arrays.toString(tab1));
		
		int y = 0;
		
		for (int i: tab1) {
			y = y+i;
			sred = y/10;
			if (i<min) {min = i};
				
			
		}
		
		System.out.println("Srednia elementów tablicy wynosi: "+ sred);
		System.out.println("Najmnejszy element to: "+ min);
		
	}
}
