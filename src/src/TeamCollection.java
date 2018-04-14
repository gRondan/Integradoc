package src;

import java.util.HashMap;
import java.util.Map;

public class TeamCollection {
	private Map<String, Team> teams;
	public TeamCollection() {
		teams = new HashMap<String, Team>();
	}
	public void addTeam(Team team) {
		this.teams.put(team.getId(), team);
	}
	public Team getTeam(String teamId) {
		return this.teams.get(teamId);
	}
	public void removeTeam(String teamId) {
		this.teams.remove(teamId);
	}
}
