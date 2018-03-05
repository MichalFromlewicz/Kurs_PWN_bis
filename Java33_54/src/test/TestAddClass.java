package test;

public class TestAddClass {

	public static void main(String[] args) {
		AddClass add = new AddClass();
		System.out.println(add.dodaj(1, 2));
		System.out.println(add.dodaj(1f, 2f));
		System.out.println(add.dodaj(1d, 2d));
		System.out.println(add.dodaj(1d, 2));
		
	}
	
	
}



