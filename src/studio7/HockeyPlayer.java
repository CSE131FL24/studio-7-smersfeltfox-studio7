package studio7;

public class HockeyPlayer {

	private String name;
	private int number;
	private String dominantHand;
	private String shoots;
	private int goals;
	private int assists;
	private int points;
	private int games;
	
	public HockeyPlayer(String name, int number, String dominantHand, String shoots) {
		this.name = name;
		this.number = number;
		this.dominantHand = dominantHand;
		this.shoots = shoots;
		this.goals = 0;
		this.points = 0;
		this.assists = 0;
		this.games = 0;
	}
	
	public void game(int goals, int assists) {
		this.games ++;
		this.goals += goals;
		this.assists += assists;
		this.points += (goals+assists);
	}
	
	public static void main(String[] args) {
		
	}
}
