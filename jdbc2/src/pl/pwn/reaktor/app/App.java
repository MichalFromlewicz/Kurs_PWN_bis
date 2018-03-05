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
			
			ZawodnikController zawodnikController = new ZawodnikController(dbcon);
			List<Zawodnik> zawodnicy = zawodnikController.selectAll();
			zawodnikController.view(zawodnicy);
			
			List<Zawodnik> insertZawodnicy = new ArrayList<>();
			LocalDate localDataUr = LocalDate.of(1990, 10,5);
			Date dataUr = Date.from(localDataUr.atStartOfDay(ZoneId.systemDefault()).toInstant());
			Zawodnik z1 = new Zawodnik(100, "Jan", "Kowlaski", "GER", dataUr, 177, 80);
			
			insertZawodnicy.add(z1);
			
			zawodnikController.insert(insertZawodnicy);
			zawodnikController.view(zawodnikController.selectAll());
			
			zawodnikController.delete(100);
			zawodnikController.view(zawodnikController.selectAll());
			
			// Wywo³anie metody writeToTable
			try {
				writeToTable(dbcon);
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
	
	static void writeToTable(DBConnect dbConnect) throws ParseException {
		
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
			
			ZawodnikController zawodnikController = new ZawodnikController(dbConnect);
			List<Zawodnik> zawodnicy = new ArrayList<>();
			zawodnicy.add(zawodnikController.mapper(daneZawodnika));
			zawodnikController.insert(zawodnicy);
						
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
}
