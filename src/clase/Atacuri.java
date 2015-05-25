package clase;

import java.util.ArrayList;
import java.util.List;

import interfete.Observer;
import interfete.Subiect;

public class Atacuri implements Subiect {

	private List<Observer> observatori=new ArrayList<Observer>();
	private String mesaj="";
	private int nrAtacuri;
	
	public void estiAtacat(){
		this.mesaj="Atacul cu numarul : "+nrAtacuri+" se indreapta spre tine";
		notifica();
	}
	
	public void nuEstiAtacat(){
		this.mesaj="Atacul cu numarul : "+nrAtacuri+" se distanteaza de tine";
		notifica();
	}
	
	public Atacuri(int nrAtacuri) {
		super();
		if(nrAtacuri < 0)
		{
			System.out.println("Numarul de atacuri nu poate fi mai mic decat 0");
		}
		else
			this.nrAtacuri = nrAtacuri;
	}

	public void adaugaObserver(Observer o) {
		observatori.add(o);

	}
	
	public void stergeObserver(Observer o) {
		observatori.remove(o);

	}

	public void notifica() {
		for(Observer o:observatori){
			o.update(mesaj);
		}
	}

}
