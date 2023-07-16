package befitmamasfinal;

public class Profile {
	
	private int profileId;
	
	private String firstName;
	
	private String lastName;
	
	private double dateOfBirth;
	
	private String bio;

	public Profile(int profileId, String firstName, String lastName, double dateOfBirth, String bio) {
		super();
		this.profileId = profileId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.bio = bio;
	}

	public int getProfileId() {
		return profileId;
	}

	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(double dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	@Override
	public String toString() {
		return "Profile [profileId=" + profileId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", dateOfBirth=" + dateOfBirth + ", bio=" + bio + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}


}
