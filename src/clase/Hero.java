package clase;

public class Hero {
	private String heroName;
	private int rank;
	private int matchesPlayed;
	private double KDA;
	
	public static Hero instanta;

	public Hero(String heroName2, int rank2, int matchesPlayed2, double kDA2) {
		super();
		this.heroName = heroName2;
		this.rank = rank2;
		this.matchesPlayed = matchesPlayed2;
		KDA = kDA2;
	}

	public Hero() {
		
	}

	public String toString() {
		return "Hero [heroName=" + heroName + ", rank=" + rank
				+ ", matchesPlayed=" + matchesPlayed + ", KDA=" + KDA + "]";
	}
	
	public String getHeroName() {
		return heroName;
	}
	public void setHeroName(String heroName) {
		if (heroName != null && !heroName.matches("[0-9]+")){
			this.heroName = heroName;
		}
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public int getMatchesPlayed() {
		return matchesPlayed;
	}
	public void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}
	public double getKDA() {
		return KDA;
	}
	public void setKDA(double d) {
		KDA = d;
	}
}
