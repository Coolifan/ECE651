public class Main {
	
	public static void main(String[] args) {
		
		BlueDevil myself = new BlueDevil("Yifan", "Li", "China", "Purdue University", "playing video games", "does not have prior work experience",
				"ECE Master's student", "yl506", "yl506@duke.edu");
		BlueDevil TA = new BlueDevil("Shalin", "Shah", "India", "DA-IICT", "bodybuilding and dancing", "does not have prior work experience",
				"PhD ECE candidate", "sns37", "shalin.shah@duke.edu");
		BlueDevil professor = new BlueDevil("Richard", "Telford", "USA", "Trinity University", "bringing innovative approaches to the design and development of key technologies",
				"worked for IBM for 32 years and is now the founder of Telford Ventures, LLC", "adjunct associate professsor", "rt113", "ric.telford@duke.edu");
		
		Roster namelist = new Roster(); // create a new roster that contains people's information
		
		namelist.addToRoster(myself); // add myself to the roster
		namelist.whoIs("Yifan", "Li"); // show my personal information
		namelist.whoIs("Mister", "nobody"); // search within the roster and try to find mister nobody
		namelist.searchNetID("sns37"); // additional function: search NetID within the roster. This is Shalin's netid but he hasn't been added to roster
		namelist.addToRoster(TA); // add Shalin to the roster
		namelist.searchNetID("sns37"); // and search his netID again. Results found.
		namelist.addToRoster(professor); //add professor Telford
		namelist.whoIs("Shalin", "Shah"); //show Shalin's information
		namelist.whoIs("Richard", "Telford"); // show prof.Telford's information
		
		myself.setEmail("lyf901901@gmail.com"); // update my email address
		namelist.whoIs("Yifan", "Li"); // show my updated information
		
		BlueDevil friend = new BlueDevil("Tim","Cook", "USA", "Auburn University", "programming", "is the CEO of Apple Inc", 
				"Fuqua MBA alum", "unknown", "tcook@apple.com"); 
		namelist.addToRoster(friend); //add an old friend of Duke
		friend.setNetID("tdc23"); // update his netID
		namelist.whoIs(friend); // show his information
        
	}

}
