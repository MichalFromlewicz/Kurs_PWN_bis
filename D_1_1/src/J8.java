
public class J8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Pierwszy";
		String s2 = "Drugi";
		String s3 = s1+s2;
		String s4 = s3 + "Dodatkowy";
		
		System.out.println(s3.toUpperCase());
		System.out.println(s4.toLowerCase());
		System.out.println(s4.substring(0,5));
		System.out.println(s4.length());
		System.out.println(s3.charAt(2));
		System.out.println(s3.charAt(5));
		System.out.println(s4.charAt(s4.length()-3));
		System.out.println(s4.substring(0,(s1.length())));
		System.out.println(s4.substring((s1.length()),(s1.length())+(s2.length())));
		
		
		
		

	}

}
