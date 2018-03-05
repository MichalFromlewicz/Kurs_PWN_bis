package pl.pwn.reaktor.model;

public class Humanoid {
	
	private String imie;
	private int wzrost;
	private int wiek;
	
	public Humanoid() {
	}
	
	public Humanoid(String imie, int wzrost, int wiek) {
		this.imie = imie;
		this.wzrost = wzrost;
		this.wiek = wiek;
	}
	public String getImie() {
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	public int getWzrost() {
		return wzrost;
	}
	public void setWzrost(int wzrost) {
		this.wzrost = wzrost;
	}
	public int getWiek() {
		return wiek;
	}
	public void setWiek(int wiek) {
		this.wiek = wiek;
	}
	@Override
	public String toString() {
		return "Humanoid [imie=" + imie + ", wzrost=" + wzrost + ", wiek=" + wiek + "]";
	}
	
	

}
