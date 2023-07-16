package befitmamasfinal;

public class Posts {

	private int postId;
	
	private int topicId;
	
	private int userId;
	
	private String content;
	
	private double createdAt;

	public Posts(int postId, int topicId, int userId, String content, double createdAt) {
		super();
		this.postId = postId;
		this.topicId = topicId;
		this.userId = userId;
		this.content = content;
		this.createdAt = createdAt;
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public int getTopicId() {
		return topicId;
	}

	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public double getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(double createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "Posts [postId=" + postId + ", topicId=" + topicId + ", userId=" + userId + ", content=" + content
				+ ", createdAt=" + createdAt + "]";
	}
}
