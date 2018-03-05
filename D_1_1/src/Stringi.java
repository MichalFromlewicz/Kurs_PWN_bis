
public class Stringi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s4="Ala";
		String s5="ma";
		String s6="Ala ma";
		String s7="Ala ma";
		System.out.println(s7==s6);
		s6 = s4+s5;
		System.out.println(s7);
		System.out.println(s6);
		System.out.println(s6==s7); // to nie ten sam adres pamiêci, dlatego faulse
		System.out.println(s7.equals(s6)); //
	}

}
