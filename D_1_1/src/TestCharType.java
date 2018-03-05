
public class TestCharType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1 = 't';
		char c2 = 'a';
		char c3 = 'k';
		System.out.println(c1+c2+c3); //da sume wartoœci kodu ASCI 
		System.out.println(""+c1+c2+c3); // pusty string sprowadzzi wynik do typu string
		c1++;
		c2++;
		c3++;
		System.out.println(""+c1+c2+c3); // przyk³ad kodowania
		System.out.println(3/5d); //dodaj¹c d - uzyskujemy liczbê mo¿liw¹ do wyœlwieltenia - wynik jest typu double
		System.out.println((float)(3/5d));
		System.out.println(Math.round(3/7d));
		System.out.println(Math.round(3/5d));
		
	}

}
