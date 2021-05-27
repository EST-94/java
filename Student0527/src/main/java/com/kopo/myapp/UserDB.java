package com.kopo.myapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.sqlite.SQLiteConfig;

public class UserDB {

	public void createTable() {
		try {
			// open
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "c:/tomcat/HR0527.db", config.toProperties());
			
			// use
			String query = "CREATE TABLE myHR ( idx INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, gender TEXT, address TEXT, category TEXT )";
			
			Statement statement = connection.createStatement();
			int result = statement.executeUpdate(query);
			statement.close();
			
			// close
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
}
	
	public void insertData(String name, String gender, String address, String category) {
		
		try {
			// open
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "c:/tomcat/HR0527.db", config.toProperties());
			
			// use
			String query = "INSERT INTO myHR (name, gender, address, category) VALUES ( '" + name + "', '" + gender + "', '" + address + "', '" + category + "' )";
			
			Statement statement = connection.createStatement();
			int result = statement.executeUpdate(query);
			statement.close();
			
			// close
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String selectData() {
		String resultString = "";
		try {
			// open
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "c:/tomcat/HR0527.db", config.toProperties());
			
			// use
			String query = "SELECT * FROM myHR where ?;";
			
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, 1);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				int idx = resultSet.getInt("idx");
				String name = resultSet.getString("name");
				String gender = resultSet.getString("gender");
				String address = resultSet.getString("address");
				String category = resultSet.getString("category");
				resultString = resultString + "<tr><td>" + idx + "</td><td>" + name + "</td><td>" + gender
						+ "</td><td>" + address + "</td><td>" + category + "</td><td><a href='update?idx=" + idx + "'>수정</a></td></tr>";
			}
			preparedStatement.close();
			// close
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultString;
	}
	
	public void updateData(int idx, String name, String gender, String address, String category) {
		try {
			// open
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "c:/tomcat/HR0527.db", config.toProperties());

			String query = "UPDATE myHR SET name=?, gender=?, address=?, category=? WHERE idx=?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, gender);
			preparedStatement.setString(3, address);
			preparedStatement.setString(4, category);
			preparedStatement.setInt(5, idx);
			int result = preparedStatement.executeUpdate();
			preparedStatement.close();
			
			// close
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Infos detailsData(int idx) {
		Infos resultData = new Infos();
		try {
			// open
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "c:/tomcat/HR0527.db", config.toProperties());

			String query = "SELECT * FROM myHR WHERE idx=?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, idx);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				resultData.idx = resultSet.getInt("idx");
				resultData.name = resultSet.getString("name");
				resultData.gender = resultSet.getString("gender");
				resultData.address = resultSet.getString("address");
				resultData.category = resultSet.getString("category");
			}
			preparedStatement.close();
			
			// close
			connection.close();
		} catch (Exception e) {
		}
		return resultData;
	}
	
	public void deleteData(int idx) throws SQLException {
		Infos resultData = new Infos();

		try {
			// open
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "c:/tomcat/HR0527.db", config.toProperties());
			
			// use
			String query = "DELETE FROM myHR WHERE idx =?;";
			
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, idx);
			int resultSet = preparedStatement.executeUpdate();
			preparedStatement.close();
			
			// close
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	public String searchData(String name) {
		String resultString = "";
		try {
			// open
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "c:/tomcat/HR0527.db", config.toProperties());

			String query = "SELECT * FROM myHR WHERE name LIKE ?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, "%" + name + "%");
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				int idx = resultSet.getInt("idx");
				String tname = resultSet.getString("name");
				String gender = resultSet.getString("gender");
				String address = resultSet.getString("address");
				String category = resultSet.getString("category");
				resultString = resultString + "<tr><td>" + idx + "</td><td>" + tname + "</td><td>" + gender
						+ "</td><td>" + address + "</td><td>" + category + "</td><td><a href='update?idx=" + idx + "'>수정</a></td></tr>";
			}
			preparedStatement.close();
			
			// close
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultString;

	}
	
}
