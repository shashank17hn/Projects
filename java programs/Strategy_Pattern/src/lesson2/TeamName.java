package lesson2;

public abstract class TeamName {
	
	private String team_name;
	private Strategy team_stategy;
	
	
	public String getTeam_name() {
		return team_name;
	}
	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}
	
	
	public Strategy getTeam_stategy() {
		return team_stategy;
	}
	public void setTeam_stategy(Strategy team_stategy) {
		this.team_stategy = team_stategy;
	}
	
	
	public abstract void TeamInfo();
	
	public void playgame()
	{
		team_stategy.play(team_name);
	}
	

}
