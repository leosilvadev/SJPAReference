package br.fatea.sjpareference.model.vo;


public class Message {
	
	private String userFrom;
	private String message;
	
	public Message() {}
	
	public Message(String userFrom, String message) {
		super();
		this.userFrom = userFrom;
		this.message = message;
	}
	
	public String getUserFrom() {
		return userFrom;
	}
	public void setUserFrom(String userFrom) {
		this.userFrom = userFrom;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
