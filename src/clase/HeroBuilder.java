package clase;

public class HeroBuilder extends HeroRank{

		@Override
		public void buildRank(int meciuriJucate, String Nume, int rank, double KDA) {
			if(meciuriJucate < 20)
			{
				int meciuriMinus = 20-meciuriJucate;
				System.out.println("Mai aveti nevoie de "+meciuriMinus+" meciuri cu "+Nume+" pentru a se calcula rankul si KDA-ul");
			}
			else{
				System.out.println("Ai jucat :"+meciuriJucate+" meciuri cu "+Nume+".Aveti urmatorul KDA: "+KDA+" si rankul :"+rank);
			}
			
			
		}
}
