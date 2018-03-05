import java.util.Locale;
import java.util.Scanner;
import java.io.FilterInputStream;
import java.util.Random;


public class J28{

	public static void main(String[] args) {
		Scanner rl = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() {}
			});
		
		System.out.println("Podaj liczbê: ");
		Random gen = new Random();
		int r0 = rl.nextInt();
		int r1 = gen.nextInt();
		int r2 = gen.nextInt();
		int r3 = gen.nextInt();
		int r4 = gen.nextInt();
		int r5 = gen.nextInt();
		
		if (r1>r0) {
			System.out.println(r1 + " jest wiêksze od " + r0);}
			else if (r1==r0) {System.out.println(r1 + " jest równe " + r0);}
			else {System.out.println(r1 + " jest mniejsze od " + r0);
		}
		
		if (r2>r0) {
			System.out.println(r2 + " jest wiêksze od " + r0);}
			else if (r2==r0) {System.out.println(r2 + " jest równe " + r0);}
			else {System.out.println(r2 + " jest mniejsze od " + r0);
		}
		
		if (r3>r0) {
			System.out.println(r3 + " jest wiêksze od " + r0);}
			else if (r3==r0) {System.out.println(r3 + " jest równe " + r0);}
			else {System.out.println(r3 + " jest mniejsze od " + r0);
		}
		
		if (r4>r0) {
			System.out.println(r4 + " jest wiêksze od " + r0);}
			else if (r4==r0) {System.out.println(r4 + " jest równe " + r0);}
			else {System.out.println(r4 + " jest mniejsze od " + r0);
		}
		
		if (r5>r0) {
			System.out.println(r5 + " jest wiêksze od " + r0);}
			else if (r2==r0) {System.out.println(r5 + " jest równe " + r0);}
			else {System.out.println(r5 + " jest mniejsze od " + r0);
		}
	
	}

}
