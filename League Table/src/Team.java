public abstract class Team implements Comparable<Team>{
	protected String name;
	protected int matchesWon;
	protected int matchesLost;
	protected int matchesDraw;

	public Team(String name, int matchesWon, int matchesLost, int matchesDraw) {
		this.name = name;
		this.matchesWon = matchesWon;
		this.matchesLost = matchesLost;
		this.matchesDraw = matchesDraw;
	}

	@Override
	public int compareTo(Team team) {
		return Integer.compare(this.getPoints(), team.getPoints());
	}

	public abstract int getPoints();

	public String getName(){
		return this.name;
	}
}
