package lesson2;

public class Main_Match {

	public static void main(String[] args) {


		TeamName india = new India();
		TeamName srilanka = new SriLanka();
		
		Strategy offence = new Offence();
		Strategy defend = new Defense();
		
		System.out.println(" ***** Game Starts *****");
		
		india .setTeam_name("India");
		srilanka.setTeam_name("Sri Lanka");
		
		india.setTeam_stategy(defend);
		srilanka.setTeam_stategy(offence);
		
		india.TeamInfo();
		india.playgame();
		
		srilanka.TeamInfo();
		srilanka.playgame();
		
		System.out.println(" ***** Half Time *****");
		System.out.println(" ***** ********* *****");
		System.out.println(" ***** Game Starts Again *****");
	
		india.setTeam_stategy(offence);
		srilanka.setTeam_stategy(defend);
		
		india.TeamInfo();
		india.playgame();
		
		srilanka.TeamInfo();
		srilanka.playgame();
		

	}

}
