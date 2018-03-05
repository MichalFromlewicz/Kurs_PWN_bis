package pl.pwn.reaktor.controller;

import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import pl.pwn.reaktor.database.DBConnect;
import pl.pwn.reaktor.model.Zawodnik;
import pl.pwn.reaktor.utils.DateUtils;

public class ZawodnikController{
	
	private DataController dataController;
	private ResultSet resultSet;
	
	public ZawodnikController(DBConnect dbConnect) {
		this.dataController = new DataController(dbConnect);
	}
	
	
	public List<Zawodnik> selectAll() throws SQLException{
		List<Zawodnik> zawodnicy = new ArrayList<>();
		resultSet = dataController.selectAll("zawodnicy");
		while(resultSet.next()) {
			zawodnicy.add(mapper(resultSet));
		}
		return zawodnicy;
		
		
	}
	
	private Zawodnik mapper(ResultSet rs) throws SQLException {
		
		return new Zawodnik(rs.getInt("id_skoczka"), rs.getString("imie"), rs.getString("nazwisko"), rs.getString("kraj"), rs.getDate("data_Ur"), rs.getInt("wzrost"), rs.getInt("waga"));
	}
	
	public void view(List<Zawodnik> zawodnicy) {
		System.out.println("Zawodnicy:");
		try {
			List<String> labels = dataController.getLabels("zawodnicy");
			for (String label : labels) {
				System.out.printf("%15s ", label);
				
			}
			System.out.println();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		for (Zawodnik zawodnik : zawodnicy) {
			
			System.out.printf("%15s %15s %15s %15s %15s %15s %15s \n", zawodnik.getId_skoczka(), zawodnik.getImie(), zawodnik.getNazwisko(), zawodnik.getKraj(), zawodnik.getDataUr(), zawodnik.getWzrost(),zawodnik.getWaga());
			
		}
	}
	
	public void insert(List<Zawodnik> zawodnicy) {
		
		ArrayList<String[]> values = new ArrayList<>();
		
		for (Zawodnik zawodnik : zawodnicy) {
			String[] tab = new String[7];
			tab[0]= new Integer(zawodnik.getId_skoczka()).toString();
			tab[1]= zawodnik.getImie();
			tab[2]= zawodnik.getNazwisko();
			tab[3]= zawodnik.getKraj();
			tab[4]= DateUtils.convertDate(zawodnik.getDataUr());
			tab[5]= new Integer(zawodnik.getWzrost()).toString();
			tab[6]= new Integer(zawodnik.getWaga()).toString();
			
			values.add(tab);
		}
		
		try {
			dataController.insert("Zawodnicy", values);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void delete(int id) {
		try {
			if (dataController.isExist("zawodnicy","id_skoczka", id)) {
			dataController.deleteById("zawodnicy", "id_skoczka", id);
			} else {
				System.out.println("Brak zawodnika po takim Id do duzuiêcia");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Zawodnik mapper(Map<String, String>map) throws ParseException {
		int idSkoczka = new Integer(map.get("id_skoczka"));
		String imie = map.get("imie");
		String nazwisko = map.get("nazwisko");
		String kraj = map.get("kraj");
		Date dataUr = DateUtils.convertString(map.get("data_ur"));
		int wzrost = new Integer(map.get("wzrost"));
		int waga = new Integer(map.get("waga"));
		return new Zawodnik(idSkoczka, imie, nazwisko, kraj, dataUr, wzrost, waga);
	}
	
}
