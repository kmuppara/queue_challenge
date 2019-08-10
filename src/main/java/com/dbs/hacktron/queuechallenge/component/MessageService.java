package com.dbs.hacktron.queuechallenge.component;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.dbs.hacktron.queuechallenge.vo.Message;

@Component
public class MessageService implements BaseService{

	private List<Message> messageContainer = new ArrayList<Message>();

	@Override
	public void add(Object obj) {
		if(null!= obj && obj instanceof Message) {
			if(null != messageContainer && !messageContainer.isEmpty()) {
				messageContainer = new ArrayList<Message>();
			}
			messageContainer.add((Message)obj);
		}
	}

	@Override
	public void remove(Object obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void browse(Object obj) {
		// TODO Auto-generated method stub
		
	}
	
	
}
