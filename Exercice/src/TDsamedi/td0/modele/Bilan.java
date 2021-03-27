package TDsamedi.td0.modele;

import TDsamedi.td0.misc.Observable;

public class Bilan extends Observable{
	
	public Bilan() {
		System.out.println("Dans constructeur Bilan");
	}
	
	public void setChange() {
		System.out.println("Dans méthode setChange");
		
	}
}

