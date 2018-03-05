import java.time.Year;
import java.util.Arrays;

public class Tablice {

	public static void main(String[] args) {
		
		int[] tab1 = {1,2,3};
		int[] tab2 = {4,5,6};
		
		System.out.println(tab1[0]+tab1[1]+tab1[2]+tab2[0]+tab2[1]+tab2[2]);
		
	int x =0;
	
	for (int i: tab1) {
		x = x+i;		
	}
	for (int i:tab2 ) {
		x +=i;
	}
	
	System.out.println(x);	
		
		
	}

}
