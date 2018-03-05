package pl.pwn.reaktor.model;

import pl.pwn.reaktor.model.intrfaces.Pager;
import pl.pwn.reaktor.model.intrfaces.Phone;

public class Regular extends Human implements Phone, Pager {
	
	public Regular() {
		super();
	}
		public Regular(String imie, String nazwisko, int wiek, int wzrost) {
			super();
			setImie(imie);
			setNazwisko(nazwisko);
			setWiek(wiek);
			setWzrost(wzrost);
			
	}

	@Override
	public void dzwoni(Humanoid humanoid) {
		if (humanoid instanceof Human) {
			System.out.println("Dzwoni: " + humanoid.toString());
		} else if (humanoid instanceof Monkey) {
			System.out.println("Ten obiekt to nie cz³owiek");
		}
		
	}

	@Override
	public void rozmawia() {
		System.out.println("Regular rozmawia");
		
	}

	@Override
	public void koniec() {
		System.out.println("Koniec rozmowy");
		
	}

	@Override
	public void pytanie(Humanoid humanoid) {

		System.out.println("Przedstaw siê");
		this.odpowiedz(this);
		
	}

	@Override
	public void odpowiedz(Humanoid humanoid) {
		System.out.println("Na imiê mam " + this.getImie());
		
	}
	@Override
	public String sendSMS() {
		// TODO Auto-generated method stub
		return "Regular wysy³a SMS";
	}
	@Override
	public String getSMSM() {
		// TODO Auto-generated method stub
		return "Regular odbiera SMS";
	}

}
