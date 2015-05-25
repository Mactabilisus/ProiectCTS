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
		else
		{
			System.out.println("Numele este introdus gresit in income");
		}
	}
	public Income(String _nume, int _goldPeMinut, int _killsGold, int _deathPenalty) {
		super();
		if (_nume != null && !_nume.matches("[0-9]+")){
			this.nume = _nume;
		}
		else
		{
			System.out.println("Numele este introdus gresit in income");
		}
		if(_goldPeMinut < 0){
			System.out.println("Goldul pe minut nu poate fi mai mic decat 0");
		}
		else
		{
			this.goldPeMinut = _goldPeMinut;
		}
		if(_killsGold < 0){
			System.out.println("Goldul pe killuri nu poate fi mai mic decat 0");
		}
		else
		{
		this.killsGold = _killsGold;
		}
		if(_deathPenalty < 0){
			System.out.println("Death penalty-ul nu poate fi mai mic decat 0");
		}
		else
		{
			this.deathPenalty = _deathPenalty;
		}
		
	}
	
	public Income()
	{
		super();
	}
	public int getGoldPeMinut() {
		return goldPeMinut;
	}
	public void setGoldPeMinut(int _goldPeMinut) {
		if(_goldPeMinut < 0){
			System.out.println("Goldul pe minut nu poate fi mai mic decat 0");
		}
		else
		{
			this.goldPeMinut = _goldPeMinut;
		}
	}
	public int getKillsGold() {
		return killsGold;
	}
	public void setKillsGold(int _killsGold) {
		if(_killsGold < 0){
			System.out.println("Goldul pe killuri nu poate fi mai mic decat 0");
		}
		else
		{
		this.killsGold = _killsGold;
		}
	}
	public int getDeathPenalty() {
		return deathPenalty;
	}
	public void setDeathPenalty(int _deathPenalty) {
		if(_deathPenalty < 0){
			System.out.println("Death penalty-ul nu poate fi mai mic decat 0");
		}
		else
		{
			this.deathPenalty = _deathPenalty;
		}
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
