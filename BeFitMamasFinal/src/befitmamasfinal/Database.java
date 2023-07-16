package befitmamasfinal;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class Database {
	
	private static String url = "jdbc:mysql://localhost:3306/befitmamas";
	private static String USER = "root";
	private static String PASS = "admin";
	
	private Database()	{
		
	}
	
	public static Connection getConnection() throws SQLException {
		Connection connetion = null;
		Connection connection = DriverManager.getConnection(url, USER, PASS);
		
		return connetion;
	}

}
