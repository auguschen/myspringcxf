package com.airchina.xn.entities;

import java.io.Serializable;
import java.util.List;

public class Messages implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1444459530986395217L;

	private List<String> messages;

	public List<String> getMessages() {
		return messages;
	}

	public void setMessages(List<String> messages) {
		this.messages = messages;
	}
}
