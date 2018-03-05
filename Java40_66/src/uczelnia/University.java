package uczelnia;

public class University {

	public static void main(String[] args) {

		Student st1 = new Student("Adam", "Adamowski", 11);
		Student st2 = new Student("Beata", "Bomba³a", 22);
		System.out.println("Liczba studentów: " + Student.studentCounter);
		
		Student st3 = new Student("Cecylia", "Cupia³", 33);
		System.out.println("Liczba studentów: " + Student.studentCounter);

	}

}
