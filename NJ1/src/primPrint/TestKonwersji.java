package primPrint;

public class TestKonwersji {

	public static void main(String[] args) {
		Character l1 = 'k';
		Character l2 ='o';
		Character l3 = 't';
		System.out.println("B��dne \" sumowanie \" znak�w");
		System.out.println(l1+l2+l3);
		System.out.println("Tekst jawny");
		System.out.println("" + l1+l2+l3);
		
		l1++; l2++; l3++;
		System.out.println("Tekst zaszyfrowany");
		System.out.println("Kogito "+l1+l2+l3);
		
		int a = l1;
		int b = l2;
		int c = l3;
		System.out.println("k=" +a);
		System.out.println("o="+b);
		System.out.println("t="+c);
		System.out.println(a+b+c);
		
		int x = 3;
		double d = Math.pow(x, 3);
		System.out.println(d);

	}

}
