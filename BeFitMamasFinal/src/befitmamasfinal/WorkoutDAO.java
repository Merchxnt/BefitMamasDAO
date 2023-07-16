package befitmamasfinal;

import java.sql.SQLException;

public interface WorkoutDAO extends DAO<Workout> {

	int getWorkout(Workout workout) throws SQLException;

	int createWorkout(Workout workout) throws SQLException;

	int updateWorkout(Workout workout) throws SQLException;

	int removeWorkout(Workout workout) throws SQLException;
	

}
