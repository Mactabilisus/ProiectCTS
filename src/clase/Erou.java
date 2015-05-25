package clase;

import interfete.Observer;

public class Erou implements Observer {
	private String nume;
	
	public Erou(String nume){
		this.nume=nume;
		
	}
	public void update(String mesaj) {
		System.out.println(nume+" ai un mesaj: "+mesaj);
	}

}
