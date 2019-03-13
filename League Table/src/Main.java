public class Main {
	public static void main(String[] args) {
		LeagueTable<CricketTeam> cricketTeamLeagueTable = new LeagueTable<>();
		cricketTeamLeagueTable.addTeam(new CricketTeam("India", 2, 0, 1));
		cricketTeamLeagueTable.addTeam(new CricketTeam("Aus", 3, 1, 0));
		cricketTeamLeagueTable.addTeam(new CricketTeam("SA", 3, 2, 2));
		cricketTeamLeagueTable.addTeam(new CricketTeam("Pakistan", 1, 1, 2));
		cricketTeamLeagueTable.sortTeam();

		System.out.println("--------------------------------");


		LeagueTable<FootballTeam> footballTeamLeagueTable = new LeagueTable<>();
		footballTeamLeagueTable.addTeam(new FootballTeam("Brazil",2,1,0));
		footballTeamLeagueTable.addTeam(new FootballTeam("Argentina",3,0,1));
		footballTeamLeagueTable.addTeam(new FootballTeam("Italy",2,2,0));
		footballTeamLeagueTable.addTeam(new FootballTeam("Germany",1,0,0));
		footballTeamLeagueTable.sortTeam();
	}
}