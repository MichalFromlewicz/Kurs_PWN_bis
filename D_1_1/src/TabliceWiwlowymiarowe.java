import java.util.Arrays;

public class TabliceWiwlowymiarowe {

	public static void main(String[] args) {
		
		int[][] tabWielo1 = new int [3][3];
		int[][] tabWielo2 = {{4,5,6,},{3,4},{4}};
		
		for(int[] i: tabWielo1) {
			for(int j : i) {
				System.out.println(j);
			}
		}
		
		System.out.println(Arrays.deepToString(tabWielo1));
		System.out.println(Arrays.deepToString(tabWielo2));
		
		for(int[] i: tabWielo2) {
			for(int j : i) {
				System.out.println(j);
			}
		}
		
		System.out.println(tabWielo1[1][1]);
		
		for(int i=0; i<tabWielo1.length; i++) {
			for(int j=0; j<tabWielo1[i].length; j++) {
				tabWielo1[i][j] = i+j;
				System.out.println(tabWielo1[i][j]);
			}
		}
		
		
	}

}
