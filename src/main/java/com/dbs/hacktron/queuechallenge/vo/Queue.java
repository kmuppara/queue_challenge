package com.dbs.hacktron.queuechallenge.vo;

import java.util.List;

import org.springframework.context.annotation.Scope;

@Scope("application")
public class Queue {

	private List<Message> messages;
	private String queueID;
	private String queueName;
	private int maxSize;
	
	public Queue() {
		super();
	}
	public Queue(String queueName, int maxSize) {
		super();
		this.queueName = queueName;
		this.maxSize = maxSize;
	}
	public List<Message> getMessages() {
		return messages;
	}
	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}
	public String getQueueID() {
		return queueID;
	}
	public void setQueueID(String queueID) {
		this.queueID = queueID;
	}
	public String getQueueName() {
		return queueName;
	}
	public void setQueueName(String queueName) {
		this.queueName = queueName;
	}
	public int getMaxSize() {
		return maxSize;
	}
	public void setMaxSize(int maxSize) {
		this.maxSize = maxSize;
	}
	
	
}
