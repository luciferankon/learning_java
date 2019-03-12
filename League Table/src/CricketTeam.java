public class CricketTeam extends Team{
	private int points;

	public CricketTeam(String name, int matchesWon, int matchesLost, int matchesDraw) {
		super(name, matchesWon, matchesLost, matchesDraw);
	}


	public void calculatePoints() {
		int drawMatches = super.matchesDraw;
		int wonMatches = super.matchesWon;
		this.points = drawMatches + wonMatches * 2;
	}

	public int getPoints() {
		this.calculatePoints();
		return points;
	}
}
