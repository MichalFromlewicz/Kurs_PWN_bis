package pl.pwn.reaktor.test;

import java.util.Scanner;

import pl.pwn.reaktor.model.KontoBank1;
import pl.pwn.reaktor.model.KontoBank2;
import pl.pwn.reaktor.model.KontoBankowe;

public class BankTest {

	public static void main(String[] args) {

		Scanner rl = new Scanner(System.in);
		
		System.out.println("Podaj nr konta: ");
		String nrKonta = rl.nextLine();
		System.out.println("Podaj saldo pocz�tkowe: ");
		Double saldo = rl.nextDouble();
		rl.nextLine();
		System.out.println("W kt�rym banku otworzyc konto [1 lub 2]: ");
		String wybor = rl.nextLine();
		
		KontoBankowe konto = null;
		switch (wybor) {
		case "1":
			konto = new KontoBank1(nrKonta, saldo);
			break;
		case "2":
			konto = new KontoBank2(nrKonta, saldo);
			break;

		default:
			System.out.println("nieprawid�owy wyb�r - nie ma takiego banku!");
			
		}
		if (konto == null) {
			rl.close();
			return;
		}
		
		System.out.println(konto);
		
		System.out.println("Podaj wysoko�c wp�aty: ");
		Double wplyw = rl.nextDouble();
		konto.addSaldo(wplyw);
		System.out.println("saldo po wp�acie: "+ konto.getSaldo() + " z�");
		
		System.out.println("Podaj wysoko�c wyp�aty: ");
		Double wyplyw = rl.nextDouble();
		konto.subSaldo(wyplyw);
		konto.printSaldo();
		
		
		
		
		
		
		rl.close();
	}

}
