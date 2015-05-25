package clase;

import interfete.DecoratorAbilities;

public class HeroAbilities2 extends OtherAbilities{

	@Override
	public void EAbility(String string) {
		System.out.println(abilities.getDenumire() + " has the following E Ability");	
	}

	@Override
	public void UltimateAbility(String string) {
		System.out.println(abilities.getDenumire() + " has the following Ultimate Ability");
		
	}

	public HeroAbilities2(DecoratorAbilities DecoratorAbilities) {
		super(DecoratorAbilities);
		
	}

}
