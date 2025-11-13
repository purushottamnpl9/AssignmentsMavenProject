package framework.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class DButils {
		
	static Properties prop = PropUtil.readData("Config.properties");
	
	public static ResultSet executeQuery(String query) throws SQLException {
		
		ResultSet dataSet = null;
		
		String url = prop.getProperty("DB_URL");
		String userName=prop.getProperty("DB_USERNAME");
		String password =prop.getProperty("DB_PASSWORD");
		
		Connection connection = DriverManager.getConnection(url,userName,password);
		dataSet = connection.createStatement().executeQuery(query);
		
		return dataSet;
	}
	
	public static List <Map<String,String>> getData(String query) throws SQLException {
		
		List<Map<String,String>> data = new ArrayList<Map<String,String>>();
		
		ResultSet rs = executeQuery(query);
		
		while(rs.next()) {
			
			Map<String,String> row = new HashMap<String,String>();
			
			for (int c =1;c<=rs.getMetaData().getColumnCount();c++) {
			String columnname =rs.getMetaData().getColumnName(c);
			String columnValue = rs.getString(c);
			row.put(columnname, columnValue);			
		}
			
			data.add(row);
		}
		
		return data;
		
		
	}
	
		public static void main(String []args) throws SQLException {
			
			String query = "select film.title as Movie_Name, category.name as Movie_Category,language.name as Movie_language\r\n"
					+ "from category\r\n"
					+ "join\r\n"
					+ "film_category\r\n"
					+ "on\r\n"
					+ "category.category_id=film_category.category_id\r\n"
					+ "join \r\n"
					+ "film\r\n"
					+ "on \r\n"
					+ "film_category.film_id = film.film_id\r\n"
					+ "join\r\n"
					+ "language\r\n"
					+ "on\r\n"
					+ "film.language_id = language.language_id\r\n"
					+ "where \r\n"
					+ "category.name='Horror' and \r\n"
					+ "film.title like '%Devil%'\r\n"
					+ "and \r\n"
					+ "language.name='English'\r\n"
					+ "order by film.title ASC\r\n"
					+ "limit 10;";
			
			List<Map<String,String>> data = getData(query);
			
			System.out.println(data);
			System.out.println(data.size());
		}
		
		
	}
	
