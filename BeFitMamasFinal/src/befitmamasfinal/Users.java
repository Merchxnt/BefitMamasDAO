package befitmamasfinal;

import java.util.Date;

public class Users {

	private int userId;
	
	private String username;
	
	private String password;
	
	private String email;
	
	private Date joinedDate;
	
	public Users(int userId, String username, String password, String email, Date joinedDate) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.email = email;
		this.joinedDate = joinedDate;
	}
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getJoinedDate() {
		return joinedDate;
	}

	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", joinedDate=" + joinedDate + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
