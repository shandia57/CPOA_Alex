package TDsamedi.td0.vue;

import TDsamedi.td0.interfaces.IObserver;
import TDsamedi.td0.misc.Observable;

public class UIGrapheIphone implements IObserver {
private int num;
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public UIGrapheIphone(int num) {
		System.out.println("je suis un interface Iphone");
		this.setNum(num);
	}
	
	@Override
	public void update(Observable obj) {
		System.out.println("Dans méthode update de Iphone");
	}


	
}	


