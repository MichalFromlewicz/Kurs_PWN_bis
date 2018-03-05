import java.util.Arrays;
import java.util.Random;

public class J45 {

	public static void main(String[] args) {
		
		Random gen = new Random();
			
		int[][] tab1 = new int[5][5];
		int x=0;
		
		
		for(int i=0; i<tab1.length; i++) {
			for(int j=0; j<tab1[i].length; j++) {
				x = gen.nextInt(11)-5;
				tab1[i][j] = x;
				//System.out.println(tab1[i][j]);
				System.out.println(Arrays.deepToString(tab1));
			}
		}
		int max=0;
		int min=0;
		for (int i=0; i<=tab1.length; i++) {
			for(int j=0; j < tab1[i]; j++) {
				System.out.print("\t" + tab1[i][j]);
			}
		}
			
				
				
			
			
					
		
	}
		
}	
		
