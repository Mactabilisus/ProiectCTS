package clase;

public abstract class HeroRank {
	protected String heroName;
	protected int rank;
	protected int matchesPlayed;
	protected float KDA;
	
	public abstract void buildRank(int i, String string, int j, double d);
}
