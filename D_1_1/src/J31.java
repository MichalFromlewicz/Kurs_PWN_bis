import java.io.FilterInputStream;
import java.util.Scanner;
import java.util.Spliterator;

public class J31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rl = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() {}
			});
		
		System.out.println("podaj pierwsze zdanie: ");
		String s1 = rl.nextLine();
		System.out.println("podaj drugie zdanie: ");
		String s2 = rl.nextLine();
		String s3 = String.valueOf(s2.charAt(s2.length()-3));
		for (String i: s1.split(s3)) {
		System.out.println(i);}
		
		rl.close();
	}

}
