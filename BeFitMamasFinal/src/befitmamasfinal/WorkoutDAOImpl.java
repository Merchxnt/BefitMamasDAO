package befitmamasfinal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public abstract class WorkoutDAOImpl implements WorkoutDAO{

	@Override
	public Workout get(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Workout> getAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getWorkout(Workout workout) throws SQLException {
		Connection con = Database.getConnection();
		
		//correct this sql statement
		String sql = "SELECT user_id, username, email, password, join_date FROM user WHERE id = ?"; 
		//^^^
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, workout.getWorkoutId());
		ps.setString(1, workout.getWorkout());
		ps.setString(1, workout.getDescription());
		ps.setInt(1, workout.getIntensity());
		ps.setDouble(1, workout.getDuration());
		
		int result = ps.executeUpdate();
		
		return result;
		
		
	}

	@Override
	public int createWorkout(Workout workout) throws SQLException {
		Connection con = Database.getConnection();
		
		String sql = "INSERT INTO user (user_id, username, password, email) VALUES (?, ?, ?)";		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, workout.getWorkoutId());
		ps.setString(1, workout.getWorkout());
		ps.setString(1, workout.getDescription());
		ps.setInt(1, workout.getIntensity());
		ps.setDouble(1, workout.getDuration());
		
			
			int result = ps.executeUpdate();
			
		return result;
	}

	@Override
	public int updateWorkout(Workout workout) throws SQLException {
		Connection con = Database.getConnection();
		
		//update the sql 
		String sql = "UPDATE  set user_id = ?, username = ?, email = ?, password, FROM user WHERE id = ?";
		//update the sql
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, workout.getWorkoutId());
		ps.setString(1, workout.getWorkout());
		ps.setString(1, workout.getDescription());
		ps.setInt(1, workout.getIntensity());
		ps.setDouble(1, workout.getDuration());
		
		int result = ps.executeUpdate();
		
		
		return result;
	}

	@Override
	public int removeWorkout(Workout workout) throws SQLException {
		Connection con = Database.getConnection();
		
		String sql = "DELETE FROM workout WHERE id = ? ";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, workout.getWorkoutId());
		
		int result = ps.executeUpdate();
		
		return result;
	}

	
}
