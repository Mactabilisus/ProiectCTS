package clase;

import interfete.DecoratorAbilities;

public abstract class OtherAbilities {
	DecoratorAbilities abilities;
	private String Qability;
	private String Wability;
	public abstract void EAbility(String string);
	public abstract void UltimateAbility(String string);
	
	
	public OtherAbilities(DecoratorAbilities _abilities) {
		abilities = _abilities;
	}
	public OtherAbilities() {
		// TODO Auto-generated constructor stub
	}
	public void QAbility(String string){
		abilities.QAbility();
		
	}
	
	public void WAbility(String string){
		abilities.WAbility();
	}
	
	
	public String getQability() {
		return Qability;
	}
	public void setQability(String qability) {
		if (qability != null && !qability.matches("[0-9]+"))
		{
			System.out.println("QAbility name wrong");
		}
		else
		{
			Qability = qability;
		}
	}
	public String getWability() {
		return Wability;
	}
	public void setWability(String wability) {
		if (wability != null && !wability.matches("[0-9]+"))
		{
			System.out.println("wability name wrong");
		}
		else
		{
			Qability = wability;
		}
	}

}
