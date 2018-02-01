public class BlueDevil extends Person {
	String affiliation;
	String netID;
	String email;
	
	public BlueDevil() {}
	
	public BlueDevil(String firstName, String lastName, String homeland, String almaMater, String hobbies, 
			String workExperience, String affiliation, String netID, String email) {
		super.firstName = firstName;
		super.lastName = lastName;
		super.homeland = homeland;
		super.almaMater = almaMater;
		super.hobbies = hobbies;
		super.workExperience = workExperience;
		this.affiliation = affiliation;
		this.netID = netID;
		this.email = email;
		
	}
	
	public String getAffiliation() {
		return affiliation;
	}

	public void setAffiliation(String affiliation) {
		this.affiliation = affiliation;
	}

	public String getNetID() {
		return netID;
	}

	public void setNetID(String netID) {
		this.netID = netID;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		String dukeinfo = super.firstName + " " + super.lastName + " is from " + super.homeland + " and is a " + this.affiliation + ". He " +
							super.workExperience + ". He received his bachelor's degree from " + super.almaMater + ". When not in class, " +
							super.firstName + " enjoys " + super.hobbies + ". His Duke netID is " + this.netID + " and his email address is " +
							this.email + ".";
		
		return dukeinfo;
	}
	
	
}

