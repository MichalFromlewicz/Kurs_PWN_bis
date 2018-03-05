package pl.pwn.reaktor.model;

import pl.pwn.reaktor.model.intrfaces.Pager;

public class Amish extends Human implements Pager{

	public Amish(String imie, String nazwisko, int wiek, int wzrost) {
		super();
		setImie(imie);
		setNazwisko(nazwisko);
		setWiek(wiek);
		setWzrost(wzrost);
	}

	@Override
	public String sendSMS() {
		
		return "Amish wysy³a SMS";
	}

	@Override
	public String getSMSM() {
		
		return "Amish odbiera SMS";
	}

	@Override
	public void rozmawia() {
		// TODO Auto-generated method stub
		System.out.println("Amisz rozmawia");
		
	}
	
	

}
