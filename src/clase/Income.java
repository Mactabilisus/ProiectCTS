package clase;

public class Income {
	public String nume;
	public int goldPeMinut;
	public int killsGold;
	public int deathPenalty;
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		if (nume != null && !nume.matches("[0-9]+")){
			this.nume = nume;
		}
	}
	public Income(String nume, int goldPeMinut, int killsGold, int deathPenalty) {
		super();
		this.nume = nume;
		this.goldPeMinut = goldPeMinut;
		this.killsGold = killsGold;
		this.deathPenalty = deathPenalty;
	}
	
	public Income()
	{
		super();
	}
	public int getGoldPeMinut() {
		return goldPeMinut;
	}
	public void setGoldPeMinut(int goldPeMinut) {
		this.goldPeMinut = goldPeMinut;
	}
	public int getKillsGold() {
		return killsGold;
	}
	public void setKillsGold(int killsGold) {
		this.killsGold = killsGold;
	}
	public int getDeathPenalty() {
		return deathPenalty;
	}
	public void setDeathPenalty(int deathPenalty) {
		this.deathPenalty = deathPenalty;
	}
	
	public int GoldSoFar(int minut)
	{
		return minut*goldPeMinut;
	}
	
	public int GoldAfterKill(int kills)
	{
		return kills *killsGold;	
	}
	
}
