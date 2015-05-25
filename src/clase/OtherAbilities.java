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
		Qability = qability;
	}
	public String getWability() {
		return Wability;
	}
	public void setWability(String wability) {
		Wability = wability;
	}

}
