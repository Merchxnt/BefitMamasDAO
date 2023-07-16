package befitmamasfinal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public abstract class NutritionDAOImpl implements NutritionDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public Nutrition get(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Nutrition> getAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getNutrition(Nutrition nutrition) throws SQLException {
		Connection con = Database.getConnection();
		
		//correct this sql statement
		String sql = "SELECT profile_id, firstName, LastName, DateOfBirth, bio FROM profile WHERE id = ?"; 
		//^^^
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, nutrition.getNutritionId());
		ps.setString(2, nutrition.getFoodName());
		ps.setString(3, nutrition.getDescription());
		ps.setDouble(4, nutrition.getCalories());
		
	
		int result = ps.executeUpdate();
		
		return result;
		
		
	}

	@Override
	public int createNutrition(Nutrition nutrition) throws SQLException {
		Connection con = Database.getConnection();
		
		String sql = "INSERT INTO profile (profile_id, full_name, Date_of_birth, bio) VALUES (?, ?, ?, ?)";		
		PreparedStatement ps = con.prepareStatement(sql);
		

		ps.setInt(1, nutrition.getNutritionId());
		ps.setString(2, nutrition.getFoodName());
		ps.setString(3, nutrition.getDescription());
		ps.setDouble(4, nutrition.getCalories());
			
			int result = ps.executeUpdate();
			
		return result;
	}

	@Override
	public int updateNutrition(Nutrition nutrition) throws SQLException {
		Connection con = Database.getConnection();
		
		String sql = "UPDATE profile_id set profile_id = ?, full_name = ?, date_of_birth = ?, bio = ?, FROM user WHERE id = ?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		

		ps.setInt(1, nutrition.getNutritionId());
		ps.setString(2, nutrition.getFoodName());
		ps.setString(3, nutrition.getDescription());
		ps.setDouble(4, nutrition.getCalories());
		
		
		int result = ps.executeUpdate();
		
		
		return result;
	}

	@Override
	public int removeNutrition(Nutrition nutrition) throws SQLException {
		Connection con = Database.getConnection();
		
		String sql = "DELETE FROM profile WHERE id = ? ";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, nutrition.getNutritionId());
		
		int result = ps.executeUpdate();
		
		return result;
	}

	
	

}
