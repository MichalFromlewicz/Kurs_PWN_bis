package pl.pwn.reaktor.app;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.omg.PortableInterceptor.ORBInitInfoPackage.DuplicateName;

import java.io.*;

public class Reader {

	Scanner rl;

	public Reader() {
		this.rl = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() {
			}
		});

	}

	public String readString(String nazwaDanej) {
		System.out.println("Podaj " + nazwaDanej + ":");

		String dana = rl.next();

		if (!dana.isEmpty()) {
			return dana;
		} else {
			System.out.println("Podany ci¹g jest pusty, podaj dane jeszcze raz");

			throw new InputMismatchException();
		}

	}

	public int readInt(String nazwaDanej) {
		System.out.println("Podaj " + nazwaDanej + ":");

		int dana = 0;
		try {
			dana = rl.nextInt();
		} catch (Exception e) {
			System.out.println("Dane nieporawne, spróbuj jeszcze raz");
			rl.nextLine();
			throw new InputMismatchException();

		}

		rl.nextLine();
		if (dana > 0) {
			return dana;
		}

		System.out.println("Podana liczba musi byæ wiêksza od zera, spróbuj jeszcze raz");
		throw new InputMismatchException();
	}

	public void close() {
		rl.close();
	}
}
