package pl.pwn.reaktor.app;

import java.util.Date;
import java.util.HashMap;
import java.io.FilterInputStream;
import java.sql.SQLException;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import pl.pwn.reaktor.controller.DataController;
import pl.pwn.reaktor.controller.ZawodnikController;
import pl.pwn.reaktor.database.DBConnect;
import pl.pwn.reaktor.model.Zawodnik;

public class App {
	
	private static final String USER = "root";
	private static final String PASS = "0rozala10";

	public static void main(String[] args) {

		DBConnect dbcon = null;
		
		try {
			dbcon = new DBConnect(USER, PASS);
			dbcon.getCon().setAutoCommit(false);
			
			ZawodnikController zawodnikController = new ZawodnikController(dbcon);
		
			// Wywo³anie metody writeToTable
			try {
				writeToTable(dbcon,zawodnikController);
				
				List<Zawodnik> zawodnicy = zawodnikController.selectAll();
				zawodnikController.view(zawodnicy);
				
				Scanner rl = new Scanner(new FilterInputStream(System.in) {
					@Override
					public void close() {}
				});
				
				System.out.println("Czy chcesz zatwierdziæ wprowadzone zmainy? t/n");
				String dec = rl.nextLine().toLowerCase();
				switch (dec) {
				case "t":
					dbcon.getCon().commit();
					break;
					
				case "n":
					dbcon.getCon().rollback();
					break;
					
				default:
					System.out.println("B³êdna decyzja, dane zostan¹ automatycznie wycofane");
					dbcon.getCon().rollback();
					break;
				}
				rl.close();
				zawodnicy = zawodnikController.selectAll();
				zawodnikController.view(zawodnicy);
				
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally{
			try {
				if(dbcon !=null) {
				dbcon.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
  		
	}
	
	static void writeToTable(DBConnect dbConnect, ZawodnikController zawodnikController) throws ParseException {
		
		Scanner rl = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() {}
		});
		
		System.out.println("Witaj w programie dodawania Zawodników: ");
		DataController dataController = new DataController(dbConnect);
		try {
			Map<String, String> daneZawodnika = new HashMap<>();
			List<String> labels = dataController.getLabels("zawodnicy");
			for (String string : labels) {
				
				System.out.println("Wpisz "+ string);
				daneZawodnika.put(string, rl.nextLine());
			}
			
			
			List<Zawodnik> zawodnicy = new ArrayList<>();
			zawodnicy.add(zawodnikController.mapper(daneZawodnika));
			zawodnikController.insert(zawodnicy);
						
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
}
