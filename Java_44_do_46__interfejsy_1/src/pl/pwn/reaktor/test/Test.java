package pl.pwn.reaktor.test;

import pl.pwn.reaktor.model.Amish;
import pl.pwn.reaktor.model.Monkey;
import pl.pwn.reaktor.model.Regular;

public class Test {

	public static void main(String[] args) {

		Regular regular = new Regular();
		regular.setImie("Jan");
		regular.setNazwisko("Kowalski");
		regular.setWiek(20);
		regular.setWzrost(180);
		
		System.out.println(regular);
		
		Regular regular2 = new Regular("Mariusz", "Nowak", 18, 170);
		
		regular.dzwoni(regular2);
		
		Monkey monkey = new Monkey("Gibby", 130, 20, "Gibbon");
		
		regular.dzwoni(monkey);
		
		regular.pytanie(regular2);
		regular.pytanie(monkey);
		
		Amish amish = new Amish("Amcio", "Amiszewski", 18, 155);
		// Ctrl+spacja+2, puszczamy, potem naciskamy l - przypisanie zwracanego parametru z metody do zmiennej
		
		String sendSMS = amish.sendSMS();
		String smsm = amish.getSMSM();
		String deafaultNumber = amish.getDeafaultNumber();
		
		System.out.println(sendSMS);
		System.out.println(smsm);
		System.out.println("Wartoœæ metody domyœlnej Amish: " + deafaultNumber);
		
		System.out.println(regular.sendSMS());
		System.out.println(regular.getSMSM());
		System.out.println("Wartoœæ metody domyœlnej Regular: " + deafaultNumber);
		
		regular.rozmawia();
	}

}
