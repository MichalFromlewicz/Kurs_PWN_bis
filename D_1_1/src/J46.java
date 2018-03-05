import java.io.FilterInputStream;
import java.util.Scanner;

public class J46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rl = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() {}
		});
		
		int usrN = rl.nextInt();
		
		do {
			switch(usrN % 2) {
			case 0:
				usrN/=2;
				break;
			
			
		
		
		
	

}
