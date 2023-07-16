package befitmamasfinal;

import java.util.Date;

public class Topics {
	private int topicId;
	
	private int categoryId;
	
	private int userId;
	
	private String title;
	
	private String content;
	
	private Date createdAt;

	public Topics(int topicId, int categoryId, int userId, String title, String content, Date createdAt) {
		super();
		this.topicId = topicId;
		this.categoryId = categoryId;
		this.userId = userId;
		this.title = title;
		this.content = content;
		this.createdAt = createdAt;
	}

	public int getTopicId() {
		return topicId;
	}

	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "Topics [topicId=" + topicId + ", categoryId=" + categoryId + ", userId=" + userId + ", title=" + title
				+ ", content=" + content + ", createdAt=" + createdAt + "]";
	}
}
