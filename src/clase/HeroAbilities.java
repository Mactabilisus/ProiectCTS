package clase;

import interfete.DecoratorAbilities;

public class HeroAbilities implements DecoratorAbilities {

	private String denumire; 
	public HeroAbilities(String _denumire) {
		if (_denumire != null && !_denumire.matches("[0-9]+")){
			this.denumire = _denumire;
		}
	}
	public void QAbility() {
		System.out.println(denumire + " has the following Q Ability");

	}

	public void WAbility() {
		System.out.println(denumire + " has selected the following W Ability");

	}

	public String getDenumire() {
		return denumire;
	}

	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}
}
