
public class TestCharType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1 = 't';
		char c2 = 'a';
		char c3 = 'k';
		System.out.println(c1+c2+c3); //da sume warto�ci kodu ASCI 
		System.out.println(""+c1+c2+c3); // pusty string sprowadzzi wynik do typu string
		c1++;
		c2++;
		c3++;
		System.out.println(""+c1+c2+c3); // przyk�ad kodowania
		System.out.println(3/5d); //dodaj�c d - uzyskujemy liczb� mo�liw� do wy�lwieltenia - wynik jest typu double
		System.out.println((float)(3/5d));
		System.out.println(Math.round(3/7d));
		System.out.println(Math.round(3/5d));
		
	}

}
