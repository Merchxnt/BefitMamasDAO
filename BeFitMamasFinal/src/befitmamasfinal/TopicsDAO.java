package befitmamasfinal;

import java.sql.SQLException;

public interface TopicsDAO extends DAO<Topics> {

	int removeTopics(Topics topics) throws SQLException;

	int updateTopics(Topics topics) throws SQLException;

	int createTopics(Topics topics) throws SQLException;

	int getTopics(Topics topics) throws SQLException;

}
