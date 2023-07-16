package befitmamasfinal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Date;

public abstract class TopicsDAOImpl implements TopicsDAO {

	@Override
	public Topics get(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Topics> getAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getTopics(Topics topics) throws SQLException {
		Connection con = Database.getConnection();
		
		//correct this sql statement
		String sql = "SELECT topics_id, category_id, user_id, title, content FROM topics WHERE id = ?"; 
		//^^^
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, topics.getTopicId());
		ps.setInt(1, topics.getCategoryId());
		ps.setInt(1, topics.getUserId());
		ps.setString(1, topics.getTitle());
		ps.setString(1, topics.getContent());
		ps.setDate(1, (java.sql.Date) topics.getCreatedAt());
		
	
		int result = ps.executeUpdate();
		
		return result;
		
		
	}

	@Override
	public int createTopics(Topics topics) throws SQLException {
		Connection con = Database.getConnection();
		
		String sql = "INSERT INTO topics (topics_id, category_id, user_id, title, bio) VALUES (?, ?, ?, ?)";		
		PreparedStatement ps = con.prepareStatement(sql);
		
	
		ps.setInt(1, topics.getTopicId());
		ps.setInt(1, topics.getCategoryId());
		ps.setInt(1, topics.getUserId());
		ps.setString(1, topics.getTitle());
		ps.setString(1, topics.getContent());
		ps.setDate(1, (java.sql.Date) topics.getCreatedAt());
		
			
			int result = ps.executeUpdate();
			
		return result;
	}

	@Override
	public int updateTopics(Topics topics) throws SQLException {
		Connection con = Database.getConnection();
		
		String sql = "UPDATE Topic_id set topic_id = ?,category_id = ?, user_id = ?, title = ?, content = ?, FROM topics WHERE id = ?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, topics.getTopicId());
		ps.setInt(1, topics.getCategoryId());
		ps.setInt(1, topics.getUserId());
		ps.setString(1, topics.getTitle());
		ps.setString(1, topics.getContent());
		ps.setDate(1, (java.sql.Date) topics.getCreatedAt());
		
		int result = ps.executeUpdate();
		
		
		return result;
	}

	@Override
	public int removeTopics(Topics topics) throws SQLException {
		Connection con = Database.getConnection();
		
		String sql = "DELETE FROM Topics WHERE id = ? ";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, topics.getTopicId());
		
		int result = ps.executeUpdate();
		
		return result;
	}
	
}
	