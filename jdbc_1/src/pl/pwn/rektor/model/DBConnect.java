package pl.pwn.rektor.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;
import java.sql.PreparedStatement;


public class DBConnect {

	public static void main (String[] args) {
		
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/skoczkowie?useSSL=false", "root", "0rozala10");
		
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery("Select * from zawodnicy");
		
		while (rs.next()) {
			System.out.print("Imie: " + rs.getString("imie"));
			System.out.print(", Nazwisko: " + rs.getString("nazwisko"));
			System.out.print(", ID Skoczka: " + rs.getInt("id_skoczka"));
			System.out.println();
			
		}
		
		PreparedStatement ps = connection.prepareStatement("Update zawodnicy SET imie = ?, nazwisko = ? where id_skoczka = ?");
		ps.setString(1, "Nowe imie");
		ps.setString(2, "Nowe nazwisko");
		ps.setInt(3, 1);
		ps.executeUpdate();
		
		rs = statement.executeQuery("Select * from zawodnicy");
		while (rs.next()) {
			System.out.printf("%15s %15s %15s", rs.getString("imie"), rs.getString("nazwisko"), rs.getInt("id_skoczka"));
			// System.out.print(", Nazwisko: " + rs.getString("nazwisko"));
			// System.out.print(", ID Skoczka: " + rs.getInt("id_skoczka"));
			
			System.out.println();
		}
		
		connection.close();
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}
