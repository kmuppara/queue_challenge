package com.dbs.hacktron.queuechallenge.vo;

import java.util.Date;

public class Message {

	private int msgID;
	private String content;
	private Date cretedDate;
	private String status;
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getMsgID() {
		return msgID;
	}
	public void setMsgID(int msgID) {
		this.msgID = msgID;
	}
	public Date getCretedDate() {
		return cretedDate;
	}
	public void setCretedDate(Date cretedDate) {
		this.cretedDate = cretedDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
