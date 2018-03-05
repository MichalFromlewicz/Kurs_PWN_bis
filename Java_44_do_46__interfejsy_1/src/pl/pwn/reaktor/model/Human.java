package pl.pwn.reaktor.model;

public class Human extends Humanoid {
	
	private String nazwisko;

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	@Override
	public String toString() {
		return "Human [nazwisko=" + nazwisko + ", getImie()=" + getImie() + ", getWzrost()=" + getWzrost()
				+ ", getWiek()=" + getWiek() + "]";
	}
	
	
	
	

}
