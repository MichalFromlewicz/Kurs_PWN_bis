
public class tabmno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] multiplicationTable = new int[9][9];
		for (int i = 0; i < 9; i++) {
			for (int j=0; j <9; j++) {
			multiplicationTable[i][j] = (i+1) * (j+1);
			System.out.print(multiplicationTable[i][j] +"\t");
			}
			System.out.println();
		}
	}

}
