package TDsamedi.td0.misc;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import TDsamedi.td0.interfaces.IObserver;


public class Observable {
	
	private int num;
	private List<IObserver> observers;
	 
	public Observable(List<IObserver> observers) {
		this.observers = observers;
	}
	 
	public Observable() {
		observers = new ArrayList<>();
		System.out.println("Dans constructeur Observable");
	}
	
	public void notify1() {
		System.out.println("Dans méthode notify1");
		
		
		Iterator<IObserver> it = this.observers.iterator();
		while(it.hasNext()) {
			it.next().update(this);
		}
	}

	public List<IObserver> getObservers() {
		return observers;
	}

	public void setObservers(List<IObserver> observers) {
		this.observers = observers;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public void addObserver(IObserver o) {
		this.observers.add(o);
	}
	
	
}
