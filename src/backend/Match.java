package backend;




public class Match {

	
    private String date;
    private String status;
    private Integer matchday;
    private String homeTeamName;
    private String awayTeamName;
	private Result result;

    public String getDate() { return date; }
    public String getStatus() { return status; }
    public Integer getMatchday() { return matchday; }
    public String getHomeTeamName() { return homeTeamName; }
    public String getAwayTeamName() { return awayTeamName; }
    public Result getResult() { return result; }

    public void setDate(String date) { this.date = date; }
    public void setStatus(String status) { this.status = status; }
    public void setMatchday(Integer matchday) { this.matchday = matchday; }
    public void setHomeTeamName(String homeTeamName) { this.homeTeamName = homeTeamName; }
    public void setAwayTeamName(String awayTeamName) { this.awayTeamName = awayTeamName; }
    public void setResult(Result result) { this.result = result; }
}
