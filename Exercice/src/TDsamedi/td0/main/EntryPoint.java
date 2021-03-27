package TDsamedi.td0.main;

import TDsamedi.td0.misc.Observable;
import TDsamedi.td0.modele.Bilan;
import TDsamedi.td0.vue.UIGraphe;

public class EntryPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		Observable observable = new Observable();
		System.out.println("-----------------------------");
		Bilan bilan = new Bilan();
		bilan.setNum(1);
		System.out.println("-----------------------------");
		UIGraphe graphe = new UIGraphe(1);
		bilan.addObserver(graphe);
		bilan.setChange();
	}

}
