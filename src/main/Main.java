package main;

import interfete.DecoratorAbilities;
import interfete.IHeroCarry;
import interfete.IHeroRole;
import clase.Atacuri;
import clase.CreateStorm;
import clase.Erou;
import clase.Hero;
import clase.HeroAbilities;
import clase.HeroAbilities2;
import clase.HeroBuilder;
import clase.HeroRank;
import clase.Income;
import clase.Item;
import clase.OtherAbilities;
import clase.Recipe;
import clase.StormSupport;

public class Main {

	public static void main(String[] args) {
		HeroRank Storm = new HeroBuilder();
		HeroRank ShadowFiend = new HeroBuilder();
		HeroRank Invoker = new HeroBuilder();
		Invoker.buildRank(20, "Invoker", 12, 7.8);
		Storm.buildRank(100,"Storm Spirit",34,4.6);
		ShadowFiend.buildRank(3, "Shadow Fiend", 0, 0);
		System.out.println("\n");
		
		DecoratorAbilities abilities = new HeroAbilities("Storm Spirit");
		OtherAbilities skills = new HeroAbilities2(abilities);
		
		skills.QAbility("Static Remnant");
		skills.WAbility("Vortex");
		skills.EAbility("OverCharge");
		skills.UltimateAbility("Ball Lightning"); 
		System.out.println("\n");
		
		IHeroRole stormSpirit = new CreateStorm();
		IHeroCarry carry1 = stormSpirit.createCarry();	
		System.out.println(carry1.role());
		System.out.println("\n");
		
		Item item1 = new Item("Morbid mask" , 900);
		Item item2 = new Item("Helm of iron will" , 950);

		Recipe recipe1 = new Recipe("Helm of dominator");
		recipe1.add(item1);
		recipe1.add(item2);
		recipe1.descriere();
		
		Item item3 = new Item("Ring of regeneration" , 350);
		Item item4 = new Item("Ring of protection" , 180);
		Item item5 = new Item("Soby mask",325);
		
		Recipe recipe2 = new Recipe("Ring of bassilius");
		recipe2.add(item4);
		recipe2.add(item5);
		
		Recipe recipe3 = new Recipe("Vladimir's offering");
		recipe3.add(item1);
		recipe3.add(item3);
		recipe3.add(recipe2);
		recipe3.descriere();
		System.out.println("\n");
		
		Erou erou1 = new Erou("Storm Spirit");
		Erou erou2 = new Erou("Shadow Fiend");
		Erou erou3 = new Erou("Invoker");
		Atacuri at = new Atacuri(1);
		Atacuri at2 = new Atacuri(2);
		Atacuri at3 = new Atacuri(3);
		at.adaugaObserver(erou1);
		at2.adaugaObserver(erou2);
		at.estiAtacat();
		at2.nuEstiAtacat();
		at3.adaugaObserver(erou3);
		at3.estiAtacat();
		at3.stergeObserver(erou3);
		System.out.println("\n");
		
		Income inc = new Income();
		inc.setGoldPeMinut(520);
		inc.setDeathPenalty(120);
		inc.setKillsGold(300);
		int sfarsit = inc.GoldSoFar(45) + inc.getKillsGold() - inc.getDeathPenalty();
		inc.setNume("Storm");
		System.out.println("La sfarsitul jocului de 45 de minute dupa 10 killuri si 4 deaths ai avut urmatorul income de :"+sfarsit);
	}

}
