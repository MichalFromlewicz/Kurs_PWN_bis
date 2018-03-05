package uczelnia;

public class Student {
	
	private String imie;
	
	private String nazwisko;
	
	private int nrIndeksu;
	
	public static int studentCounter;

	public Student(String imie, String nazwisko, int nrIndeksu) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.nrIndeksu = nrIndeksu;
		studentCounter ++;
	}

	@Override
	public String toString() {
		return "Student [imie=" + imie + ", nazwisko=" + nazwisko + ", nrIndeksu=" + nrIndeksu + "]";
	}
	
	

}
