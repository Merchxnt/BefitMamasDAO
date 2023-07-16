package befitmamasfinal;

import java.sql.SQLException;
import java.util.List;

public interface DAO<T> {
	
	T get(int id) throws SQLException;
	
	List<T> getAll() throws SQLException;
	
	int getUser(T t) throws SQLException;
	
	int createUser(T t) throws SQLException;
	
	int update(T t) throws SQLException;
	
	int remove(T t) throws SQLException;

	

}
