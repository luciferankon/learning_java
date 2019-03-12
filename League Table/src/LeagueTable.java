import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeagueTable<T extends Team> {
	private List<T> teams;

	public LeagueTable() {
		this.teams = new ArrayList<>();
	}

	public void addTeam(T team) {
		this.teams.add(team);
	}

	public void sortTeam() {
		teams.sort(Collections.reverseOrder());

		for (Team team : teams) {
			System.out.println(team.getName());
		}
	}
}
