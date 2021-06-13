package actions;

import com.opensymphony.xwork2.Action;

public class HelloAction implements Action {

	private String message;

	

	@Override
	public String execute() throws Exception {
		setMessage("Bonjour :) ");
		
		return "success";
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
