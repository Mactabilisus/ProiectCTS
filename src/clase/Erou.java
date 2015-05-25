package clase;

import interfete.Observer;

public class Erou implements Observer {
	private String nume;
	
	public Erou(String nume){
		if (nume != null && !nume.matches("[0-9]+")){
			this.nume = nume;
		}
	}
	public void update(String mesaj) {
		System.out.println(nume+" ai un mesaj: "+mesaj);
	}

}
