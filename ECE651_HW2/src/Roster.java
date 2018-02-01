import java.util.ArrayList;

public class Roster {
	ArrayList<BlueDevil> roster;
	
	public Roster() {
		this.roster = new ArrayList<BlueDevil>();
	}
	
	public Roster(ArrayList<BlueDevil> roster) {
		super();
		this.roster = roster;
	}
	// an additional function that adds a person into the roster.
	public void addToRoster(BlueDevil whom) {
		this.roster.add(whom);
		System.out.println(whom.firstName + " " + whom.lastName + " has been added to the roster.");
	}
	
	//	whoIs function is used to display the information of the person specified. 
	public void whoIs(String firstName, String lastName) {
		for (int i = 0; i < roster.size(); i++) {
			if (firstName.equals (roster.get(i).firstName) && lastName.equals(roster.get(i).lastName)) {
				System.out.println(roster.get(i));
				return;
			}
		}
		System.out.println("No results found for '" + firstName + " " + lastName + "' on the current roster.");
	}
	
	public void whoIs(BlueDevil bluedevil) {
		for (int i = 0; i < roster.size(); i++) {
			if (bluedevil.firstName.equals (roster.get(i).firstName) && bluedevil.lastName.equals(roster.get(i).lastName)) {
				System.out.println(roster.get(i));
				return;
			}
		}
		System.out.println("No results found");
	}
	
	// an additional function that takes a netID as input parameter and returns the corresponding name.
	public void searchNetID(String netid) {
		for (int i = 0; i < roster.size(); i++) {
			if (netid.equals(roster.get(i).netID)) {
				System.out.println("NetID " + "'" + netid + "'" + " found. Name: " + roster.get(i).firstName + " " + roster.get(i).lastName + ".");
				return;
			}
		}
		System.out.println("No results found for netID " + "'" + netid + "' on the current roster.");
	}
		
}
