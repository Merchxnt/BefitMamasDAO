package befitmamasfinal;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UsersDAOImpl implements UsersDAO {

	@Override
	public Users get(int id) throws SQLException {
	return null;
	}

	@Override
	public List<Users> getAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getUser(Users users) throws SQLException {
		Connection con = Database.getConnection();
		
		//correct this sql statement
		String sql = "SELECT user_id, username, email, password, join_date FROM user WHERE id = ?"; 
		//^^^
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, users.getUserId());
		ps.setString(2, users.getUsername());
		ps.setString(3, users.getPassword());
		ps.setString(4, users.getEmail());
	
		int result = ps.executeUpdate();
		
		return result;
		
		
	}

	@Override
	public int createUser(Users users) throws SQLException {
		Connection con = Database.getConnection();
		
		String sql = "INSERT INTO user (user_id, username, password, email) VALUES (?, ?, ?)";		
		PreparedStatement ps = con.prepareStatement(sql);
		
	
			ps.setInt(1, users.getUserId());
			ps.setString(2, users.getUsername());
			ps.setString(3, users.getPassword());
			ps.setString(4, users.getEmail());
			
			int result = ps.executeUpdate();
			
		return result;
	}

	@Override
	public int update(Users users) throws SQLException {
		Connection con = Database.getConnection();
		
		String sql = "UPDATE user_id set user_id = ?, username = ?, email = ?, password, FROM user WHERE id = ?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, users.getUserId());
		ps.setString(1, users.getUsername());
		ps.setString(1, users.getEmail());
		ps.setString(1, users.getPassword());
		
		int result = ps.executeUpdate();
		
		
		return result;
	}

	@Override
	public int remove(Users users) throws SQLException {
		Connection con = Database.getConnection();
		
		String sql = "DELETE FROM user WHERE id = ? ";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, users.getUserId());
		
		int result = ps.executeUpdate();
		
		return result;
	}

}
