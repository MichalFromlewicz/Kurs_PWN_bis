package uczelnia;

public class University {

	public static void main(String[] args) {

		Student st1 = new Student("Adam", "Adamowski", 11);
		Student st2 = new Student("Beata", "Bomba�a", 22);
		System.out.println("Liczba student�w: " + Student.studentCounter);
		
		Student st3 = new Student("Cecylia", "Cupia�", 33);
		System.out.println("Liczba student�w: " + Student.studentCounter);

	}

}
