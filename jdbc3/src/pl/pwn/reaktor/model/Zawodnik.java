package pl.pwn.reaktor.model;

import java.util.Date;

public class Zawodnik {
	
	private int id_skoczka;
	private String imie;
	private String nazwisko;
	private String kraj;
	private Date dataUr; 
	private int wzrost;
	private int waga;
	public Zawodnik(int id_skoczka, String imie, String nazwisko, String kraj, Date dataUr, int wzrost, int waga) {
		this.id_skoczka = id_skoczka;
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.kraj = kraj;
		this.dataUr = dataUr;
		this.wzrost = wzrost;
		this.waga = waga;
	}
	public int getId_skoczka() {
		return id_skoczka;
	}
	public void setId_skoczka(int id_skoczka) {
		this.id_skoczka = id_skoczka;
	}
	public String getImie() {
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	public String getNazwisko() {
		return nazwisko;
	}
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	public String getKraj() {
		return kraj;
	}
	public void setKraj(String kraj) {
		this.kraj = kraj;
	}
	public Date getDataUr() {
		return dataUr;
	}
	public void setDataUr(Date dataUr) {
		this.dataUr = dataUr;
	}
	public int getWzrost() {
		return wzrost;
	}
	public void setWzrost(int wzrost) {
		this.wzrost = wzrost;
	}
	public int getWaga() {
		return waga;
	}
	public void setWaga(int waga) {
		this.waga = waga;
	}
	@Override
	public String toString() {
		return "Zawodnik [id_skoczka=" + id_skoczka + ", imie=" + imie + ", nazwisko=" + nazwisko + ", kraj=" + kraj
				+ ", dataUr=" + dataUr + ", wzrost=" + wzrost + ", waga=" + waga + "]";
	}
	
	
	public Zawodnik () {
		
	}
	
	
	

}
