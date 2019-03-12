public class FootballTeam extends Team{
	private int points;

	public FootballTeam(String name, int matchesWon, int matchesLost, int matchesDraw) {
		super(name, matchesWon, matchesLost, matchesDraw);
	}


	public void calculatePoints() {
		int wonMatches = super.matchesWon;
		int lostMatches = super.matchesLost;
		this.points = lostMatches * (-2) + wonMatches;
	}

	public int getPoints() {
		this.calculatePoints();
		return points;
	}
}
