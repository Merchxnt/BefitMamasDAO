package befitmamasfinal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public abstract class ProfileDAOimpl implements ProfileDAO {

	@Override
	public Profile get(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Profile> getAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getProfile(Profile profile) throws SQLException {
		Connection con = Database.getConnection();
		
		//correct this sql statement
		String sql = "SELECT profile_id, firstName, LastName, DateOfBirth, bio FROM profile WHERE id = ?"; 
		//^^^
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, profile.getProfileId());
		ps.setString(2, profile.getFirstName());
		ps.setString(3, profile.getLastName());
		ps.setDouble(4, profile.getDateOfBirth());
		ps.setString(5, profile.getBio());
	
		int result = ps.executeUpdate();
		
		return result;
		
		
	}

	@Override
	public int createProfile(Profile profile) throws SQLException {
		Connection con = Database.getConnection();
		
		String sql = "INSERT INTO profile (profile_id, full_name, Date_of_birth, bio) VALUES (?, ?, ?, ?)";		
		PreparedStatement ps = con.prepareStatement(sql);
		
	
			ps.setInt(1, profile.getProfileId());
			ps.setString(2, profile.getFirstName());
			ps.setString(3, profile.getLastName());
			ps.setDouble(4, profile.getDateOfBirth());
			ps.setString(5, profile.getBio());
			
			int result = ps.executeUpdate();
			
		return result;
	}

	@Override
	public int updateProfile(Profile profile) throws SQLException {
		Connection con = Database.getConnection();
		
		String sql = "UPDATE profile_id set profile_id = ?, full_name = ?, date_of_birth = ?, bio = ?, FROM user WHERE id = ?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, profile.getProfileId());
		ps.setString(1, profile.getFirstName());
		ps.setString(1, profile.getLastName());
		ps.setDouble(1, profile.getDateOfBirth());
		ps.setString(1, profile.getBio());
		
		int result = ps.executeUpdate();
		
		
		return result;
	}

	@Override
	public int removeProfile(Profile profile) throws SQLException {
		Connection con = Database.getConnection();
		
		String sql = "DELETE FROM profile WHERE id = ? ";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, profile.getProfileId());
		
		int result = ps.executeUpdate();
		
		return result;
	}

	
	

}
