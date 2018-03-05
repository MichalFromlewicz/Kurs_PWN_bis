package pl.pwn.reaktor.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

import pl.pwn.reaktor.file.FileService;
import pl.pwn.reaktor.model.User;

public class UserApp {

	public static void main(String[] args) {

		List<User> users = new ArrayList<User>();

		Reader read = new Reader();

		String imie = "";
		String nazwisko = "";
		int wiek = 0;

		System.out.println("Ilu uzytkowników chcesz dodac do bazy?");

		int ilu = 0;
		while (true) {
			try {
				ilu = read.readInt("Ilu u¿ytkowników");
				break;
			} catch (InputMismatchException e) {

			}

		}

		for (int i = 0; i < ilu; i++) {

			while (true) {
				try {
					imie = read.readString("Imie");
					break;
				} catch (InputMismatchException e) {

				}
			}
			while (true) {
				try {
					nazwisko = read.readString("Nazwisko");
					break;
				} catch (InputMismatchException e) {

				}
			}
			while (true) {
				try {
					wiek = read.readInt("Wiek");
					break;
				} catch (InputMismatchException e) {

				}
			}

			users.add(new User(imie, nazwisko, wiek));

		}

		read.close();
		// System.out.println(users);
		
		File file = new File("C:\\Users\\micha\\Desktop\\Java - programy\\Java58_exceptions_zapis_dopliku\\src\\dane.txt");
		FileService fileService = new FileService(file);
		
		try {
			fileService.writeToFile(users);
		} catch (IOException e) {
			System.out.println("Problem z plikiem");
			e.printStackTrace();
		}
		
		try {
			fileService.readFromFile();
		} catch (FileNotFoundException e) {
			System.out.println("Plik nie zosta³ znaleziony");
			e.printStackTrace();
		}
	}

}
