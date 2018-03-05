import java.util.Scanner;
import java.io.FilterInputStream;

public class TestFor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rl = new Scanner(new FilterInputStream(System.in) {
		@Override
		public void close() {}
		});
			
			
		for (int i=0; i<10; i+=2) {
			System.out.println(i);
		}
		
		for (int i: tab){
			System.out.println(i);
		
		}
	}

}
