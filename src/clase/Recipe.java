package clase;

import java.util.ArrayList;

public class Recipe extends Shop{
		private ArrayList<Shop> items = new ArrayList<Shop>();
		private String recipeName;
		
		public Recipe(String recipeName) {
			super();
			this.recipeName = recipeName;
		}
		
		public void add(Shop shop)
		{
			items.add(shop);
		}
		public void remove(Shop shop)
		{
			items.remove(shop);
		}
		public Shop getChild(int i)
		{
			return items.get(i);
		}
		public void descriere() {
			System.out.println(recipeName + " is made out of the following items :");
			for(Shop s : items)
			{
				s.descriere();
			}
	}

}
