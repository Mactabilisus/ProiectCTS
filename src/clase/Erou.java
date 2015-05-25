package clase;

import interfete.Observer;

public class Erou implements Observer {
	private String nume;
	
	public Erou(String _nume){
		if (_nume != null && !_nume.matches("[0-9]+")){
			this.nume = _nume;
		}
		else
		{
			System.out.println("Numele este gresit in Erou");
		}
	}
	public void update(String mesaj) {
		System.out.println(nume+" ai un mesaj: "+mesaj);
	}

}
