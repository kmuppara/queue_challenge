package com.dbs.hacktron.queuechallenge.component;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.dbs.hacktron.queuechallenge.vo.Message;
import com.dbs.hacktron.queuechallenge.vo.Queue;

@Component
public class MessageService implements BaseService{

	private List<Message> messageContainer = new ArrayList<Message>();

	@Override
	public String add(String qName, int maxSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(String qName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Queue> browse() {
		// TODO Auto-generated method stub
		return null;
	}


	private Queue getQueue(String queueName) {
		Queue queue = (Queue)queues.stream().filter(x -> x.getQueueName().equals(queueName));
		return queue;
	}

	
	public String addMessage(String qName, String msgContent) {
	
		try {
			Queue que = getQueue(qName);
			Message msg = new Message();
			msg.setContent(msgContent);
			que.getMessages().add(msg);
			return "Success";	
		}catch (Exception e) {
				System.out.println("Exception Occured while adding Message to queue" + e);
				return "failed";	
		}
		
	}
	
	public String remove() {
		return "";
	}	
}
