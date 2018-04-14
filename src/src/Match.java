package src;

public class Match {
	private int homeTeamId;
	private int awatTeamId;
	private int goalsHomeTeam;
	private int goalsAwayTeam;
	public Match(int homeTeamId, int awatTeamId, int goalsHomeTeam, int goalsAwayTeam) {
		this.homeTeamId = homeTeamId;
		this.awatTeamId = awatTeamId;
		this.goalsHomeTeam = goalsHomeTeam;
		this.goalsAwayTeam = goalsAwayTeam;
	}
	public int getHomeTeamId() {
		return homeTeamId;
	}
	public void setHomeTeamId(int homeTeamId) {
		this.homeTeamId = homeTeamId;
	}
	public int getAwatTeamId() {
		return awatTeamId;
	}
	public void setAwatTeamId(int awatTeamId) {
		this.awatTeamId = awatTeamId;
	}
	public int getGoalsHomeTeam() {
		return goalsHomeTeam;
	}
	public void setGoalsHomeTeam(int goalsHomeTeam) {
		this.goalsHomeTeam = goalsHomeTeam;
	}
	public int getGoalsAwayTeam() {
		return goalsAwayTeam;
	}
	public void setGoalsAwayTeam(int goalsAwayTeam) {
		this.goalsAwayTeam = goalsAwayTeam;
	}
	
}
