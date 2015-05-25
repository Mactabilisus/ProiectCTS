package clase;

import interfete.IHeroCarry;
import interfete.IHeroOfflane;
import interfete.IHeroRole;
import interfete.IHeroSupport;

public class CreateStorm implements IHeroRole {

	public IHeroCarry createCarry() {
		return new StormCarry();
	}

	public IHeroOfflane createOfflane() {
		return new StormOfflane();
	}

	public IHeroSupport createSupport() {
		return new StormSupport();
	}

}
