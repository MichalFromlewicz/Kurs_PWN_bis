package pl.pwn.reaktor.model;

public class Monkey extends Humanoid {
	
	private String gatunek;

	public Monkey(String imie, int wzrost, int wiek, String gatunek) {
		super(imie, wzrost, wiek);
		this.gatunek = gatunek;
		
	}

	public String getGatunek() {
		return gatunek;
	}

	public void setGatunek(String gatunek) {
		this.gatunek = gatunek;
	}

	@Override
	public String toString() {
		return "Monkey [gatunek=" + gatunek + ", getImie()=" + getImie() + ", getWzrost()=" + getWzrost()
				+ ", getWiek()=" + getWiek() + "]";
	}
	
	
}
