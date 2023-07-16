package befitmamasfinal;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws SQLException {
		
//		Date myDate = new Date();
		
//		Users users = new Users(1, "Shawn", "Shawn123", "tseamster15@gmail.com", myDate);
		
//		System.out.println(users);
		
		Connection con = Database.getConnection();
		
		if (con != null) {
			System.out.println("Database has been connected");
		}
		
		
		
			
	}

}
