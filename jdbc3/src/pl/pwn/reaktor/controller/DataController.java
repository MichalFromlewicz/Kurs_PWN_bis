package pl.pwn.reaktor.controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pl.pwn.reaktor.database.DBConnect;

public class DataController {
	
	private DBConnect dbConnect;
	private StringBuilder query;

	public DataController(DBConnect dbConnect) {
		this.dbConnect = dbConnect;
	}
	
	public ResultSet selectAll(String tableName) throws SQLException {
		query = new StringBuilder("SELECT * FROM ");
		query.append(tableName);	
		return dbConnect.getStmt().executeQuery(query.toString());
	}

	public void deleteById(String tableName, String columnIdName, int id) throws SQLException {
		query = new StringBuilder("DELETE FROM ").append(tableName).append(" WHERE ").append(columnIdName).append( "=?");
		PreparedStatement ps = dbConnect.getCon().prepareStatement(query.toString());
		ps.setInt(1,id);
		ps.executeUpdate();
	}
	
	public void insert (String tableName, ArrayList<String[]> values) throws SQLException {
		ResultSet rs =selectAll(tableName);
		
		StringBuilder columns = new StringBuilder();
		int columnCount = rs.getMetaData().getColumnCount();
		for(int i=1; i<=columnCount; i++) {
			columns.append(rs.getMetaData().getColumnName(i));
			if (i != columnCount) {
				columns.append(",");
			}
		}
		
		for (String[] v : values) {
			StringBuilder valuesString = new StringBuilder();
			for (int i=0; i<v.length; i++) {
				valuesString.append("\"").append(v[i]).append("\"");
				if (i != v.length -1) {
					valuesString.append(",");
				}
			}
		
		
		StringBuilder insert = new StringBuilder("INSERT INTO ").append(tableName).append(" (").append(columns).append(" ) VALUES ( ").append(valuesString).append(" )");
		
		System.out.println(insert);
		dbConnect.getStmt().executeUpdate(insert.toString());
		
		}
	}	
	
	public List<String> getLabels(String tableName) throws SQLException{
		StringBuilder query = new StringBuilder("SELECT * FROM ").append(tableName).append(" LIMIT 1");
		ResultSet rs = dbConnect.getStmt().executeQuery(query.toString());
		List<String> labels = new ArrayList<>();
		int count = rs.getMetaData().getColumnCount();
		for (int i=1; i<=count; i++) {
			labels.add(rs.getMetaData().getColumnName(i));
		}
		
		return labels;
		
	}
	
	public ResultSet selectById(String tableName, String columnName, int id) throws SQLException {
		StringBuilder query = new StringBuilder("SELECT * FROM ").append(tableName).append(" WHERE ").append(columnName).append("=?");
		
		PreparedStatement ps = dbConnect.getCon().prepareStatement(query.toString());
		ps.setInt(1, id);
		return ps.executeQuery();
		
		
	}
	
	public boolean isExist(String tableName, String columnIdName, int id) throws SQLException {
		
		ResultSet selectById = selectById(tableName, columnIdName, id);
		return selectById.isBeforeFirst();
		
	}
}
