
public class TestOperatorow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int b = 5;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		a = 5;
		b = 3;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		// inkrementacja i dekrementacja
		int x = 0;
		System.out.println("----------------");
		System.out.println(x);
		System.out.println("----------------");
		System.out.println(x++);
		System.out.println(x++);
		System.out.println(x++);
		System.out.println("----------------");
		System.out.println(++x);
		System.out.println(++x);
		System.out.println(++x);
		System.out.println("----------------");
		System.out.println(x--);
		System.out.println(x--);
		System.out.println(x--);
		System.out.println("----------------");
		System.out.println(--x);
		System.out.println(--x);
		System.out.println(--x);
		
		System.out.println("----------------");
		System.out.println("----------------");
		
		a=2;
		b=3;
		
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println("----------------");
		boolean z =(a>b);
		System.out.println(z);
		
		System.out.println("----------------");
		System.out.println("----------------");
		System.out.println("tekst" instanceof java.lang.String);
		
		System.out.println("-----operatory logiczne-----------");
		System.out.println(!("tekst" instanceof java.lang.String)); // wykrzyknik z przodu zmienia true na false 
		System.out.println(a>b && a==b); // false
		System.out.println(a>b || a==b); // false
		System.out.println(a<b || a==b); // true
		System.out.println((a>b)?1:0); //Jezeli a wiêksze od b to 1, inaczej 0
		System.out.println((a>b)?a:b); // zwróci zawsze wiêksza wartoœæ !!!
	}

}
