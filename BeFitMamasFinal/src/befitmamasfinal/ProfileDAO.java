package befitmamasfinal;

import java.sql.SQLException;
import java.util.List;

public interface ProfileDAO extends DAO<Profile> {

	int getProfile(Profile profile) throws SQLException;

	List<Profile> getAll() throws SQLException;

	Profile get(int id) throws SQLException;

	int createProfile(Profile profile) throws SQLException;

	int removeProfile(Profile profile) throws SQLException;

	int updateProfile(Profile profile) throws SQLException;

}
