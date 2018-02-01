public class Person {
	public String lastName;
	public String firstName;
	public String homeland;
	public String almaMater;
	public String hobbies;
	public String workExperience;
	
	public Person() {}
	
	public Person(String lName, String fName, String home, String college, String hobby, String workExp) {
		lastName = lName;
		firstName = fName;
		homeland = home;
		hobbies = hobby;
		almaMater = college;
		workExperience = workExp;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getHomeland() {
		return homeland;
	}

	public void setHomeland(String homeland) {
		this.homeland = homeland;
	}

	public String getAlmaMater() {
		return almaMater;
	}

	public void setAlmaMater(String almaMater) {
		this.almaMater = almaMater;
	}

	public String getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	public String getWorkExperience() {
		return workExperience;
	}

	public void setWorkExperience(String workExperience) {
		this.workExperience = workExperience;
	}
	
}
