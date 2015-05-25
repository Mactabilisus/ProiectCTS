package clase;

public class Hero {
	private String heroName;
	private int rank;
	private int matchesPlayed;
	private double KDA;
	
	public static Hero instanta;

	public Hero(String heroName2, int rank2, int matchesPlayed2, double kDA2) {
		super();
		if (heroName2 != null && !heroName2.matches("[0-9]+")){
			this.heroName = heroName2;
		}
		else
		{
			System.out.println("Parametrii incorecti in in Hero Name");
		} 
		if(rank2 < 0){
			System.out.println("Rankul nu poate fi mai mic decat 0");
		}
		else{
			this.rank = rank2;
		}
		if(matchesPlayed2 < 0)
		{
			System.out.println("Nu se pot avea mai putin de 0 meciuri jucate");
		}
		else{
			this.matchesPlayed = matchesPlayed2;
		}
		if(kDA2 < 0){
			System.out.println("KDA-ul nu poate fi mai mic decat 0");
		}
		else
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
	public void setRank(int r) {
		if(r < 0){
			System.out.println("Rankul nu poate sa fie mai mic decat 0");
		}
		else{
			this.rank = r;
		}
	}
	public int getMatchesPlayed() {
		return matchesPlayed;
	}
	public void setMatchesPlayed(int mP) {
		if(matchesPlayed < 0)
		{
			System.out.println("Nu se pot avea mai putin de 0 meciuri jucate");
		}
		else{
			this.matchesPlayed = mP;
		}
	}
	public double getKDA() {
		return KDA;
	}
	public void setKDA(double d) {
		if(KDA < 0){
			System.out.println("KDA-ul nu poate fi mai mic decat 0");
		}
		else
		KDA = d;
	}
}
